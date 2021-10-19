package com.github.sumitsutar.exercises.springwebstarterexample.api;

import org.force66.beantester.BeanTester;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testCar() {
        BeanTester beanTester = new BeanTester();
        beanTester.addExcludedField("launchDate");
        beanTester.testBean(Car.class);
    }
}
