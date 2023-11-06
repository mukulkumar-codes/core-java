package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double midOfX = (x1 + x2) / 2.0;
        double midOfY = (y1 + y2) / 2.0;

        System.out.println("Mid point of point (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") = (" + midOfX +
                ", " + midOfY + ").");
    }
}
