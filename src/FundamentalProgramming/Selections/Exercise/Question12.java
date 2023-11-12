package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three digit number to check whether it is palindrome or not: ");
        int number = input.nextInt();

        int palindromeNumber = (number % 10) * 100 + (number % 100 / 10) * 10 + (number / 100);

        if ((number > -1000) && (number < 1000)){
            if (number == palindromeNumber){
                System.out.println(number + " is palindrome number.");
            } else {
                System.out.println(number + " is not a palindrome number.");
            }
        } else{
            System.out.println("Enter only three digit number to check whether it is palindrome or not");
        }
    }
}
