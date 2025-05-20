package com.measurements;

public class Gallon {
    private final double quantity;

    public Gallon(double quantity) {
        this.quantity = quantity;
    }

    public Litre convertToLitre() {
        return new Litre(quantity * 3.78);
    }
}
