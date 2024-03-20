package com.example.tapcount;

public class TapCounter {
    private int count = 0;

    public void incrementCount() {
        count++;
    }

    // New method to get the formatted count string
    public String getFormattedCount() {
        return "Taps: " + count;
    }
}
