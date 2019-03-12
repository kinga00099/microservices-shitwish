package com.codecool.shitwish.presentservice.service;

import com.codecool.shitwish.presentservice.model.Present;
import com.codecool.shitwish.presentservice.repository.PresentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PresentStorage {

    @Autowired
    private PresentRepository presentRepository;

    public List<Present> getAll() {

        return presentRepository.findAll();
    }

    public Present getById (Integer id) {

        return presentRepository.findById(id).orElse(null);
    }



}
