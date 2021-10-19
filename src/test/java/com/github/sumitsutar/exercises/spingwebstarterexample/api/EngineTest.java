package com.github.sumitsutar.exercises.spingwebstarterexample.api;

import org.force66.beantester.BeanTester;
import org.junit.jupiter.api.Test;

public class EngineTest {

    @Test
    public void testEngine() {
        BeanTester beanTester = new BeanTester();
        beanTester.testBean(Engine.class);
    }
}
