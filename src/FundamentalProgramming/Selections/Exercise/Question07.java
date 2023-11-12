package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount (bucks.cents) : ");
        double amount = input.nextDouble();

        int amountInCents = (int) (amount * 100 + 0.005);
        int dollars = amountInCents / 100;
        amountInCents %= 100;

        int quarters = amountInCents / 25;
        amountInCents %= 25;

        int dimes = amountInCents / 10;
        amountInCents %= 10;

        int nickels = amountInCents / 5;
        amountInCents %= 5;

        int pennies = amountInCents;

        System.out.println("Your amount " + amount + " consists of : ");
        System.out.println( dollars + " Dollars,");
        System.out.println( quarters + " Quarters,");
        System.out.println( dimes + " dimes,");
        System.out.println( nickels + " Nickels,");
        System.out.println( pennies + " Pennies.");
    }
}
