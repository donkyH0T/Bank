package com.example.bank.service.impl;

import com.example.bank.entity.RstrList;
import com.example.bank.repository.RstrListRepository;
import com.example.bank.service.BankService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RstrListService implements BankService<RstrList> {

    private final RstrListRepository repository;

    public RstrListService(RstrListRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<RstrList> getAll() {
        return repository.findAll().stream().toList();
    }

    @Override
    public RstrList getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public boolean remove(Long id) {
        repository.deleteById(id);
        return repository.existsById(id);
    }

    @Override
    public RstrList create(RstrList entity) {
        return repository.save(entity);
    }

    @Override
    public RstrList update(RstrList entity, Long id) {
        return null;
    }
}
