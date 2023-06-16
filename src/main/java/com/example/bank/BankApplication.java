package com.example.bank;


import com.example.bank.entity.ED807;
import com.example.bank.repository.ED807Repository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.core.io.ClassPathResource;

import java.io.Console;
import java.io.StringReader;

@SpringBootApplication
public class BankApplication {


    @Autowired
    static
    ED807Repository ed807Repository;

    @SneakyThrows
    public static void main(String[] args){
        SpringApplication.run(BankApplication.class, args);
        ClassPathResource reader = new ClassPathResource("/20220630_ED807_full.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(ED807.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        ED807 ed807 = (ED807) unmarshaller.unmarshal(reader.getURL());
//        ed807.setId(1L);
        System.out.println(ed807);
//        ed807Repository.saveAndFlush(ed807);



    }



}
