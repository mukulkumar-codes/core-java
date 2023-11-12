package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1’s center x-, y-coordinates, width, and height: ");
        double pointXOne = input.nextDouble();
        double pointYOne = input.nextDouble();
        double widthOne = input.nextDouble();
        double heightOne = input.nextDouble();

        System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
        double pointXTwo = input.nextDouble();
        double pointYTwo = input.nextDouble();
        double widthTwo = input.nextDouble();
        double heightTwo = input.nextDouble();

        // Center point of the second Rectangle inside first Rectangle or not
        double fromLeft = (int)((pointXOne - widthOne / 2) * 10) / 10.0;
        double fromRight = (int)((widthOne / 2  + pointXOne) * 10) / 10.0;
        double fromTop = (int)((heightOne / 2  + pointYOne) * 10) / 10.0;
        double fromBottom = (int)((pointYOne - heightOne / 2) * 10) / 10.0;

        boolean centerTwoInside =
                pointXTwo < fromRight && pointXTwo > fromLeft && pointYTwo < fromTop && pointYTwo > fromBottom;


        // Sides of the rectangle two is inside the rectangle one or not
        double distanceOnX = Math.pow((pointXOne - pointXTwo) * (pointXOne - pointXTwo), 0.5);
        double distanceOnY = Math.pow((pointYOne - pointYTwo) * (pointYOne - pointYTwo), 0.5);
        boolean rectangleOutsideX = distanceOnX > (widthOne / 2 + widthTwo / 2);
        boolean rectangleOutsideY = distanceOnY > (heightOne / 2 + heightTwo / 2);

        boolean wallHeightInside = (heightOne / 2) >= distanceOnX + heightTwo / 2;
        boolean wallWidthInside = (widthOne / 2) >= distanceOnY + widthTwo / 2;

        if (centerTwoInside && wallWidthInside && wallHeightInside)
            System.out.println("Rectangle 2 is inside the Rectangle 1.");
        else if(rectangleOutsideX && rectangleOutsideY)
            System.out.println("Rectangle 2 is outside the Rectangle 1.");
        else
            System.out.println("Rectangle 2 is overlaps the Rectangle 1.");
    }
}
