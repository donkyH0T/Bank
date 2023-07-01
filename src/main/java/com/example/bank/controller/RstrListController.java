package com.example.bank.controller;

import com.example.bank.entity.RstrList;
import com.example.bank.service.impl.RstrListService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RstrListController {

    private final RstrListService service;

    public RstrListController(RstrListService service) {
        this.service = service;
    }

    @Tag(name = "RstrList", description = "Операции с RstrList")
    @GetMapping(value = "/rstr_list",
            produces = "application/json")
    public List<RstrList> getAll(){
        return service.getAll();
    }

    @Tag(name = "RstrList", description = "Операции с RstrList")
    @GetMapping(
            value = "/rstr_list/{id}",
            produces = "application/json")
    public RstrList getById(@PathVariable Long id){
        return service.getById(id);
    }

    @Tag(name = "RstrList", description = "Операции с RstrList")
    @PostMapping(
            value = "/rstr_list",
            produces = "application/json",
            consumes = "application/json")
    public RstrList postRstrList(@RequestBody RstrList entity){
        return service.create(entity);
    }

    @Tag(name = "RstrList", description = "Операции с RstrList")
    @DeleteMapping(
            value = "/rstr_list/{id}",
            produces = "application/json")
    @ResponseBody
    public void deleteRstrList(@PathVariable Long id){
        service.remove(id);
    }
}
