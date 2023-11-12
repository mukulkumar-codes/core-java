package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)
        double pointEvaluation = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (pointEvaluation == 0 && (x2 < x1 && x2 > x0) && (y2 < y1 && y2 > y0)){
            System.out.println("(" + x2 + ", " + y2 + ")  is on the line segment from (" + x0 + ", " + y0 +
                    ") (" + x1 + ", " + y1 + ").");
        } else {
            System.out.println("(" + x2 + ", " + y2 + ")  is not on the line segment from (" + x0 + ", " + y0 +
                    ") (" + x1 + ", " + y1 + ").");
        }

    }
}
