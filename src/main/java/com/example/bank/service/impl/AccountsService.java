package com.example.bank.service.impl;

import com.example.bank.entity.Accounts;
import com.example.bank.repository.AccountsRepository;
import com.example.bank.service.BankService;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@Schema(description = "Сервис для работы с Accounts")
public class AccountsService implements BankService<Accounts> {

    private final AccountsRepository accountsRepostitory;
    @Override
    public List<Accounts> getAll() {
        return accountsRepostitory.findAll().stream().toList();
    }

    @Override
    public Accounts getById(Long id) {
        return accountsRepostitory.findById(id).get();
    }

    @Override
    public boolean remove(Long id) {
        accountsRepostitory.deleteById(id);
        return accountsRepostitory.existsById(id);
    }

    @Override
    public Accounts create(Accounts entity) {
        return accountsRepostitory.save(entity);
    }

    @Override
    public Accounts update(Accounts entity, Long id) {
        return accountsRepostitory.findById(id)
                .map(accounts -> {
                    accounts.setAccount(entity.getAccount());
                    accounts.setCk(entity.getCk());
                    accounts.setAccountCBRBIC(entity.getAccountCBRBIC());
                    accounts.setAccountStatus(entity.getAccountStatus());
                    accounts.setDateIn(entity.getDateIn());
                    accounts.setRegulationAccountType(entity.getRegulationAccountType());
                    accounts.setAccRstrLists(entity.getAccRstrLists());
                    return accountsRepostitory.save(accounts);
                })
                .orElseGet(() -> {
                    entity.setId(id);
                    return accountsRepostitory.save(entity);
                });
    }
}
