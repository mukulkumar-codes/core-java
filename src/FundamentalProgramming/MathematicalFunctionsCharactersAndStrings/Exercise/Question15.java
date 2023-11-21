package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.nextLine().toUpperCase().charAt(0);
        switch (letter){
            case 'A':
            case 'B':
            case 'C':
                System.out.println("The corresponding number is 2.");
                break;
            case 'D':
            case 'E':
            case 'F':
                System.out.println("The corresponding number is 3.");
                break;
            case 'G':
            case 'H':
            case 'I':
                System.out.println("The corresponding number is 4.");
                break;
            case 'J':
            case 'K':
            case 'L':
                System.out.println("The corresponding number is 5.");
                break;
            case 'M':
            case 'N':
            case 'O':
                System.out.println("The corresponding number is 6.");
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                System.out.println("The corresponding number is 7.");
                break;
            case 'T':
            case 'U':
            case 'V':
                System.out.println("The corresponding number is 8.");
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                System.out.println("The corresponding number is 9.");
                break;
            default:
                System.out.println(letter + " is an invalid input.");
        }
    }
}
