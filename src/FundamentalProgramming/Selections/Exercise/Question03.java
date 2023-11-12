package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the coefficient of equation a*x + b*y = c -> ");
        double aCoefficientOfX = input.nextDouble();
        double bCoefficientOfY = input.nextDouble();
        double cAbsoluteValue = input.nextDouble();

        System.out.print("Enter the coefficient of equation d*x + e*y = f -> ");
        double dCoefficientOfX = input.nextDouble();
        double eCoefficientOfY = input.nextDouble();
        double fAbsoluteValue = input.nextDouble();

        double determinant = aCoefficientOfX * eCoefficientOfY - dCoefficientOfX * bCoefficientOfY;

        if (determinant != 0){
            double valueOfX = (cAbsoluteValue * eCoefficientOfY - fAbsoluteValue * bCoefficientOfY) / determinant;
            double valueOfY = (aCoefficientOfX * fAbsoluteValue - dCoefficientOfX * cAbsoluteValue) / determinant;

            System.out.println("x is "+ valueOfX + " and y is " + valueOfY);
        } else{
            System.out.println("The equation has no solution.");
        }

    }
}
