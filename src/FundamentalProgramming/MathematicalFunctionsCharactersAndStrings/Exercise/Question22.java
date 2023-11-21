package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstString = input.nextLine();

        System.out.print("Enter first string: ");
        String secondString = input.nextLine();

        int indexOfSecondString = firstString.indexOf(secondString.charAt(0));
        int lengthOfSecondString = secondString.length();

        if (firstString.substring(indexOfSecondString,indexOfSecondString + lengthOfSecondString).equals(secondString)){
            System.out.println(secondString + " is a substring of " + firstString);
        } else {
            System.out.println(secondString + " is not a substring of " + firstString);
        }

    }
}
