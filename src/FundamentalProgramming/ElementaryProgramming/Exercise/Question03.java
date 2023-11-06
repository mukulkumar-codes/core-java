package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // totalKilometers = miles * KILOMETERS_PER_MILES;
        final double FEET_PER_METER = 3.2786;

        System.out.print("Enter the distance in meters: ");
        double meter = input.nextDouble();

        double feet = meter * FEET_PER_METER;
        System.out.println(meter + " meters in feet are " + (int) (feet * 1000) / 1000.0 + " feet.");
    }
}
