package com.example.weather.demo.controller;

import com.example.weather.demo.service.LambdaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private LambdaService lambdaService;

    @GetMapping("/current")
    public String getCurrentWeather() {
        return lambdaService.invokeLambda("currentWeatherFunction", "{}");
    }

    @GetMapping("/weekly")
    public String getWeeklyForecast() {
        return lambdaService.invokeLambda("weeklyForecastFunction", "{}");
    }

    @GetMapping("/alerts")
    public String getWeatherAlerts() {
        return lambdaService.invokeLambda("alertsFunction", "{}");
    }

    @PostMapping("/send/weekly")
    public String postWeatherForecast() {
        return lambdaService.invokeLambda("alertsFunction", "{}");
    }

    @PostMapping("/send/alerts")
    public String postWeatherForecastAlerts() {
        return lambdaService.invokeLambda("alertsFunction", "{}");
    }
}
