package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        int totalDays = (int) (minutes / (60 * 24));
        System.out.println(minutes + " minutes is approximately " + totalDays / 365 + " Years and " + totalDays % 365 + " days.");
    }
}
