package com.example.bank.controller;

import com.example.bank.entity.BankData;
import com.example.bank.service.impl.ED807Service;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.validation.constraints.Size;

@RestController
public class IndexRestController {
    private final ED807Service ed807Service;
    @Autowired
    protected IndexRestController(ED807Service ed807Service) {
        this.ed807Service = ed807Service;
    }

    @PostMapping("/upload")
    @SneakyThrows
    public ResponseEntity<BankData> uploadFile(@RequestParam("file") @Size(max = 10485760) MultipartFile file) {
       return ed807Service.processData(file);
    }
}
