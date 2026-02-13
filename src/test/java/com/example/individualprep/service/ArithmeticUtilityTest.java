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
}
