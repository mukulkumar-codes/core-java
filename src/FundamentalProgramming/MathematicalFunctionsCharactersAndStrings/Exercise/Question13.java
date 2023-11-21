package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.nextLine().charAt(0);

        if (letter >= 'A' && letter <= 'Z' || letter >= 'a' && letter <= 'z'){
            if (letter == 'A' || letter =='E' || letter =='I'|| letter =='O'|| letter =='U' || letter == 'a' || letter =='e' || letter =='i'|| letter =='o'|| letter =='u')
                System.out.println(letter + " is a vowel.");
            else
                System.out.println(letter + " is a consonant.");
        } else
            System.out.println(letter + " is an invalid input as per the english alphabet.");
    }
}
