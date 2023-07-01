package com.example.bank.controller;

import com.example.bank.entity.AccRstrList;
import com.example.bank.entity.BICDirectoryEntry;
import com.example.bank.service.impl.AccRstrListService;
import com.example.bank.service.impl.BICDirectoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccRstrListController {
    private final AccRstrListService service;

    @Autowired
    public AccRstrListController(AccRstrListService service) {
        this.service = service;
    }

    @Tag(name = "AccRstrList", description = "Операции с AccRstrList")
    @GetMapping(value = "/acc_rstr_list",
            produces = "application/json")
    public List<AccRstrList> getAll(){
        return service.getAll();
    }

    @Tag(name = "AccRstrList", description = "Операции с AccRstrList")
    @GetMapping(
            value = "acc_rstr_list/{id}",
            produces = "application/json")
    public AccRstrList getById(@PathVariable Long id){
        return service.getById(id);
    }

    @Tag(name = "AccRstrList", description = "Операции с AccRstrList")
    @PostMapping(
            value = "/acc_rstr_list",
            produces = "application/json",
            consumes = "application/json")
    public AccRstrList postAccRstrList(@RequestBody AccRstrList entity){
        return service.create(entity);
    }


    @Tag(name = "AccRstrList", description = "Операции с AccRstrList")
    @DeleteMapping(
            value = "/acc_rstr_list/{id}",
            produces = "application/json")
    public void deleteAccRstrList(@PathVariable Long id){
        service.remove(id);
    }
}
