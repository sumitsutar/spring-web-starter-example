package com.github.sumitsutar.exercises.springwebstarterexample.services;

import com.github.sumitsutar.exercises.springwebstarterexample.api.Car;
import com.github.sumitsutar.exercises.springwebstarterexample.api.Engine;
import com.github.sumitsutar.exercises.springwebstarterexample.api.EngineType;
import com.github.sumitsutar.exercises.springwebstarterexample.api.Manufacturer;
import com.github.sumitsutar.exercises.springwebstarterexample.data.CarDAO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {

    @InjectMocks
    CarService carService;

    @Mock
    CarDAO carDAO;

    @Test
    void testGetAllCars() {
        when(carDAO.retrieveAllCars()).thenReturn(getCars());
        assertNotNull(carService.getAllCars());
        assertEquals(2, carService.getAllCars().size());
    }

    private List<Car> getCars(){
        Car car1 = new Car(UUID.randomUUID(), Manufacturer.AUDI,"r8", LocalDate.of(2019,11,10), new Engine(EngineType.DIESEL,1800));
        Car car2 = new Car(UUID.randomUUID(), Manufacturer.VW,"PoloGT",LocalDate.of(2021,04,03), new Engine(EngineType.DIESEL,1600));
        return Arrays.asList(car1,car2);
    }

}
