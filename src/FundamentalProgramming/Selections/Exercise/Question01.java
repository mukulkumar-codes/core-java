package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("If quadratic equation is a*x^2 + b*x + c = 0.\nEnter the value of a, b and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0){
            double rootOne = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double rootTwo = (-b - Math.pow(discriminant, 0.5)) / (2 * a);

            System.out.println("The equation has two roots " + rootOne + " and " + rootTwo + ".");
        } else if(discriminant == 0){
            double rootOne = (-b) / (2 * a);
            System.out.println("The equation has one root " + rootOne + ".");
        } else
            System.out.println("The equation has imaginary or no real roots.");
    }
}
