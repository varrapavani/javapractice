package com.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncTest {
    @Test
    void compareWithFeet() {
        Inc inc = new Inc(12);
        Feet feet = new Feet(1);

        assert(inc.compare(feet));
    }
}