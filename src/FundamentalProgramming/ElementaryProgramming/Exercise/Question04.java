package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // totalKilometers = miles * KILOMETERS_PER_MILES;
        final double SQUARE_METER_PER_PING = 0.3025;

        System.out.print("Enter the area in ping: ");
        double ping = input.nextDouble();

        double meterPerSquare = ping * SQUARE_METER_PER_PING;
        System.out.println(ping + " ping area in meter per square are " + (int) (meterPerSquare * 1000) / 1000.0 + " " +
                "feet.");
    }
}
