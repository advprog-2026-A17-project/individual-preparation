package com.example.individualprep.dto;

import java.util.Arrays;
import java.util.Objects;

public record VectorResponse(
        double[] result,
        Double scalarResult
) {
    public VectorResponse(double[] result) {
        this(result, null);
    }

    public VectorResponse(double scalarResult) {
        this(null, scalarResult);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VectorResponse that = (VectorResponse) o;
        return Arrays.equals(result, that.result) &&
                Objects.equals(scalarResult, that.scalarResult);
    }

    @Override
    public int hashCode() {
        int resultHash = Arrays.hashCode(result);
        return 31 * resultHash + Objects.hashCode(scalarResult);
    }

    @Override
    public String toString() {
        return "VectorResponse{" +
                "result=" + Arrays.toString(result) +
                ", scalarResult=" + scalarResult +
                '}';
    }
}