package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and annual interest rate: ");
        double balance = input.nextDouble();
        double yearlyInterestRate = input.nextDouble();
        double monthlyInterestRate = yearlyInterestRate / 1200;

        double interest = balance * monthlyInterestRate;
        System.out.println("The interest is " + (int) (interest * 100 + 0.5) / 100.0);
    }
}
