package com.example.bmicalaculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BMICalculatorTest {
    @Test
    public void testBMICalculation_Normal() {
        assertEquals(22.86, BMICalculator.calculateBMI(70, 1.75F), 0.01);
    }

    @Test
    public void testBMICalculation_Underweight() {
        assertEquals(19.53, BMICalculator.calculateBMI(50, 1.60F), 0.01);
    }

    @Test
    public void testBMICalculation_Overweight() {
        assertEquals(25.00, BMICalculator.calculateBMI(100, 2.00F), 0.01);
    }

    @Test
    public void testBMICalculation_Obese() {
        assertEquals(35.16, BMICalculator.calculateBMI(90, 1.60F), 0.01);
    }

    @Test
    public void testCategory_Normal() {
        assertEquals("Normal", BMICalculator.determineCategory(22.86F));
    }

    @Test
    public void testCategory_Underweight() {
        assertEquals("Normal", BMICalculator.determineCategory(19.53F));
    }

    @Test
    public void testCategory_Overweight() {
        assertEquals("Overweight", BMICalculator.determineCategory(25.00F));
    }

    @Test
    public void testCategory_Obese() {
        assertEquals("Obese", BMICalculator.determineCategory(35.16F));
    }
}