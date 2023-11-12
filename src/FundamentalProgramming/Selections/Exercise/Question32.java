package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double p0x1 = input.nextDouble();
        double p0y1 = input.nextDouble();
        double p1x1 = input.nextDouble();
        double p1y1 = input.nextDouble();
        double p2x1 = input.nextDouble();
        double p2y1 = input.nextDouble();

        // (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)
        double pointEvaluation = (p1x1 - p0x1) * (p2y1 - p0y1) - (p2x1 - p0x1) * (p1y1 - p0y1);

        if (pointEvaluation > 0)
            System.out.println("(" + p2x1 + ", " + p2y1 + ") is on the left side of the line.");
        else if (pointEvaluation == 0)
            System.out.println("(" + p2x1 + ", " + p2y1 + ") is on the same line.");
        else
            System.out.println("(" + p2x1 + ", " + p2y1 + ") is on the right side of the line.");
    }
}
