package com.example.bank.controller;

import com.example.bank.entity.BankData;
import com.example.bank.service.impl.ED807Service;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.SneakyThrows;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;



@RestController
public class IndexRestController {
    private static final Logger logger = LogManager.getLogger(IndexRestController.class);
    private final ED807Service ed807Service;
    @Autowired
    protected IndexRestController(ED807Service ed807Service) {
        this.ed807Service = ed807Service;
    }


    @PostMapping("/upload")
    @SneakyThrows
    @Tag(name = "UploadFIle", description = "Парсит и импортирует в бд из xml")
    public ResponseEntity<BankData> uploadFile(@RequestParam("file") MultipartFile file) {

        ResponseEntity<BankData> response;
        try{
            response=ed807Service.processData(file);
            logger.info("upload file in bd");
            return  response;
        }catch (Exception e){
            logger.error("Runtime error", e);
            return null;
        }
    }
}
