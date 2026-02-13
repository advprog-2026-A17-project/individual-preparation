package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
    void add_shouldReturnCorrectResult() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {5, 6, 7};
        double[] v2 = {3, 1, 2};

        double[] expected = new double[]{8, 7, 9};
        double[] result = vectorUtility.add(v1, v2);

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

        double[] v1 = {};
        double[] v2 = {3, 1, 2};

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

    @Test
    void dot_shouldReturnCorrectResult() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {5, 6, 7};
        double[] v2 = {5,6,7};

        double expected = 110;
        double result = vectorUtility.dotProduct(v1, v2);

        assertEquals(expected, result);
    }

    @Test
    void dot_shouldThrowException_whenVectorNull() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {};
        double[] v2 = {3, 1, 2};

        assertThrows(IllegalArgumentException.class, () ->
                vectorUtility.dotProduct(v1, v2)
        );
    }

    @Test
    void dot_shouldThrowException_whenDifferentLength() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {5, 6};
        double[] v2 = {3, 1, 2};

        assertThrows(IllegalArgumentException.class, () ->
                vectorUtility.dotProduct(v1, v2)
        );
    }

    @Test
    void norm_shouldReturnCorrectResult() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {5, 6, 7};

        double expected = Math.sqrt(110);
        double result = vectorUtility.norm(v1);

        assertEquals(expected, result);
    }
}
