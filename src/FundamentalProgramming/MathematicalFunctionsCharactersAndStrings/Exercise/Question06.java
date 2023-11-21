package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the center point of the circle: ");
        double centerX = input.nextDouble();
        double centerY = input.nextDouble();

        System.out.print("Enter the radius of (" + centerX + ", " + centerY + ") point centered circle: ");
        double radius = input.nextDouble();

        double randomAngleOne = (int)(Math.random() * 100000 + 0.5) % 360;
        double randomAngleTwo = (int)(Math.random() * 100000 + 0.5) % 360;
        double randomAngleThree = (int)(Math.random() * 100000 + 0.5) % 360;


        if ((int)(randomAngleOne) % 2 == 0)
            randomAngleOne = -randomAngleOne;
        if ((int)(randomAngleTwo) % 2 != 0)
            randomAngleTwo = - randomAngleTwo;
        if ((int)(randomAngleThree % 3) == 0)
            randomAngleThree = -randomAngleThree;

        // formula to generate random points on the circle boundary
        // x = r×cos(a) and y = r×sin(a); r -> radius, a -> angle in radians

        // for point (x1, y1)
        double x1 = radius * Math.cos(Math.toRadians(randomAngleOne));
        double y1 = radius * Math.sin(Math.toRadians(randomAngleOne));

        // for point (x1, y1)
        double x2 = radius * Math.cos(Math.toRadians(randomAngleTwo));
        double y2 = radius * Math.sin(Math.toRadians(randomAngleTwo));

        // for point (x1, y1)
        double x3 = radius * Math.cos(Math.toRadians(randomAngleThree));
        double y3 = radius * Math.sin(Math.toRadians(randomAngleThree));

        System.out.printf("First random point: (%5.2f, %5.2f)\n",x1, y1);
        System.out.printf("Second random point: (%5.2f, %5.2f)\n",x2, y2);
        System.out.printf("Third random point: (%5.2f, %5.2f)\n",x3, y3);
    }
}
