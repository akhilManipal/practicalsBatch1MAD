package com.example.tapcount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TapCounterTest {
    private TapCounter tapCounter;

    @Before
    public void setUp() {
        tapCounter = new TapCounter();
    }

    @Test
    public void whenIncrementedOnce_thenOutputIsTaps1() {
        tapCounter.incrementCount(); // Increment 1 time
        assertEquals("Taps: 1", tapCounter.getFormattedCount());
    }

    @Test
    public void whenIncrementedFiveTimes_thenOutputIsTaps5() {
        for (int i = 0; i < 5; i++) tapCounter.incrementCount(); // Increment 5 times
        assertEquals("Taps: 5", tapCounter.getFormattedCount());
    }


    @Test
    public void whenIncrementedTenTimes_thenOutputIsTaps10() {
        for (int i = 0; i < 10; i++) tapCounter.incrementCount(); // Increment 10 times
        assertEquals("Taps: 10", tapCounter.getFormattedCount());
    }

    // Continue for other sample inputs/outputs...

}