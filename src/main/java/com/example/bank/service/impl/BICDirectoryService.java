package com.example.bank.service.impl;

import com.example.bank.entity.BICDirectoryEntry;
import com.example.bank.service.BankService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BICDirectoryService implements BankService<BICDirectoryEntry> {
    @Override
    public List<BICDirectoryEntry> getAll() {
        return null;
    }

    @Override
    public BICDirectoryEntry getById(Long id) {
        return null;
    }

    @Override
    public boolean remove(Long id) {
        return false;
    }

    @Override
    public BICDirectoryEntry create(BICDirectoryEntry entity) {
        return null;
    }

    @Override
    public BICDirectoryEntry update(BICDirectoryEntry entity, Long id) {
        return null;
    }
}
