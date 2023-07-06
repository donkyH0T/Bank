package com.example.bank.controller;

import com.example.bank.entity.BICDirectoryEntry;
import com.example.bank.service.impl.BICDirectoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<BICDirectoryEntry> getAll(@RequestParam(defaultValue = "0") int page,
                                          @RequestParam(defaultValue = "50") int size){
        return service.getAll(page,size);
    }

    @Tag(name = "BICDirectoryEntry", description = "Операции с BICDirectoryEntry")
    @GetMapping(
            value = "bic_directory_entries/{id}",
            produces = "application/json")
    public BICDirectoryEntry getById(@PathVariable Long id){
        return service.getById(id);
    }

    @Tag(name = "BICDirectoryEntry", description = "Операции с BICDirectoryEntry")
    @PostMapping(
            value = "/bic_directory_entries",
            produces = "application/json",
            consumes = "application/json")
    public BICDirectoryEntry postBIC(@RequestBody BICDirectoryEntry entity){
        return service.create(entity);
    }


    @Tag(name = "BICDirectoryEntry", description = "Операции с BICDirectoryEntry")
    @PutMapping(
            value = "/bic_directory_entries/{id}",
            produces = "application/json",
            consumes = "application/json")
    public BICDirectoryEntry putBIC(@RequestBody BICDirectoryEntry entity, @PathVariable Long id){
        return service.update(entity, id);
    }

    @Tag(name = "BICDirectoryEntry", description = "Операции с BICDirectoryEntry")
    @DeleteMapping(
            value = "/bic_directory_entries/{id}",
            produces = "application/json")
    public void deleteBIC(@PathVariable Long id){
        service.remove(id);
    }
}
