package com.example;

public class App {
    public boolean isPalindromeString(String s) {
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
