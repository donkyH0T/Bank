package com.example.bank.controller;

import com.example.bank.entity.ED807;
import com.example.bank.service.impl.ED807Service;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ED807Controller {
    @Autowired
    private ED807Service ed807Service;

    @Tag(name = "ED807", description = "Операции с ED807")
    @GetMapping("/ed807")
    public List<ED807> getAll(){
        return ed807Service.getAll();
    }

    @Tag(name = "ED807", description = "Операции с ED807")
    @GetMapping("/ed807/{id}")
    public ED807 getById(@PathVariable Long id){
        return ed807Service.getById(id);
    }

    @Tag(name = "ED807", description = "Операции с ED807")
    @DeleteMapping("/ed807/{id}")
    public void deleteED807(@PathVariable Long id){
        ed807Service.remove(id);
    }

}
