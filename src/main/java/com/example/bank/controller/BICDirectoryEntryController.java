package com.example.bank.controller;

import com.example.bank.entity.BICDirectoryEntry;
import com.example.bank.service.impl.BICDirectoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
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

    @Tag(name = "BICDirectoryEntry", description = "Операции с BICDirectoryEntry")
    @GetMapping(value = "/bic_directory_entries",
            produces = "application/json")
    public ResponseEntity<List<BICDirectoryEntry>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @Tag(name = "BICDirectoryEntry", description = "Операции с BICDirectoryEntry")
    @GetMapping(
            value = "bic_directory_entries/{id}",
            produces = "application/json")
    public ResponseEntity<BICDirectoryEntry> getById(@PathVariable Long id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @Tag(name = "BICDirectoryEntry", description = "Операции с BICDirectoryEntry")
    @PostMapping(
            value = "/bic_directory_entries",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<BICDirectoryEntry> postAccounts(@RequestBody BICDirectoryEntry entity){
        return new ResponseEntity<>(service.create(entity), HttpStatus.CREATED);
    }


    @Tag(name = "BICDirectoryEntry", description = "Операции с BICDirectoryEntry")
    @PutMapping(
            value = "/bic_directory_entries/{id}",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<BICDirectoryEntry> putAccounts(@RequestBody BICDirectoryEntry entity, @PathVariable Long id){
        return new ResponseEntity<>(service.update(entity, id), HttpStatus.OK);
    }

    @Tag(name = "BICDirectoryEntry", description = "Операции с BICDirectoryEntry")
    @DeleteMapping(
            value = "/bic_directory_entries/{id}",
            produces = "application/json")
    public ResponseEntity<List<BICDirectoryEntry>> deleteAccounts(@PathVariable Long id){
        if(!service.remove(id)) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }
}
