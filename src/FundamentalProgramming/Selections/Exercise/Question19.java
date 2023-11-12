package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the three edges of the triangle: ");
        double firstSide = input.nextDouble();
        double secondSide = input.nextDouble();
        double thirdSide = input.nextDouble();

        if ( (firstSide + secondSide) > thirdSide && (secondSide + thirdSide) > firstSide && (thirdSide + firstSide) > secondSide){
            System.out.println("Perimeter of the triangle is " + (firstSide + secondSide + thirdSide));
        } else {
            System.out.println("Invalid input edges.");
        }

    }
}
