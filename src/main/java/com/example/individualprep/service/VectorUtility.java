package com.example.individualprep.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class VectorUtility {
    
    public double[] add(double[] v1, double[] v2) {
        // TODO: Implement me properly!
        validateSameSize(v1, v2);

        int size = v1.length;
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = v1[i] + v2[i];
        }

        return result;
    }

    public double[] subtract(double[] v1, double[] v2) {
        // TODO: Implement me properly!
        return new double[] { 0.0, 0.0, 0.0 };
    }

    public double[] multiply(double[] v1, int x) {
        // TODO: Implement me properly!
        return new double[] { 0.0, 0.0, 0.0 };
    }
    
    public double dotProduct(double[] v1, double[] v2) {
        // TODO: Implement me properly!
        return 0.0;
    }
    
    public double norm(double[] v1) {
        // TODO: Implement me properly!
        return 0.0;
    }

    // Helpers
    private void validateSameSize(double[] v1, double[] v2) {
        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Vectors must have same size");
        }
    }
}