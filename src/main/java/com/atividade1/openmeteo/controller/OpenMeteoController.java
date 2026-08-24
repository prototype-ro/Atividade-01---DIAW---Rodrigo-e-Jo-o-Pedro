package com.atividade1.openmeteo.controller;

import com.atividade1.openmeteo.service.OpenMeteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenMeteoController {
    @Autowired
    OpenMeteoService openMeteoService = new OpenMeteoService();

    @GetMapping("/belohorizonteWeather")
    public String getBeloHorizonteWeather(){
        return openMeteoService.getWeatherByLatitude("-19.92","-43.94");
    }
}
