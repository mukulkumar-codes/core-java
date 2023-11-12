package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        double GMT = input.nextDouble();

        // GMT * 60 gives the exact number of minutes
        // GMT - (int) GMT gives the exact number of minutes after the complete hour
        int secondsInGMT = (1 + (int) GMT * 60 + (int) ((GMT - (int) GMT ) * 100)) * 60;

        long timeInMilliseconds = System.currentTimeMillis();

        long totalSeconds = timeInMilliseconds / 1000;
        byte seconds = (byte) ((totalSeconds + secondsInGMT) % 60);

        long totalMinutes = (totalSeconds + secondsInGMT) / 60;
        byte minutes = (byte) (totalMinutes % 60);

        long totalHours = totalMinutes / 60;
        byte hours = (byte) (totalHours % 24);

        if (hours / 12 == 0)
            System.out.println("Current time is (HH:MM:SS) " + hours % 12 + ":" + minutes + ":" + seconds + " AM");
        else
            System.out.println("Current time is (HH:MM:SS) " + hours % 12 + ":" + minutes + ":" + seconds + " PM");
    }
}
