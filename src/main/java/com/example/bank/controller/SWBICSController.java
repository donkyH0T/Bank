package com.example.bank.controller;

import com.example.bank.entity.SWBICS;
import com.example.bank.service.impl.SWBICSService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SWBICSController {
    private final SWBICSService service;

    @Autowired
    public SWBICSController(SWBICSService service) {
        this.service = service;
    }

    @Tag(name = "SWBICS", description = "Операции с SWBICS")
    @GetMapping(value = "/swbics",
            produces = "application/json")
    public List<SWBICS> getAll(@RequestParam(defaultValue = "0") int page,
                               @RequestParam(defaultValue = "50") int size){
        return service.getAll(page, size);
    }

    @Tag(name = "SWBICS", description = "Операции с SWBICS")
    @GetMapping(
            value = "/swbics/{id}",
            produces = "application/json")
    public SWBICS getById(@PathVariable Long id){
        return service.getById(id);
    }

    @Tag(name = "SWBICS", description = "Операции с SWBICS")
    @PostMapping(
            value = "/swbics",
            produces = "application/json",
            consumes = "application/json")
    public SWBICS postSWBICS(@RequestBody SWBICS entity){
        return service.create(entity);
    }

    @Tag(name = "SWBICS", description = "Операции с SWBICS")
    @DeleteMapping(
            value = "/swbics/{id}",
            produces = "application/json")
    @ResponseBody
    public void deleteAccounts(@PathVariable Long id){
        service.remove(id);
    }
}
