package com.example.bank.controller;

import com.example.bank.entity.Accounts;
import com.example.bank.service.impl.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountsRestController{

    final AccountsService accountsService;

    @Autowired
    public AccountsRestController(AccountsService accountsService) {
        this.accountsService = accountsService;
    }

    /*@GetMapping()
    public ResponseEntity<List<Accounts>> getAll(){

    }

    @GetMapping()
    public ResponseEntity<List<Accounts>> getById(Long id){

    }

    @PostMapping()
    public ResponseEntity<List<Accounts>> postAccounts(@RequestBody Accounts entity,Long id){

    }


    @PutMapping()
    public ResponseEntity<List<Accounts>> putAccounts(@RequestBody Accounts entity,Long id){

    }*/

    @DeleteMapping()
    public ResponseEntity<List<Accounts>> deleteAccounts(Long id){

        return ResponseEntity.ok(new ArrayList<>());
    }

}
