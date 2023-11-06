package FundamentalProgramming.ElementaryProgramming.CaseStudies;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter the Interest Rate(per year): ");
        double interestRate = input.nextDouble();

        double monthlyInterestRate = interestRate / 1200;

        System.out.print("Enter number of years: ");
        double numberOfYears = input.nextDouble();

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - 1 / (Math.pow(1 + monthlyInterestRate,
                numberOfYears * 12)));

        double totalPayment = monthlyPayment *numberOfYears * 12;
//
        System.out.println("Monthly EMI: " + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("Total amount to pay: " + (int) (totalPayment * 100) / 100.0);
    }
}
