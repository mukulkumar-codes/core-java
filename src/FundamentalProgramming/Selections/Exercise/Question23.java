package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the center point of the rectangle: ");
        double centerPointX = input.nextDouble();
        double centerPointY = input.nextDouble();

        System.out.print("Enter the height and width of the rectangle: ");
        double height = input.nextDouble();
        double width = input.nextDouble();

        System.out.print("Enter the point to check is it inside the rectangle or not: ");
        double pointX = input.nextDouble();
        double pointY = input.nextDouble();

        double fromLeft = (int)((centerPointX - width / 2) * 10) / 10.0;
        double fromRight = (int)((width / 2  + centerPointX) * 10) / 10.0;
        double fromTop = (int)((height / 2  + centerPointY) * 10) / 10.0;
        double fromBottom = (int)((centerPointY - height / 2) * 10) / 10.0;

        if (pointX < fromRight && pointX > fromLeft && pointY < fromTop && pointY > fromBottom)
            System.out.println("Point (" + pointX + ", " + pointY + ") is inside the rectangle.");
        else
            System.out.println("Point (" + pointX + ", " + pointY + ") is outside the rectangle.");
    }
}
