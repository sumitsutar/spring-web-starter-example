package com.github.sumitsutar.exercises.springwebstarterexample.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {
    UUID id;
    Manufacturer manufacturer;
    String carName;
    LocalDate launchDate;
    Engine engine;
}
