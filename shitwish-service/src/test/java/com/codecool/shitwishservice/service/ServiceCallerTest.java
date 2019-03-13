package com.codecool.shitwishservice.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
class ServiceCallerTest {
    @Autowired
    ServiceCaller serviceCaller;

    @Test
    void getPresents() {
        assertFalse(serviceCaller.getPresents().isEmpty());
    }

    @Test
    void getPresentById() {
        assertNotNull(serviceCaller.getPresentById(1));
    }
}