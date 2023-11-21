package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();
        char hexDigit = hexString.toUpperCase().charAt(0);

        switch (hexDigit){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println("The binary value is " + Integer.toBinaryString ((int) hexDigit - 48));
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                System.out.println("The binary value is " + Integer.toBinaryString ((int) hexDigit - 55));
                break;
            default:
                System.out.println( hexDigit + " is an invalid input.");
        }
    }
}
