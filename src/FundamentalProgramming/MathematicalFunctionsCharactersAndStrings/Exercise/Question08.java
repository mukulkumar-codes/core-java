package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question08 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a character to get its ASCII value: ");
    String userInput = input.nextLine();
    char character = userInput.charAt(0);

    System.out.println("The ASCII code for character " + character + " is " + (int) character);
}

}
