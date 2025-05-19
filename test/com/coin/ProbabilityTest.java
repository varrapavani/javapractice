package com.coin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProbabilityTest {
    @Test
    void creatingProbability() {
        Probability probability = Probability.createProbability(0.5);

        assert(probability.equals(Probability.createProbability(0.5)));
    }

    @Test
    void andsToAnotherProbability() {
        Probability p1 = Probability.createProbability(0.5);
        Probability p2 = Probability.createProbability(0.5);

        Probability p3 = p1.and(p2);

        assert(p3.equals(Probability.createProbability(0.25)));
    }

    @Test
    void complementProbability() {
        Probability probability = Probability.createProbability(0.2);
        Probability complement = probability.complement();

        assert (complement.equals(Probability.createProbability(0.8)));
    }

    @Test
    void shouldThrowInvalidProbability() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> Probability.createProbability(1.1));
        assertEquals("invalid probability", exception.getMessage());

    }

    @Test
    void orsToAnotherProbability() {
        Probability probability = Probability.createProbability(0.5);
        Probability probability2 = Probability.createProbability(0.5);
        Probability p3 = probability.or(probability2);
        assertEquals(p3,Probability.createProbability(0.75));
    }
}