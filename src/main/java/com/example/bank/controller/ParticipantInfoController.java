package com.example.bank.controller;

import com.example.bank.entity.ParticipantInfo;
import com.example.bank.service.impl.ParticipantInfoService;
import io.swagger.v3.oas.annotations.tags.Tag;
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

    @Tag(name = "ParticipantInfo", description = "Операции с ParticipantInfo")
    @GetMapping(value = "/participants",
            produces = "application/json")
    public ResponseEntity<List<ParticipantInfo>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @Tag(name = "ParticipantInfo", description = "Операции с ParticipantInfo")
    @GetMapping(
            value = "/participants/{id}",
            produces = "application/json")
    public ResponseEntity<ParticipantInfo> getById(@PathVariable Long id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @Tag(name = "ParticipantInfo", description = "Операции с ParticipantInfo")
    @PostMapping(
            value = "/participants",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<ParticipantInfo> postAccounts(@RequestBody ParticipantInfo entity){
        return new ResponseEntity<>(service.create(entity), HttpStatus.CREATED);
    }


    @Tag(name = "ParticipantInfo", description = "Операции с ParticipantInfo")
    @PutMapping(
            value = "/participants/{id}",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<ParticipantInfo> putAccounts(@RequestBody ParticipantInfo entity, @PathVariable Long id){
        return new ResponseEntity<>(service.update(entity, id), HttpStatus.OK);
    }

    @Tag(name = "ParticipantInfo", description = "Операции с ParticipantInfo")
    @DeleteMapping(
            value = "/participants/{id}",
            produces = "application/json")
    public ResponseEntity<List<ParticipantInfo>> deleteAccounts(@PathVariable Long id){
        if(!service.remove(id)) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }
}
