package FundamentalProgramming.Selections.Example;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte firstNumber = (byte) (System.currentTimeMillis() % 10);
        byte secondNumber = (byte) (System.currentTimeMillis() / 10 % 10);

        System.out.print("Addition of " + firstNumber + " + " + secondNumber + " = ");
        byte answer = input.nextByte();

        System.out.println("Evaluation " + firstNumber + " + " + secondNumber + " = " + answer +" is " + (answer == firstNumber + secondNumber));
    }
}
