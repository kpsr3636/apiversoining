package com.example.weather.demo.entity;

import jakarta.persistence.*;

@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String city;
    private String forecast;
    private String alert;
    @Column(name = "alert_type")
    private String alertType;
    private String alertLevel;
    private String alertDescription;
}
