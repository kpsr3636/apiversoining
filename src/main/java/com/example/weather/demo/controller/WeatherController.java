package com.example.weather.demo.controller;

import com.example.weather.demo.service.LambdaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    @DeleteMapping("/delete")
    public String postWeatherForecastAlertsDelete() {
        return lambdaService.invokeLambda("alertsFunction", "{}");
    }

    @DeleteMapping("/delete/aletrs")
    public String postWeatherForecastAlertsDeleteAletrs() {
        return lambdaService.invokeLambda("alertsFunction", "{}");
    }

    @PutMapping("/update/aletrs")
    public String updateWeatherForecastAlerts() {
        return lambdaService.invokeLambda("alertsFunction", "{}");
    }

    @PutMapping("/update/weekly")
    public String updateWeatherForecastWeekly() {
        return lambdaService.invokeLambda("alertsFunction", "{}");
    }

    @DeleteMapping("/update/weekly")
    public String deleteWeatherForecastWeekly() {
        return lambdaService.invokeLambda("alertsFunction", "{}");
    }
}
