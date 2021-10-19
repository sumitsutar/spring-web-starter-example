package com.github.sumitsutar.exercises.spingwebstarterexample.rest;

import com.github.sumitsutar.exercises.spingwebstarterexample.api.Car;
import com.github.sumitsutar.exercises.spingwebstarterexample.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping("/getAllCars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

}
