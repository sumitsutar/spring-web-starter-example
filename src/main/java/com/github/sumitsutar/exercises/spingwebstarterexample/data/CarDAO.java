package com.github.sumitsutar.exercises.spingwebstarterexample.data;

import com.github.sumitsutar.exercises.spingwebstarterexample.api.Car;
import com.github.sumitsutar.exercises.spingwebstarterexample.api.Engine;
import com.github.sumitsutar.exercises.spingwebstarterexample.api.EngineType;
import com.github.sumitsutar.exercises.spingwebstarterexample.api.Manufacturer;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

@Repository
public class CarDAO {

    public List<Car> retrieveAllCars() {
        Car car1 = new Car(UUID.randomUUID(), Manufacturer.AUDI,"r8",LocalDate.of(2019,11,10), new Engine(EngineType.DIESEL,1800));
        Car car2 = new Car(UUID.randomUUID(), Manufacturer.VW,"PoloGT",LocalDate.of(2021,04,03), new Engine(EngineType.DIESEL,1600));
        return Arrays.asList(car1,car2);
    }
}
