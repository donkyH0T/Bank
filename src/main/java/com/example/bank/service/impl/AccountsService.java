package com.example.bank.service.impl;

import com.example.bank.dto.AccountDTO;
import com.example.bank.service.BankService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class AccountsService implements BankService<AccountDTO> {
    @Override
    public List<AccountDTO> getAll() {
        return null;
    }

    @Override
    public AccountDTO getById(Long id) {
        return null;
    }

    @Override
    public AccountDTO remove(Long id) {
        return null;
    }

    @Override
    public AccountDTO create(AccountDTO entity, Long id) {
        return null;
    }

    @Override
    public AccountDTO update(AccountDTO entity, Long id) {
        return null;
    }
}
