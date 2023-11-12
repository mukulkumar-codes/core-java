package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" the (0, 0) centered rectangle has (width = 50, height = 150) ->");

        int pointX = (int)(Math.random() * 100) % 25;
        int pointY = (int)(Math.random() * 100) % 75;

        System.out.println("Random point inside the (0, 0) centered rectangle: (" + pointX + ", " + pointY + ").");
    }

}
