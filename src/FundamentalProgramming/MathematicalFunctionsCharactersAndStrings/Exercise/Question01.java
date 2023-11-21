package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double distance = input.nextDouble();

        double side = 2 * distance * Math.sin(Math.PI / 5) ;
        double area = 5 * side * side / (4 * Math.tan(Math.PI / 5));

        System.out.println("The area of the pentagon is " + (int) (area * 100 + 0.5) / 100.0);
    }
}
