package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testEvenNumber() {
        assertTrue(new App().isEven(4));
    }

    @Test
    public void testOddNumber() {
        assertFalse(new App().isEven(7));
    }

    @Test
    public void testZero() {
        assertTrue(new App().isEven(0));
    }

    @Test
    public void testNegativeEven() {
        assertTrue(new App().isEven(-2));
    }

    @Test
    public void testNegativeOdd() {
        assertFalse(new App().isEven(-3));
    }
}
