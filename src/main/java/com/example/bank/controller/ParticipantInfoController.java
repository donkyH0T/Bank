package com.example.bank.controller;

import com.example.bank.entity.Accounts;
import com.example.bank.entity.ParticipantInfo;
import com.example.bank.service.impl.AccountsService;
import com.example.bank.service.impl.ParticipantInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParticipantInfoController {
    private final ParticipantInfoService service;

    @Autowired
    public ParticipantInfoController(ParticipantInfoService service) {
        this.service = service;
    }

    @GetMapping(value = "/participants",
            produces = "application/json")
    public ResponseEntity<List<ParticipantInfo>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping(
            value = "/participants/{id}",
            produces = "application/json")
    public ResponseEntity<ParticipantInfo> getById(@PathVariable Long id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @PostMapping(
            value = "/participants",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<ParticipantInfo> postAccounts(@RequestBody ParticipantInfo entity){
        return new ResponseEntity<>(service.create(entity), HttpStatus.CREATED);
    }


    @PutMapping(
            value = "/participants/{id}",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<ParticipantInfo> putAccounts(@RequestBody ParticipantInfo entity, @PathVariable Long id){
        return new ResponseEntity<>(service.update(entity, id), HttpStatus.OK);
    }

    @DeleteMapping(
            value = "/participants/{id}",
            produces = "application/json")
    public ResponseEntity<List<ParticipantInfo>> deleteAccounts(@PathVariable Long id){
        if(!service.remove(id)) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }
}
