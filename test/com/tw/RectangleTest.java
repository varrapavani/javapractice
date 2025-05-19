package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @Test
    void area() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals(200, rectangle.area());
    }

    @Test
    void calculatePerimeter() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals(60, rectangle.perimeter());
    }

    @Test
    void calculatePerimeterOfZeroLengthRectangle() {
        Rectangle rectangle = new Rectangle(0, 10);
        assertEquals(20, rectangle.perimeter());
    }
}