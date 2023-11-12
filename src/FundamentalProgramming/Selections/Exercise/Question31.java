package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 for vice versa: ");
        double convertCheck = input.nextDouble();

        if (convertCheck == 0){
            System.out.print("Enter the dollar amount: ");
            double dollar = input.nextDouble();
            System.out.println("$" + dollar + " is " + dollar * exchangeRate + " yuan.");
        } else if (convertCheck == 1){
            System.out.print("Enter the RMB amount: ");
            double RMB = input.nextDouble();
            System.out.println("$" + RMB + " is " + (int)(RMB / exchangeRate * 100 + 0.5) / 100.0 + " yuan.");
        } else
            System.out.println("Incorrect input.");
    }
}
