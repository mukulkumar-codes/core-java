package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character to get its unicode value: ");
        String userInput = input.nextLine();
        char character = userInput.charAt(0);

        System.out.printf("The Unicode for the character %c is \\u%04x", character, (int) character);
    }
}
