package com.github.sumitsutar.exercises.springwebstarterexample.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarDAOTest {

    CarDAO carDAO = new CarDAO();

    @Test
    public void testRetrieveAllCars() {
        assertNotNull(carDAO.retrieveAllCars());
    }
}
