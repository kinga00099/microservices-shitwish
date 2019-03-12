package com.codecool.shitwishservice.controller;

import com.codecool.shitwishservice.service.ServiceCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShitwishController {
    @Autowired
    private ServiceCaller serviceCaller;
}
