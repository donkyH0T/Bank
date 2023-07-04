package com.example.bank.controller;

import com.example.bank.entity.Accounts;
import com.example.bank.service.impl.AccountsService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountsController{

    private final AccountsService service;

    @Autowired
    public AccountsController(AccountsService service) {
        this.service = service;
    }

    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @GetMapping(value = "/accounts",
            produces = "application/json")
    public List<Accounts> getAll(){
        return service.getAll();
    }

    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @GetMapping(
            value = "/accounts/{id}",
            produces = "application/json")
    public Accounts getById(@PathVariable Long id){
        return service.getById(id);
    }

    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @PostMapping(
            value = "/accounts",
            produces = "application/json",
            consumes = "application/json")
    public Accounts postAccounts(@RequestBody Accounts entity){
        return service.create(entity);
    }


    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @PutMapping(
            value = "/accounts/{id}",
            produces = "application/json",
            consumes = "application/json")
    public Accounts putAccounts(@RequestBody Accounts entity, @PathVariable Long id){
        return service.update(entity, id);
    }

    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @DeleteMapping(
            value = "/accounts/{id}",
            produces = "application/json")
    @ResponseBody
    public void deleteAccounts(@PathVariable Long id){
        service.remove(id);
    }
}
