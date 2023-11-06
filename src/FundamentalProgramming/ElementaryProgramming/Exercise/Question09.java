package FundamentalProgramming.ElementaryProgramming.Exercise;

import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial velocity (m/s), final velocity (m/s), and time (s): ");
        double initialVelocity = input.nextDouble();
        double finalVelocity = input.nextDouble();
        double time = input.nextDouble();

        double acceleration = (finalVelocity - initialVelocity) / time;
        System.out.println("The average acceleration is " + (int) (acceleration * 10000) / 10000.0);
    }
}
