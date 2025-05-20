package com.measurements;

import java.util.Objects;

public class Length {

    private final double value;

    public Length(double value) {
        this.value = value;
    }

    public static Length fromInch(double inch) {
        return new Length(inch * 2.5 * 10);

    }

    public static Length fromFeet(double feet) {
        return new Length(feet * 12 * 2.5 * 10);
    }

    public static Length fromCentimeter(double centimeter) {
        return new Length(centimeter * 10);
    }

    public static Length fromMillimeter(double millimeter) {
        return new Length(millimeter);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(value, length.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public boolean compare(Length unit) {
        return this.equals(unit);
    }

    public Length add(Length other) {
        return new Length(this.value + other.value);
    }
}
