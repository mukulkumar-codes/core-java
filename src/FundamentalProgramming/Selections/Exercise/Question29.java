package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle1’s center x-, y-coordinates, and radius: ");
        double pointXOne = input.nextDouble();
        double pointYOne = input.nextDouble();
        double radiusOne = input.nextDouble();

        System.out.print("Enter circle2’s center x-, y-coordinates, and radius: ");
        double pointXTwo = input.nextDouble();
        double pointYTwo = input.nextDouble();
        double radiusTwo = input.nextDouble();

        // Center point of the second circle inside first circle or not
        double distance =
                Math.pow((pointXOne - pointXTwo) * (pointXOne - pointXTwo) + (pointYOne - pointYTwo)* (pointYOne - pointYTwo), 0.5);
        boolean centerTwoInside = distance < radiusOne;

        if ((distance  + radiusTwo) <= radiusOne)
            System.out.println("circle2 is inside circle1.");
        else if(distance >= radiusTwo + radiusOne)
            System.out.println("circle2 is outside circle1.");
        else
            System.out.println("circle2 overlaps circle1");
    }
}
