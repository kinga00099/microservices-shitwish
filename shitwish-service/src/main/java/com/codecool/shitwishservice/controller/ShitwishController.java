package com.codecool.shitwishservice.controller;

import com.codecool.shitwish.cartservice.model.*;
import com.codecool.shitwish.presentservice.model.Present;
import com.codecool.shitwishservice.service.ServiceCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/cart")
    public Cart getCart(){
        return serviceCaller.getCart();
    }

    @PostMapping("/cart")
    public String addToCart(@RequestBody Present present) {
        serviceCaller.addToCart(present);
        return "Success.";
    }

    @PutMapping("/cart/{id}")
    public String subtractFromCart(@PathVariable Integer id) {
        serviceCaller.subtractFromCart(id);
        return "Success.";
    }

    @DeleteMapping("/cart/{id}")
    public String deleteFromCart(@PathVariable Integer id) {
        serviceCaller.deleteFromCart(id);
        return "Success.";
    }
}
