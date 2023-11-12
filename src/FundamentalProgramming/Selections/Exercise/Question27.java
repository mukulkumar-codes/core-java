package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Right angle triangle point is placed on (0, 0) other two points are placed at (200, 0) " +
                "and (0, 100).");
        System.out.print("Enter a point’s x- and y-coordinates to check whether is it inside the triangle or not: ");

        double pointX = input.nextDouble();
        double pointY = input.nextDouble();

        double checkerPointY = (200 - pointX) / 2;

        if (pointX <= 200 && pointY <= checkerPointY)
            System.out.println("Point (" + pointX + ", " + pointY + ") is inside the triangle.");
        else
            System.out.println("Point (" + pointX + ", " + pointY + ") is outside the triangle.");
    }
}
