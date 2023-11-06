package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subTotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subTotal * (gratuityRate / 100.0);

        System.out.println("the gratuity is $" + (int) (gratuity * 10) / 10.0 + " and total is $" + (int) ((gratuity + subTotal) * 10) / 10.0);
    }
}
