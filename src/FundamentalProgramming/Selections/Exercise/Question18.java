package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package: ");
        int weight = input.nextInt();

        if (weight > 0 && weight <=2){
            System.out.println("Shipping cost is $2.5");
        } else if (weight > 2 && weight <= 4){
            System.out.println("Shipping cost is $4.5");
        } else if (weight > 4 && weight <= 10) {
            System.out.println("Shipping cost is $7.5");
        } else if (weight > 10 && weight <= 20){
            System.out.println("Shipping cost is $10.5");
        } else {
            System.out.println("The package cannot be shipped.");
        }
    }
}
