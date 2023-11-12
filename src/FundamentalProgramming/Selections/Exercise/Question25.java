package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double pointX1 = input.nextDouble();
        double pointY1 = input.nextDouble();
        double pointX2 = input.nextDouble();
        double pointY2 = input.nextDouble();
        double pointX3 = input.nextDouble();
        double pointY3 = input.nextDouble();
        double pointX4 = input.nextDouble();
        double pointY4 = input.nextDouble();

        /* Lines of equation with two point (x1, y1) and (x2, y2)
            (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1

            Lines of equation with two point (x3, y3) and (x4, y4)
            (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
         */

        double determinant = (pointY1 - pointY2) * (pointX3 - pointX4) - (pointY3 - pointY4) * (pointX1 - pointX2);

        double absoluteValueOne = (pointY1 - pointY2) * pointX1 - (pointX1 - pointX2) * pointY1;
        double absoluteValueTwo = (pointY3 - pointY4) * pointX3 - (pointX3 - pointX4) * pointY3;

        double determinantX = absoluteValueOne * (pointX3 - pointX4) - absoluteValueTwo * (pointX1 - pointX2);
        double determinantY = (pointY1 - pointY2) * absoluteValueTwo - (pointY3 - pointY4) * absoluteValueOne;

        if (determinant != 0){
            double valueOfX = (int) (determinantX / determinant * 100 + 0.5) / 100.0;
            double valueOfY = (int) (determinantY / determinant * 100 + 0.5) / 100.0;
            System.out.println("The intersecting point is at (" + valueOfX + ", " + valueOfY + ")");
        } else {
            System.out.println("Lines are parallel and there is no intersecting point.");
        }

    }
}
