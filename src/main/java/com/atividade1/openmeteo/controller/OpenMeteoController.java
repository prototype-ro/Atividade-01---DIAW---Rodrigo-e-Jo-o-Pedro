package com.atividade1.openmeteo.controller;

import com.atividade1.openmeteo.service.OpenMeteoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenMeteoController {
    OpenMeteoService openMeteoService = new OpenMeteoService();

    @GetMapping("/belohorizonteWeather")
    public String getBeloHorizonteWeather(){
        return openMeteoService.getWeatherByLatitude("-19.92","-43.94");
    }
}
