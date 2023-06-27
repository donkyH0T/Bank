package com.example.bank.controller;

import com.example.bank.entity.Accounts;
import com.example.bank.entity.SWBICS;
import com.example.bank.service.impl.AccountsService;
import com.example.bank.service.impl.SWBICSService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SWBICSController {
    private final SWBICSService service;

    @Autowired
    public SWBICSController(SWBICSService service) {
        this.service = service;
    }

    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @GetMapping(value = "/swbics",
            produces = "application/json")
    public ResponseEntity<List<SWBICS>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @GetMapping(
            value = "/swbics/{id}",
            produces = "application/json")
    public ResponseEntity<SWBICS> getById(@PathVariable Long id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @PostMapping(
            value = "/swbics",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<SWBICS> postAccounts(@RequestBody SWBICS entity){
        return new ResponseEntity<>(service.create(entity), HttpStatus.CREATED);
    }


    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @PutMapping(
            value = "/swbics/{id}",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<SWBICS> putAccounts(@RequestBody SWBICS entity, @PathVariable Long id){
        return new ResponseEntity<>(service.update(entity, id), HttpStatus.OK);
    }

    @Tag(name = "Accounts", description = "Операции со аккаунтами")
    @DeleteMapping(
            value = "/swbics/{id}",
            produces = "application/json")
    public ResponseEntity<List<SWBICS>> deleteAccounts(@PathVariable Long id){
        if(!service.remove(id)) return new ResponseEntity<>(HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
}
