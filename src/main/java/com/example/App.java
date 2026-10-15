package com.example;

public class App {
    public int[] fibonacci(int n) {
        int[] series = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                series[i] = i;
            } else {
                series[i] = series[i - 1] + series[i - 2];
            }
        }
        return series;
    }
}
