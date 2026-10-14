package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testPalindromeWord() {
        assertTrue(new App().isPalindromeString("madam"));
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(new App().isPalindromeString("hello"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(new App().isPalindromeString(""));
    }

    @Test
    public void testMixedCasePalindrome() {
        assertTrue(new App().isPalindromeString("Racecar"));
    }

    @Test
    public void testTwoDifferentCharacters() {
        assertFalse(new App().isPalindromeString("ab"));
    }
}
