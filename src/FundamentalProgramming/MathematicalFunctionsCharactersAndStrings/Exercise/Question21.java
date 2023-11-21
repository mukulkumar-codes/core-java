package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter social security number(DDD-DD-DDDD): ");
        String SSN = input.nextLine();

        char firstIndex = SSN.charAt(3);
        char secondIndex = SSN.charAt(6);

        if (firstIndex == '-' && secondIndex == '-')
            System.out.println(SSN + " is a valid social security number.");
        else
            System.out.println(SSN + " is an invalid social security number.");
    }
}
