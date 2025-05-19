package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    @Test
    void calculateAreaWithlengthZero() {
        Square square = new Square(0);
        assertEquals(0, square.area());
    }

    @Test
    void calculateArea() {
        Square square = new Square(10);
        assertEquals(100, square.area());
    }
}