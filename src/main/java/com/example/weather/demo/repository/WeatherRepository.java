package com.example.weather.demo.repository;

import com.example.weather.demo.entity.Weather;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<Weather, Long> {
}

