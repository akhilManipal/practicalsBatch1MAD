package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void calculate_addition_returnsCorrectResult() {
        assertEquals(15, calculator.calculate(10, 5, "+"), 0.001);
    }

    @Test
    public void calculate_subtraction_returnsCorrectResult() {
        assertEquals(10, calculator.calculate(20, 10, "-"), 0.001);
    }

    @Test
    public void calculate_multiplication_returnsCorrectResult() {
        assertEquals(42, calculator.calculate(7, 6, "*"), 0.001);
    }

    @Test
    public void calculate_division_returnsCorrectResult() {
        assertEquals(3, calculator.calculate(9, 3, "/"), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculate_divisionByZero_throwsException() {
        calculator.calculate(15, 0, "/");
    }
}