package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class VectorUtilityTest {

    @Test
    void subtract_shouldReturnCorrectResult() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {10, 8, 6};
        double[] v2 = {1, 2, 3};

        double[] expected = new double[]{9, 6, 3};
        double[] result = vectorUtility.subtract(v1, v2);

        assertArrayEquals(expected, result);
    }

    @Test
    void subtract_shouldThrowException_whenVectorNull() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = null;
        double[] v2 = {1, 2, 3};

        assertThrows(IllegalArgumentException.class, () ->
                vectorUtility.subtract(v1, v2)
        );
    }

    @Test
    void subtract_shouldThrowException_whenDifferentLength() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {5, 6};
        double[] v2 = {3, 1, 2};

        assertThrows(IllegalArgumentException.class, () ->
                vectorUtility.subtract(v1, v2)
        );
    }
}
