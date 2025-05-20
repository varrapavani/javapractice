package com.measurements;

import java.util.Objects;

public class Inc {
    private final int magnitude;

    public Inc(int magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inc inc = (Inc) o;
        return magnitude == inc.magnitude;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(magnitude);
    }

    public boolean compare(Feet feet) {
        Centimeter feetInCentiMtr = feet.convertToCentimeter();
        Centimeter incInCentiMtr = this.convertToCentimeter();
        return incInCentiMtr.equals(feetInCentiMtr);
    }

    private Centimeter convertToCentimeter() {
        return new Centimeter(this.magnitude * 2.5);
    }
}
