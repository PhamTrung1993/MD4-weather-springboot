package com.codegym.model;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Location {

    private int id;
    private String name_location;
    private double temperature;
    private String weather;

    public Location(int id, String name_location, double temperature, String weather) {
        this.id = id;
        this.name_location = name_location;
        this.temperature = temperature;
        this.weather = weather;
    }
}
