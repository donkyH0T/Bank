package com.example.bank.service.impl;

import com.example.bank.entity.BankData;
import com.example.bank.repository.BankDataRepository;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Schema(description = "Сервис для работы с BankData")
public class BankDataService{

    private final BankDataRepository repository;

    public BankDataService(BankDataRepository repository) {
        this.repository = repository;
    }

    public List<BankData> getAll() {
        return repository.findAll().stream().toList();
    }

    public BankData getById(Long id) {
        return repository.findById(id).get();
    }

    public boolean remove(Long id) {
        repository.deleteById(id);
        return repository.existsById(id);
    }
}
