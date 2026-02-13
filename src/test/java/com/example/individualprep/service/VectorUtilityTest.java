package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VectorUtilityTest {

    @Test
    void add_shouldReturnCorrectResult() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {5, 6, 7};
        double[] v2 = {3, 1, 2};

        double[] expected = new double[]{8, 7, 9};
        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result);
    }

    @Test
    void add_shouldThrowException_whenVectorNull() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {};
        double[] v2 = {3, 1, 2};

        assertThrows(IllegalArgumentException.class, () ->
                vectorUtility.add(v1, v2)
        );
    }

    @Test
    void add_shouldThrowException_whenDifferentLength() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {5, 6};
        double[] v2 = {3, 1, 2};

        assertThrows(IllegalArgumentException.class, () ->
                vectorUtility.add(v1, v2)
        );
    }
}
