package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter x3 and y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // First Co-ordination method to find the area of a triangle
//        {
//            double firstSide = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);
//            double secondSide = Math.pow((Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)), 0.5);
//            double thirdSide = Math.pow((Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)), 0.5);
//
//            double S = (firstSide + secondSide + thirdSide) / 2.0;
//            double area = Math.pow(S * (S -firstSide) * (S -secondSide) * (S -thirdSide), 0.5);
//
//            System.out.println("The area of the triangle is " + (int) (area * 100 + 0.5) / 100.0);
//        }

        // Second Co-ordination method to find the area of a triangle
        {
            double area = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2;
            area = area < 0 ? -1 * area : area;
            System.out.println("The area of the triangle is " + (int) (area * 100 + 0.5) / 100.0);
        }

    }
}
