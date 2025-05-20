package com.measurements;

import org.junit.jupiter.api.Test;

class IncTest {
    @Test
    void compareWithFeet() {
        Inc inc = new Inc(12);
        Feet feet = new Feet(1);

        assert(inc.compare(feet));
    }
}