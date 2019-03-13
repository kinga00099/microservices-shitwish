package com.codecool.shitwishservice.service;

import com.codecool.shitwish.presentservice.model.Present;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ServiceCaller {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${presentservice.url}")
    private String presentUrl;

    @RequestMapping
    public List<Present> getPresents() {
        ResponseEntity<List<Present>> response = restTemplate.exchange(
                presentUrl + "/getAll",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Present>>() {
                });
        return response.getBody();
    }

    @RequestMapping
    public Present getPresentById(Integer id){
        return restTemplate.getForEntity(presentUrl + "/getBy/" + id, Present.class).getBody();
    }
}
