package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee’s name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double workHour = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double hourlyPay = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        double grossPay = workHour * hourlyPay;
        double federalTaxAmount = federalTax / 100 * grossPay;
        double stateTaxAmount = stateTax / 100 * grossPay;
        double totalDeductions = federalTaxAmount + stateTaxAmount;
        double netPayable = grossPay - totalDeductions;

        System.out.println("=======================================");
        System.out.println("=======================================");

        System.out.printf("Employee Name: %15s\n",name);
        System.out.printf("Hours Worked: %16.2f\n",workHour);
        System.out.printf("Pay Rate: $%19.2f\n",hourlyPay);
        System.out.printf("Gross Pay: $%18.2f\n",grossPay);
        System.out.println("\nDeduction:");
        System.out.printf("\tFederal Withholding (%4.2f%%): $%10.2f\n",federalTax, federalTaxAmount);
        System.out.printf("\tState Withholding (%4.2f%%): $%13.2f\n",stateTax, stateTaxAmount);
        System.out.printf("\tTotal Deduction: $%23.2f\n",totalDeductions);
        System.out.println();
        System.out.printf("Net Pay: $%20.2f\n",netPayable);
    }
}
