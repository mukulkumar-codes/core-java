package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter binary digits (0000 to 1111): ");
        String binaryString = input.nextLine();

        int intValue = Integer.parseInt(binaryString);
        int integer = 0;

        if (intValue % 10 == 1){
            intValue /= 10;
            integer += (int) Math.pow(2, 0);
        } else {
            intValue /= 10;
        }

        if (intValue % 10 == 1){
            intValue /= 10;
            integer += (int) Math.pow(2, 1);
        } else {
            intValue /= 10;
        }

        if (intValue % 10 == 1){
            intValue /= 10;
            integer += (int) Math.pow(2, 2);
        } else {
            intValue /= 10;
        }

        if (intValue % 10 == 1){
            intValue /= 10;
            integer += (int) Math.pow(2, 3);
        }

        System.out.println("The decimal value is " + integer);

    }
}
