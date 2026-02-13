package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {

    @Test
    void multiply_shouldReturnCorrectResult_positive() {
        ArithmeticUtility util = new ArithmeticUtility();
        double a = 9;
        double b = 5;
        double expected = 45.0;

        assertEquals(expected, util.multiply(a,b));
    }

    @Test
    void multiply_shouldReturnCorrectResult_negative() {
        ArithmeticUtility util = new ArithmeticUtility();
        double a = 7;
        double b = -6;
        double expected = -42.0;

        assertEquals(expected, util.multiply(a,b));
    }
  
    @Test
    void exponent_shouldReturnCorrectResult_positivePower() {
        ArithmeticUtility util = new ArithmeticUtility();
        assertEquals(8.0, util.exponent(2, 3), 1e-9);
    }

    @Test
    void exponent_shouldReturnCorrectResult_zeroPower() {
        ArithmeticUtility util = new ArithmeticUtility();
        assertEquals(1.0, util.exponent(5, 0), 1e-9);
    }

    @Test
    void exponent_shouldReturnCorrectResult_negativePower() {
        ArithmeticUtility util = new ArithmeticUtility();
        assertEquals(0.125, util.exponent(2, -3), 1e-9);
    }

    @Test
    void exponent_shouldReturnCorrectResult_oneBase() {
        ArithmeticUtility util = new ArithmeticUtility();
        assertEquals(1.0, util.exponent(1, 100), 1e-9);
    }

    @Test
    void exponent_shouldReturnCorrectResult_negativeBase() {
        ArithmeticUtility util = new ArithmeticUtility();
        assertEquals(-8.0, util.exponent(-2, 3), 1e-9);
        assertEquals(4.0, util.exponent(-2, 2), 1e-9);
    }

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

    @Test
    void add_shouldReturnCorrectResult_negative() {
        ArithmeticUtility util = new ArithmeticUtility();
        double a = 7;
        double b = -6;
        double expected = 1.0;

        assertEquals(expected, util.add(a,b));
    }

    @Test
    void subtract_shouldReturnCorrectResult_negative() {
        ArithmeticUtility util = new ArithmeticUtility();
        double a = 7;
        double b = -6;
        double expected = 13.0;

        assertEquals(expected, util.subtract(a,b));
    }
}
