package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClassTest {
    @Test
    void name() {
        assertEquals(true, true);
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