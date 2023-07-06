package com.example.bank.service.impl;

import com.example.bank.entity.BankData;
import com.example.bank.repository.BankDataRepository;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Schema(description = "Сервис для работы с BankData")
public class BankDataService{

    @Autowired
    private BankDataRepository bankDataRepository;

    public List<BankData> getAllWithPagination(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return bankDataRepository.findAll(pageable).toList();
    }

    public BankData getById(Long id) {
        return bankDataRepository.findById(id).get();
    }

    public boolean remove(Long id) {
        return bankDataRepository.existsById(id);
    }
}
