package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double weightPackageOne = input.nextDouble();
        double pricePackageOne = input.nextDouble();
        double ratioOne = (int)(pricePackageOne / weightPackageOne * 100 + 0.5) / 100.0;

        System.out.print("Enter weight and price for package 2: ");
        double weightPackageTwo = input.nextDouble();
        double pricePackageTwo = input.nextDouble();
        double ratioTwo = (int)(pricePackageTwo / weightPackageTwo * 100 + 0.5) / 100.0;

        if (ratioOne < ratioTwo)
            System.out.println("Package 1 has a better price.");
        else if (ratioOne == ratioTwo)
            System.out.println("Two packages have the same price.");
        else
            System.out.println("Package 2 has a better price.");
    }
}
