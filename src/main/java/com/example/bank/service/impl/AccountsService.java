package com.example.bank.service.impl;

import com.example.bank.entity.Accounts;
import com.example.bank.repository.AccountsRepository;
import com.example.bank.service.BankService;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Schema(description = "Сервис для работы с Accounts")
public class AccountsService implements BankService<Accounts> {

    private final AccountsRepository repository;

    public AccountsService(AccountsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Accounts> getAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return repository.findAll(pageable).toList();
    }

    @Override
    public Accounts getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public boolean remove(Long id) {
        repository.deleteById(id);
        return repository.existsById(id);
    }

    @Override
    public Accounts create(Accounts entity) {
        return repository.save(entity);
    }

    @Override
    public Accounts update(Accounts entity, Long id) {
        return repository.findById(id)
                .map(accounts -> {
                    accounts.setAccount(entity.getAccount());
                    accounts.setCk(entity.getCk());
                    accounts.setAccountCBRBIC(entity.getAccountCBRBIC());
                    accounts.setAccountStatus(entity.getAccountStatus());
                    accounts.setDateIn(entity.getDateIn());
                    accounts.setRegulationAccountType(entity.getRegulationAccountType());
                    accounts.setAccRstrLists(entity.getAccRstrLists());
                    return repository.save(accounts);
                })
                .orElseGet(() -> {
                    entity.setId(id);
                    return repository.save(entity);
                });
    }
}
