package com.github.sumitsutar.exercises.spingwebstarterexample.data;

import com.github.sumitsutar.exercises.spingwebstarterexample.api.Car;
import com.github.sumitsutar.exercises.spingwebstarterexample.api.Engine;
import com.github.sumitsutar.exercises.spingwebstarterexample.api.EngineType;
import com.github.sumitsutar.exercises.spingwebstarterexample.api.Manufacturer;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class CarDAOTest {

    CarDAO carDAO = new CarDAO();

    @Test
    public void testRetrieveAllCars() {
        assertNotNull(carDAO.retrieveAllCars());
    }
}
