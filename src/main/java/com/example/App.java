package com.example;

public class App {
    public int countVowels(String s) {
        int count = 0;
        for (char ch : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) {
                count++;
            }
        }
        return count;
    }
}
