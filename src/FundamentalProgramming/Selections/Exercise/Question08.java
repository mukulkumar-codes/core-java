package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three random numbers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        
        int sum = firstNumber + secondNumber + thirdNumber;
        
        int largest = (firstNumber > secondNumber) ? (firstNumber > thirdNumber ? firstNumber : thirdNumber) : (secondNumber > thirdNumber ? secondNumber : thirdNumber);
        int smallest = firstNumber < secondNumber ? (firstNumber < thirdNumber ? firstNumber : thirdNumber) : (secondNumber < thirdNumber ? secondNumber : thirdNumber);
        int midNumber = sum - largest - smallest;

        System.out.println("Non-decreasing order : " + smallest + " " + midNumber + " " + largest);
    }
}
