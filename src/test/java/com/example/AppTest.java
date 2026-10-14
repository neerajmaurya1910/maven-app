package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testSimpleWord() {
        assertEquals(2, new App().countVowels("hello"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, new App().countVowels(""));
    }

    @Test
    public void testNoVowels() {
        assertEquals(0, new App().countVowels("rhythm"));
    }

    @Test
    public void testAllVowelsUppercase() {
        assertEquals(5, new App().countVowels("AEIOU"));
    }

    @Test
    public void testMixedCase() {
        assertEquals(3, new App().countVowels("Programming"));
    }
}
