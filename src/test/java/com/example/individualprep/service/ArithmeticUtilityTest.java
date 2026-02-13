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
}
