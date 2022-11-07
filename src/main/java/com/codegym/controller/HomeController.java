package com.codegym.controller;

import com.codegym.model.Location;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class HomeController {
    @GetMapping("/{username}/{password}/weather")
    public ResponseEntity<Location> getWeather(@PathVariable String username, @PathVariable String password) {
        return new ResponseEntity<Location>(new Location(1, "Hanoi", 20.0, "rain"), HttpStatus.OK);
    }
}
