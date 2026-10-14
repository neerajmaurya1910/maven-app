package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testSimpleWord() {
        assertEquals("olleh", new App().reverseString("hello"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", new App().reverseString(""));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals("a", new App().reverseString("a"));
    }

    @Test
    public void testMixedCase() {
        assertEquals("avaJ", new App().reverseString("Java"));
    }

    @Test
    public void testWithSpace() {
        assertEquals("b a", new App().reverseString("a b"));
    }
}
