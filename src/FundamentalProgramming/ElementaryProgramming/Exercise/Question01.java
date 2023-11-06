package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // totalKilometers = miles * KILOMETERS_PER_MILES;
        final double KILOMETERS_PER_MILES = 1.609;

        System.out.print("Enter the distance in miles: ");
        double miles = input.nextDouble();

        double kiloMeters = miles * KILOMETERS_PER_MILES;
        System.out.println(miles + " in kilometers are " + (int) (kiloMeters * 1000) / 1000.0 + " kilometers.");
    }
}
