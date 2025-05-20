package com.measurements;

import org.junit.jupiter.api.Test;

class LitreTest {
    @Test
    void compareLitreWithGallon() {
        Litre litre = new Litre(3.78);
        Gallon gallon = new Gallon(1.0);

        assert(litre.compare(gallon));
    }
}