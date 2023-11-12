package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = (int) (Math.random() * 10);
        int secondNumber = (int) (Math.random() * 10);
        int thirdNumber = (int) (Math.random() * 10);

        System.out.print(firstNumber + " * " + secondNumber + " * " + thirdNumber + " = ");
        int answer = input.nextInt();

        System.out.println("Evaluation " + firstNumber + " * " + secondNumber + " * " + thirdNumber + " = " + answer + " is " + (answer == firstNumber * secondNumber * thirdNumber));
    }
}
