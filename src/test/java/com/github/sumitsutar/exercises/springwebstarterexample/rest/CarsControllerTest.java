package com.github.sumitsutar.exercises.springwebstarterexample.rest;


import com.github.sumitsutar.exercises.springwebstarterexample.SpingWebStarterExampleApplication;
import com.github.sumitsutar.exercises.springwebstarterexample.api.Car;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= SpingWebStarterExampleApplication.class)
public class CarsControllerTest {
    @Autowired
    CarsController carsController;

    @Test
    void testGetAllCars() {
        List<Car> cars= carsController.getAllCars();
        assertNotNull(cars);
    }

}
