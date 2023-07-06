package com.example.bank.service.impl;

import com.example.bank.entity.BICDirectoryEntry;
import com.example.bank.repository.BICDirectoryEntryRepository;
import com.example.bank.service.BankService;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Schema(description = "Сервис для работы с BICDirectoryEntry")
@Service
public class BICDirectoryService implements BankService<BICDirectoryEntry> {
    private final BICDirectoryEntryRepository repository;


    public BICDirectoryService(BICDirectoryEntryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<BICDirectoryEntry> getAll(int page,int size) {
        Pageable pageable = PageRequest.of(page, size);
        return repository.findAll(pageable).toList();
    }

    @Override
    public BICDirectoryEntry getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public boolean remove(Long id) {
        repository.deleteById(id);
        return repository.existsById(id);
    }

    @Override
    public BICDirectoryEntry create(BICDirectoryEntry entity) {
        return repository.save(entity);
    }

    @Override
    public BICDirectoryEntry update(BICDirectoryEntry entity, Long id) {
        return repository.findById(id)
                .map(entry -> {
                    entry.setBic(entity.getBic());
                    entry.setParticipantInfo(entity.getParticipantInfo());
                    entry.setAccounts(entity.getAccounts());
                    entry.setSwbics(entity.getSwbics());
                    return repository.save(entry);
                })
                .orElseGet(() -> {
                    entity.setId(id);
                    return repository.save(entity);
                });
    }
}
