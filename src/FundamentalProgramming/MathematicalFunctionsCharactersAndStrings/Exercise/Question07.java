package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the center point of the Pentagon: ");
        double centerX = input.nextDouble();
        double centerY = input.nextDouble();

        System.out.print("Enter the radius of (" + centerX + ", " + centerY + ") point bounding circle of pentagon: ");
        double radius = input.nextDouble();

        // for point (x1, y1)
        double x1 = radius * Math.cos(Math.toRadians(90));
        double y1 = radius * Math.sin(Math.toRadians(90));

        // for point (x2, y2)
        double x2 = radius * Math.cos(Math.toRadians(162));
        double y2 = radius * Math.sin(Math.toRadians(162));

        // for point (x3, y3)
        double x3 = radius * Math.cos(Math.toRadians(234));
        double y3 = radius * Math.sin(Math.toRadians(234));

        // for point (x4, y4)
        double x4 = radius * Math.cos(Math.toRadians(306));
        double y4 = radius * Math.sin(Math.toRadians(306));

        // for point (x5, y5)
        double x5 = radius * Math.cos(Math.toRadians(18));
        double y5 = radius * Math.sin(Math.toRadians(18));

        System.out.printf("First point: (%5.2f, %5.2f)\n",x1, y1);
        System.out.printf("Second point: (%5.2f, %5.2f)\n",x2, y2);
        System.out.printf("Third point: (%5.2f, %5.2f)\n",x3, y3);
        System.out.printf("Fourth point: (%5.2f, %5.2f)\n",x4, y4);
        System.out.printf("Fifth point: (%5.2f, %5.2f)\n",x5, y5);
    }
}
