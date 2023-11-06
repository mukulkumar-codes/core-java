package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double savingAmountPerMonth = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double interestRate = input.nextDouble();

        double monthlyInterestRate = interestRate / 1200;

        double firstMonth = savingAmountPerMonth * (1 + monthlyInterestRate);
        double secondMonth = (savingAmountPerMonth + firstMonth) *  (1 + monthlyInterestRate);
        double thirdMonth = (savingAmountPerMonth + secondMonth) *  (1 + monthlyInterestRate);
        double forthMonth = (savingAmountPerMonth + thirdMonth) *  (1 + monthlyInterestRate);
        double fifthMonth = (savingAmountPerMonth + forthMonth) *  (1 + monthlyInterestRate);
        double sixthMonth = (savingAmountPerMonth + fifthMonth) *  (1 + monthlyInterestRate);

        System.out.println("After the first month, the account value is " + (int) (firstMonth * 100) / 100.0);
        System.out.println("After the second month, the account value is " + (int) (secondMonth * 100) / 100.0);
        System.out.println("After the third month, the account value is " + (int) (thirdMonth * 100) / 100.0);
        System.out.println("After the sixth month, the account value is " + (int) (sixthMonth * 100) / 100.0);
    }
}
