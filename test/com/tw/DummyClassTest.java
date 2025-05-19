package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DummyClassTest {
    @Test
    void name() {
        assertTrue(true);
    }

    @Test
    void getName() {
        DummyClass dummyClass = new DummyClass();
        assertEquals("hello", dummyClass.getName());
    }

    @Test
    void rectangle() {

    }
}