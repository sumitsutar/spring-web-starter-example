package com.github.sumitsutar.exercises.springwebstarterexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

@SpringBootTest(classes = SpingWebStarterExampleApplication.class)
class SpingWebStarterExampleApplicationTests {

    @Test
    void contextLoads() {
        assertThatCode(() -> SpingWebStarterExampleApplication.main(new String[0])).doesNotThrowAnyException();
    }

}
