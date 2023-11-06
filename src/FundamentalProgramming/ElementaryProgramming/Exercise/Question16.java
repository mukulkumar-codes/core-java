package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();

        // Area of a Hexagon = 3 * 3^0.5 * side*side / 2;
        double areaOfHexagon = 3 * Math.pow(3, 0.5) * Math.pow(side, 2) / 2;

        System.out.println("The area of the hexagon is " + (int) (areaOfHexagon * 100) / 100.0);
    }
}
