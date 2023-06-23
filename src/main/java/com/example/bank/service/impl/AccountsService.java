package com.example.bank.service.impl;

import com.example.bank.dto.AccountDTO;
import com.example.bank.service.BankService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class AccountsService extends BankService<AccountDTO> {
    @Override
    public List<AccountDTO> getAll() {
        return null;
    }

    @Override
    public AccountDTO getById(Long id) {
        return null;
    }

    @Override
    public AccountDTO deleteEntity(Long id) {
        return null;
    }

    @Override
    public AccountDTO postEntity(AccountDTO entity, Long id) {
        return null;
    }

    @Override
    public AccountDTO putEntity(AccountDTO entity, Long id) {
        return null;
    }
}
