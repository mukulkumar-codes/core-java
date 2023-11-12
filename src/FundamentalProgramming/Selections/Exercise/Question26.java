package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean divisibleByBoth = number % 4 == 0 && number % 5 == 0;
        boolean divisibleBy4Or5 = number % 4 == 0 || number % 5 == 0;
        boolean divisibleByAnyOneNotBoth = number % 4 == 0 ^ number % 5 == 0;

        System.out.println("Is " + number + " divisible by 4 and 5 ? " + divisibleByBoth);
        System.out.println("Is " + number + " divisible by 4 or 5 ? " + divisibleBy4Or5);
        System.out.println("Is " + number + " divisible by 4 or 5 but not both ? " + divisibleByAnyOneNotBoth);
    }
}
