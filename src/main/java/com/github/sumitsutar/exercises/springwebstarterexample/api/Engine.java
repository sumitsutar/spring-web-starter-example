package com.github.sumitsutar.exercises.springwebstarterexample.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Engine {
    EngineType type;
    long capacity;
}
