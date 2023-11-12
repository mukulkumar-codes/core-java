package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble(); // temperature = ta

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble(); // windSpeed = v

        double windChillTemperature = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));

        //  twc = 35.74 + 0.6215 * ta - 35.75 * v^0.16 + 0.4275 * ta * v^0.16
        //  ta is the outside temperature measured in degrees Fahrenheit,
        //  v is the speed measured in miles per hour, and
        //  twc is the wind-chill temperature.
        // The formula cannot be used for wind speeds below 2 mph or temperatures below -58°F or above 41°F

        if (windSpeed >= 2 && temperature >= -58 && temperature <= 41)
            System.out.println("The wind chill index is " + (int)(windChillTemperature * 100 + 0.5) / 100.0);
        else
            System.out.println("Invalid wind speed or temperature.");
    }
}
