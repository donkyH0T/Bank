package com.example.bank.service.impl;

import com.example.bank.entity.AccRstrList;
import com.example.bank.repository.AccRstrListRepository;
import com.example.bank.service.BankService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccRstrListService implements BankService<AccRstrList> {
    private final AccRstrListRepository repository;

    public AccRstrListService(AccRstrListRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<AccRstrList> getAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return repository.findAll(pageable).toList();
    }

    @Override
    public AccRstrList getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public boolean remove(Long id) {
        repository.deleteById(id);
        return repository.existsById(id);
    }

    @Override
    public AccRstrList create(AccRstrList entity) {
        return repository.save(entity);
    }

    @Override
    public AccRstrList update(AccRstrList entity, Long id) {
        return null;
    }
}
