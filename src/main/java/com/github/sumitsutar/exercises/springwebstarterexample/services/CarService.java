package com.github.sumitsutar.exercises.springwebstarterexample.services;

import com.github.sumitsutar.exercises.springwebstarterexample.api.Car;
import com.github.sumitsutar.exercises.springwebstarterexample.data.CarDAO;
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
