package com.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void compareCentimeterToMillimeter() {
        Length centi = Length.fromCentimeter(1);
        Length mm = Length.fromMillimeter(10);
        assert(centi.compare(mm));
    }

    @Test
    void compareInchesToCentimeter() {
        Length inch = Length.fromInch(2);
        Length centimeter = Length.fromCentimeter(5);
        assert (inch.compare(centimeter));
    }

    @Test
    void compareInchAndFeet() {
        Length inch = Length.fromInch(12);
        Length feet = Length.fromFeet(1);
        assert(inch.compare(feet));
    }

    @Test
    void addInchesAndCentimeters() {
        Length inch = Length.fromInch(2);
        Length centimeter = Length.fromCentimeter(2.5);
        assertEquals(Length.fromInch(3),inch.add(centimeter));
    }

    @Test
    void addInches() {
        Length inch1 = Length.fromInch(1);
        Length inch2 = Length.fromInch(1);
        assertEquals(Length.fromInch(2),inch1.add(inch2));
    }
}