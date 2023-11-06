package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of equilateral triangle: ");
        double side = input.nextDouble();

        // area of equilateral triangle Math.pow(3, 0.5) / 4 * side * side
        // volume = area * length

        double area = Math.pow(3, 0.5) * Math.pow(side, 2) / 4;
        double volume = area * side;

        System.out.println("Area of equilateral triangle with side " + side + " is " + (int) (area * 100) / 100.0);
        System.out.println("Volume of equilateral triangle with side " + side + " is " + (int) (volume * 100) / 100.0);
    }
}
