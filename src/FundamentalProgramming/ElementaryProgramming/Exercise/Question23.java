package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double gallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double cost = (distance / gallon) * pricePerGallon;

        System.out.println("The cost of driving is " + (int) (cost * 100 + 0.5) / 100.0);
    }
}
