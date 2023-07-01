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
    public List<ParticipantInfo> getAll(){
        return service.getAll();
    }

    @Tag(name = "ParticipantInfo", description = "Операции с ParticipantInfo")
    @GetMapping(
            value = "/participants/{id}",
            produces = "application/json")
    public ParticipantInfo getById(@PathVariable Long id){
        return service.getById(id);
    }

    @Tag(name = "ParticipantInfo", description = "Операции с ParticipantInfo")
    @PostMapping(
            value = "/participants",
            produces = "application/json",
            consumes = "application/json")
    public ParticipantInfo postParticipantInfo(@RequestBody ParticipantInfo entity){
        return service.create(entity);
    }


    @Tag(name = "ParticipantInfo", description = "Операции с ParticipantInfo")
    @PutMapping(
            value = "/participants/{id}",
            produces = "application/json",
            consumes = "application/json")
    public ParticipantInfo putParticipantInfo(@RequestBody ParticipantInfo entity, @PathVariable Long id){
        return service.update(entity, id);
    }

    @Tag(name = "ParticipantInfo", description = "Операции с ParticipantInfo")
    @DeleteMapping(
            value = "/participants/{id}",
            produces = "application/json")
    public void deleteParticipantInfo(@PathVariable Long id){
        service.remove(id);
    }
}
