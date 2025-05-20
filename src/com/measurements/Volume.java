package com.measurements;

import java.util.Objects;

public class Volume {

    private final double quantity;

    public Volume(double quantity) {
        this.quantity = quantity;
    }

    public static Volume fromLiter(double quantity) {
        return new Volume(quantity);
    }

    public static Volume fromGallon(double quantity) {
        return new Volume(quantity * 3.78);
    }

    public boolean compare(Volume gallon) {
        return this.equals(gallon);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(quantity, volume.quantity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(quantity);
    }
}
