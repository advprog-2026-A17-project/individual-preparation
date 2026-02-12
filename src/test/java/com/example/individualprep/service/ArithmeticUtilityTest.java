package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class ArithmeticUtilityTest {

    @Test
    void divide_shouldReturnCorrectResult() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

        double result = arithmeticUtility.divide(20, 4);

        assertEquals(5.0, result);
    }

    @Test
    void divide_shouldWorkWithDecimalResult() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

        double result = arithmeticUtility.divide(7, 2);

        assertEquals(3.5, result);
    }

    @Test
    void divide_shouldThrowException_whenDivideByZero() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

        assertThrows(IllegalArgumentException.class, () ->
                arithmeticUtility.divide(10, 0)
        );
    }

    @Test
    void divide_shouldWorkWithNegativeNumbers() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

        double result = arithmeticUtility.divide(-10, 2);

        assertEquals(-5.0, result);
    }
}
