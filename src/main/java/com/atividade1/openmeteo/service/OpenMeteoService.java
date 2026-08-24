package com.atividade1.openmeteo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenMeteoService {
    private String searchEndpoint(String url){
        String data = "";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity =restTemplate.getForEntity(url, String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()){
            data = responseEntity.getBody();
        }else {
            data = "Failed to load data: " + responseEntity.getStatusCode();
        }
        return  data;
    }

    public String getWeatherByLatitude(String latitude, String longitude){
        return searchEndpoint("https://api.open-meteo.com/v1/forecast?latitude="+latitude+"&longitude="+longitude);
    }
}
