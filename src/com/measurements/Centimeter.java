package com.measurements;

import java.util.Objects;

public class Centimeter {
    private final double magnitude;

    public Centimeter(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Centimeter that = (Centimeter) o;
        return Double.compare(magnitude, that.magnitude) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(magnitude);
    }
}
