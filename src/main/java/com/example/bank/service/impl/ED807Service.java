package com.example.bank.service.impl;

import com.example.bank.entity.BankData;
import com.example.bank.entity.ED807;
import com.example.bank.repository.BankDataRepository;
import com.example.bank.repository.ED807Repository;
import com.example.bank.service.BankService;
import com.example.bank.xmlEntity.ED807Type;
import lombok.Data;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

@Service
@Data
public class ED807Service implements BankService {
    private final BankDataRepository bankDataRepository;
    private final ED807Repository ed807Repository;
    private final ED807MapperImpl ed807Mapper;

    @Autowired
    protected ED807Service(BankDataRepository bankDataRepository, ED807Repository ed807Repository, ED807MapperImpl ed807Mapper) {
        this.bankDataRepository = bankDataRepository;
        this.ed807Repository = ed807Repository;
        this.ed807Mapper = ed807Mapper;
    }

    @SneakyThrows
    @Override
    public BankData saveToBd(MultipartFile file){
        byte[] bytes = file.getBytes();
        BankData bankData=new BankData(bytes);
        bankDataRepository.save(bankData);
        return bankData;
    }
    @SneakyThrows
    @Override
    public BankData parseFromXml(MultipartFile file,BankData bankData){

        JAXBContext context = JAXBContext.newInstance(com.example.bank.xmlEntity.ObjectFactory.class.getPackage().getName());
        Unmarshaller unmarshaller = context.createUnmarshaller();
       JAXBElement<ED807Type> ed807TypeJAXBElement = (JAXBElement<ED807Type>) unmarshaller.unmarshal(file.getInputStream());

        ED807 ed807=ed807Mapper.toED807(ed807TypeJAXBElement.getValue());
        bankData.setEd807(ed807);
        return  bankDataRepository.saveAndFlush(bankData);
    }
    public ResponseEntity<BankData> processData(MultipartFile file){
        BankData bankData=saveToBd(file);
        return ResponseEntity.ok(parseFromXml(file,bankData));
    }



}
