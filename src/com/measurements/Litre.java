package com.measurements;

import java.util.Objects;

public class Litre {

    private final double quantity;

    public Litre(double quantity) {
        this.quantity = quantity;
    }


    public boolean compare(Gallon gallon) {
        Litre gallonInLitre = gallon.convertToLitre();
        return this.equals(gallonInLitre);
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Litre litre = (Litre) o;
        return Double.compare(quantity, litre.quantity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(quantity);
    }
}
