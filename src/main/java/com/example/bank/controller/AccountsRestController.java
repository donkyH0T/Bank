package com.example.bank.controller;

import com.example.bank.entity.Accounts;
import com.example.bank.service.impl.AccountsService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountsRestController{

    private final AccountsService service;

    @Autowired
    public AccountsRestController(AccountsService service) {
        this.service = service;
    }

    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @GetMapping(value = "/accounts",
            produces = "application/json")
    public ResponseEntity<List<Accounts>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @GetMapping(
            value = "/accounts/{id}",
            produces = "application/json")
    public ResponseEntity<Accounts> getById(@PathVariable Long id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @PostMapping(
            value = "/accounts",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<Accounts> postAccounts(@RequestBody Accounts entity){
        return new ResponseEntity<>(service.create(entity), HttpStatus.CREATED);
    }


    // TODO исправить изменение сущности (выкидывает
    //  A collection with cascade="all-delete-orphan" was no longer referenced by the owning entity instance:
    //  com.example.bank.entity.Accounts.accRstrLists)
    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @PutMapping(
            value = "/accounts/{id}",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<Accounts> putAccounts(@RequestBody Accounts entity, @PathVariable Long id){
        return new ResponseEntity<>(service.update(entity, id), HttpStatus.OK);
    }

    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @DeleteMapping(
            value = "/accounts/{id}",
            produces = "application/json")
    public ResponseEntity<List<Accounts>> deleteAccounts(@PathVariable Long id){
        if(!service.remove(id)) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }

}
