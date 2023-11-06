package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double yearlyInterestRate = input.nextDouble();
        double monthlyInterestRate = yearlyInterestRate / 1200;

        System.out.print("Enter number of years: ");
        double numberOfYears = input.nextDouble();

        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        System.out.println("The interest is " + (int) (futureInvestmentValue * 100 + 0.5) / 100.0);
    }
}
