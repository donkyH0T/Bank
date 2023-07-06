package com.example.bank.controller;

import com.example.bank.entity.BankData;
import com.example.bank.service.impl.BankDataService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankDataController {
    @Autowired
    private BankDataService bankDataService;

    @Tag(name = "BankData", description = "Операции с BankData")
    @GetMapping("/BankData")
    public List<BankData> getAll(){
        return bankDataService.getAll();
    }

    @Tag(name = "BankData", description = "Операции с BankData")
    @GetMapping("/BankData/{id}")
    public BankData getById(@PathVariable Long id){
        return bankDataService.getById(id);
    }

    @Tag(name = "BankData", description = "Операции с BankData")
    @DeleteMapping("/BankData/{id}")
    public void deleteBankData(@PathVariable Long id){
        bankDataService.remove(id);
    }
}
