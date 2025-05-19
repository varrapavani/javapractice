package com.coin;

import java.util.Objects;

public class Probability {
    private static final double IMPOSSIBILITY =0.0;
    private static final double CERTAINTY =1.0;
    private final double value;

    private Probability(double value) {
        this.value = value;
    }

    public static Probability createProbability(double value) {
        if (value >= IMPOSSIBILITY && value <= CERTAINTY) {
            return new Probability(value);
        }

        throw new RuntimeException("invalid probability");
    }

    public Probability and(Probability p2) {
        return new Probability(p2.value * this.value);
    }

    public Probability complement() {
        return Probability.createProbability(1 - this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }


    public Probability or(Probability other) {
        double newValue = this.value + other.value - this.value * other.value;
        return Probability.createProbability(newValue);
    }
}
