package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        double GMT = input.nextDouble();

        // GMT * 60 gives the exact number of minutes
        // GMT - (int) GMT gives the exact number of minutes after the complete hour
        int secondsInGMT = (1 + (int) GMT * 60 + (int) ((GMT - (int) GMT ) * 100)) * 60;

        long timeInMilliseconds = System.currentTimeMillis();

        long totalSeconds = timeInMilliseconds / 1000;
        byte seconds = (byte) (totalSeconds % 60);

        long totalMinutes = (totalSeconds + secondsInGMT) / 60;
        byte minutes = (byte) (totalMinutes % 60);

        long totalHours = totalMinutes / 60;
        byte hours = (byte) (totalHours % 24);

        System.out.println("Current time is (HH:MM:SS) " + hours + ":" + minutes + ":" + seconds + " GMT");
    }
}
