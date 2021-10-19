package com.github.sumitsutar.exercises.spingwebstarterexample.rest;


import com.github.sumitsutar.exercises.spingwebstarterexample.SpingWebStarterExampleApplication;
import com.github.sumitsutar.exercises.spingwebstarterexample.api.Car;
import com.github.sumitsutar.exercises.spingwebstarterexample.services.CarService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= SpingWebStarterExampleApplication.class)
public class CarsControllerTest {
    @Autowired
    CarsController carsController;

    @Test
    public void testGetAllCars() {
        List<Car> cars= carsController.getAllCars();
        assertNotNull(cars);
    }

}
