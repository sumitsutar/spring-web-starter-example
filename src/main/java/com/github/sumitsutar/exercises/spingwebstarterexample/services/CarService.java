package com.github.sumitsutar.exercises.spingwebstarterexample.services;

import com.github.sumitsutar.exercises.spingwebstarterexample.api.Car;
import com.github.sumitsutar.exercises.spingwebstarterexample.data.CarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarDAO carDAO;

    public List<Car> getAllCars() {
        return carDAO.retrieveAllCars();
    }
}
