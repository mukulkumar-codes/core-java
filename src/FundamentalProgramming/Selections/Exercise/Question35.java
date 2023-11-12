package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an natural number to check whether it is even or odd: ");
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is an even number.");
        else
            System.out.println(number + " is an odd number");
    }
}
