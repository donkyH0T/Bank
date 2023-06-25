package com.example.bank.controller;

import com.example.bank.entity.Accounts;
import com.example.bank.service.impl.AccountsService;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountsRestController{

    private final AccountsService service;

    @Autowired
    public AccountsRestController(AccountsService service) {
        this.service = service;
    }

    @GetMapping(value = "/accounts",
            produces = "application/json")
    public ResponseEntity<List<Accounts>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping(
            value = "/accounts/{id}",
            produces = "application/json")
    public ResponseEntity<Accounts> getById(@PathVariable Long id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

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
    @PutMapping(
            value = "/accounts/{id}",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<Accounts> putAccounts(@RequestBody Accounts entity, @PathVariable Long id){
        return new ResponseEntity<>(service.update(entity, id), HttpStatus.OK);
    }

    @DeleteMapping(
            value = "/accounts/{id}",
            produces = "application/json")
    public ResponseEntity<List<Accounts>> deleteAccounts(@PathVariable Long id){
        if(!service.remove(id)) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }

}
