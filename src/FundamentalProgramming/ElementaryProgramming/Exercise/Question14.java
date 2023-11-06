package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        final double KILOGRAM_PER_POUND = 0.45359237;
        final double METER_PER_INCH = 0.0254;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        double weightInKilograms = weightInPounds * KILOGRAM_PER_POUND;

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();
        double heightInMeters = heightInInches * METER_PER_INCH;

        // BMI = mass in kilograms / square of height in meters
        double bodyMassIndex = weightInKilograms / Math.pow(heightInMeters, 2);

        System.out.println("Body Mass Index is " + (int) (bodyMassIndex * 10000 + 0.5) / 10000.0);
    }
}
