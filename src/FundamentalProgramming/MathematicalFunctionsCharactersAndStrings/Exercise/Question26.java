package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount (bucks.cents) : ");
        String amountString = input.nextLine();

        int indexOfDecimal = amountString.indexOf('.');

        String dollar = amountString.substring(0, indexOfDecimal);
        String cent = amountString.substring(indexOfDecimal+1);

        int dollars = Integer.parseInt(dollar);
        int cents = Integer.parseInt(cent);

        int amountInCents = cents;

        int quarters = amountInCents / 25;
        amountInCents %= 25;

        int dimes = amountInCents / 10;
        amountInCents %= 10;

        int nickels = amountInCents / 5;
        amountInCents %= 5;

        int pennies = amountInCents;

        System.out.println("Your amount " + amountString + " consists of : ");
        System.out.println( dollars + " Dollars,");
        System.out.println( quarters + " Quarters,");
        System.out.println( dimes + " dimes,");
        System.out.println( nickels + " Nickels,");
        System.out.println( pennies + " Pennies.");
    }
}
