package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 1000);
        int number2 = (int)(Math.random() * 1000);

//        if(number1 < number2){
//            int temp = number1;
//            number1 = number2;
//            number2 = temp;
//        }

        System.out.print("What is " + number1 + " * " + number2 + " = ");
        int answer = input.nextInt();

        if (number1 * number2 == answer)
            System.out.println("You are correct!");
        else{
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " * " + number2 + " should be " + (number1 * number2));
        }
    }
}
