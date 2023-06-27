package com.example.bank.service.impl;

import com.example.bank.entity.SWBICS;
import com.example.bank.service.BankService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SWBICSService implements BankService<SWBICS> {
    @Override
    public List<SWBICS> getAll() {
        return null;
    }

    @Override
    public SWBICS getById(Long id) {
        return null;
    }

    @Override
    public boolean remove(Long id) {
        return false;
    }

    @Override
    public SWBICS create(SWBICS entity) {
        return null;
    }

    @Override
    public SWBICS update(SWBICS entity, Long id) {
        return null;
    }
}
