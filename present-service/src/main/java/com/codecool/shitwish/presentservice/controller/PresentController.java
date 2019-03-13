package com.codecool.shitwish.presentservice.controller;

import com.codecool.shitwish.presentservice.model.Present;
import com.codecool.shitwish.presentservice.service.PresentStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PresentController {
    @Autowired
    private PresentStorage storage;

    @GetMapping("/getAll")
    public List<Present> getAll(){
        return storage.getAll();
    }

    @GetMapping("/getBy/{id}")
    public Present getById(@PathVariable("id") Integer id ){
        return storage.getById(id);
    }
}
