package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //When
        double addResult = calculator.add(10.0, 5.0);
        double subResult = calculator.sub(10.0, 5.0);
        double mulResult = calculator.mul(10.0, 5.0);
        double divResult = calculator.div(10.0, 5.0);

        //Then
        assertEquals(15.0, addResult);
        assertEquals(5.0, subResult);
        assertEquals(50.0, mulResult);
        assertEquals(2.0, divResult);
    }
}