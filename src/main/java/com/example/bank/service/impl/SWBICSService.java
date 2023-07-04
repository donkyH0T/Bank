package com.example.bank.service.impl;

import com.example.bank.entity.SWBICS;
import com.example.bank.repository.SWBICSRepository;
import com.example.bank.service.BankService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SWBICSService implements BankService<SWBICS> {
    private final SWBICSRepository repository;

    public SWBICSService(SWBICSRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<SWBICS> getAll() {
        return repository.findAll().stream().toList();
    }

    @Override
    public SWBICS getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public boolean remove(Long id) {
        repository.deleteById(id);
        return repository.existsById(id);
    }

    @Override
    public SWBICS create(SWBICS entity) {
        return repository.save(entity);
    }

    @Override
    public SWBICS update(SWBICS entity, Long id) {
        return null;
    }
}
