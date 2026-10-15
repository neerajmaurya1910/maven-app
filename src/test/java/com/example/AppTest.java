package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testFirstFive() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 3}, new App().fibonacci(5));
    }

    @Test
    public void testSingleTerm() {
        assertArrayEquals(new int[]{0}, new App().fibonacci(1));
    }

    @Test
    public void testZeroTerms() {
        assertArrayEquals(new int[]{}, new App().fibonacci(0));
    }

    @Test
    public void testTwoTerms() {
        assertArrayEquals(new int[]{0, 1}, new App().fibonacci(2));
    }

    @Test
    public void testFirstTen() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, new App().fibonacci(10));
    }

    @Test
    public void testFirstSeven() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 9}, new App().fibonacci(7));
    }
}
