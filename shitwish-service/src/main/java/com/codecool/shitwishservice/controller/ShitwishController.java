package com.codecool.shitwishservice.controller;

import com.codecool.shitwish.presentservice.model.Present;
import com.codecool.shitwishservice.service.ServiceCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShitwishController {
    @Autowired
    private ServiceCaller serviceCaller;

    @GetMapping("/presents")
    public List<Present> getAll(){
        return serviceCaller.getPresents();
    }

    @GetMapping("/present/{id}")
    public Present getAll(@PathVariable Integer id){
        return serviceCaller.getPresentById(id);
    }
}
