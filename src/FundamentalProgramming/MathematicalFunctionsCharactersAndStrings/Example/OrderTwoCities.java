package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Example;

import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String cityOne = input.nextLine();

        System.out.print("Enter the second city: ");
        String cityTwo = input.nextLine();

        if (cityOne.compareTo(cityTwo) < 0)
            System.out.println("The cities in alphabetical order are " + cityOne + " " + cityTwo);
        else
            System.out.println("The cities in alphabetical order are " + cityTwo + " " + cityOne);
    }
}
