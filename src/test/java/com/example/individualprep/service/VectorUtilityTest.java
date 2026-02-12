package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class VectorUtilityTest {

    @Test
    void multiply_shouldReturnCorrectResult() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {5, 6, 7};
        int x = 5;

        double[] expected = new double[]{25, 30, 35};
        double[] result = vectorUtility.multiply(v1, x);

        assertArrayEquals(expected, result);
    }

    @Test
    void multiply_shouldThrowException_whenVectorNull() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = null;
        int x = 5;

        assertThrows(IllegalArgumentException.class, () ->
                vectorUtility.multiply(v1, x)
        );
    }
}
