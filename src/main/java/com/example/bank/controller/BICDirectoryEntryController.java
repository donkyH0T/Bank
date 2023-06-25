package com.example.bank.controller;

import com.example.bank.entity.BICDirectoryEntry;
import com.example.bank.entity.ParticipantInfo;
import com.example.bank.service.impl.BICDirectoryService;
import com.example.bank.service.impl.ParticipantInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BICDirectoryEntryController {
    private final BICDirectoryService service;

    @Autowired
    public BICDirectoryEntryController(BICDirectoryService service) {
        this.service = service;
    }

    @GetMapping(value = "/bic_directory_entries",
            produces = "application/json")
    public ResponseEntity<List<BICDirectoryEntry>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping(
            value = "bic_directory_entries/{id}",
            produces = "application/json")
    public ResponseEntity<BICDirectoryEntry> getById(@PathVariable Long id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @PostMapping(
            value = "/bic_directory_entries",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<BICDirectoryEntry> postAccounts(@RequestBody BICDirectoryEntry entity){
        return new ResponseEntity<>(service.create(entity), HttpStatus.CREATED);
    }


    @PutMapping(
            value = "/bic_directory_entries/{id}",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<BICDirectoryEntry> putAccounts(@RequestBody BICDirectoryEntry entity, @PathVariable Long id){
        return new ResponseEntity<>(service.update(entity, id), HttpStatus.OK);
    }

    @DeleteMapping(
            value = "/bic_directory_entries/{id}",
            produces = "application/json")
    public ResponseEntity<List<BICDirectoryEntry>> deleteAccounts(@PathVariable Long id){
        if(!service.remove(id)) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }
}
