package com.example.bmicalaculator;

public class BMICalculator {
    // Method to calculate BMI
    public static float calculateBMI(float weight, float height) {
        return weight / (height * height);
    }

    // Method to determine weight category
    public static String determineCategory(float bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi > 18.6 && bmi < 25) return "Normal";
        else if (bmi >= 25 && bmi < 30) return "Overweight";
        else return "Obese";
    }
}
