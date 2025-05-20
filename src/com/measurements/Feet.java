package com.measurements;

public class Feet {

    private final int magnitude;
    public Feet(int magnitude) {
        this.magnitude = magnitude;
    }


    public Inc convertToInc() {
        return new Inc(this.magnitude * 12);
    }

    public Centimeter convertToCentimeter() {
        return new Centimeter(this.magnitude * 12 * 2.5);
    }
}
