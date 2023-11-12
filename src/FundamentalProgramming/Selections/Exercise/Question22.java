package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the (0,0) centered circle: ");
        double radius = input.nextDouble();

        System.out.print("Enter a point to check whether it is inside the circle or not: ");
        byte x = input.nextByte();
        byte y = input.nextByte();

        double distance = (int) (Math.pow(x*x + y*y, 0.5) * 100) / 100.0;

        if (distance < radius){
            System.out.println("The point (" + x + ", " + y + ") is inside the circle.");
        } else if (distance == radius) {
            System.out.println("The point (" + x + ", " + y + ") is on the boundary of the circle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the circle.");
        }

    }
}
