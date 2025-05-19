package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void rectangle() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals(200, rectangle.area());
    }
}