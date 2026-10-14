package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddPositiveNumbers() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testAddWithZero() {
        App app = new App();
        assertEquals(7, app.add(7, 0));
    }

    @Test
    public void testAddNegativeNumbers() {
        App app = new App();
        assertEquals(-8, app.add(-3, -5));
    }

    @Test
    public void testAddPositiveAndNegative() {
        App app = new App();
        assertEquals(4, app.add(10, -6));
    }

    @Test
    public void testAddLargeNumbers() {
        App app = new App();
        assertEquals(3000000, app.add(1000000, 2000000));
    }
}
