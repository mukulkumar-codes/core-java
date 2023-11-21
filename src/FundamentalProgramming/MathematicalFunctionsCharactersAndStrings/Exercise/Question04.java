package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter the side of Hexagon to calculate the area: ");
        double side = input.nextDouble();

        double areaOfHexagon = 6 * side * side / (4 * Math.tan(Math.PI/6));

        System.out.println("The area of the hexagon is " + (int) (areaOfHexagon * 100 + 0.5) / 100.0);
    }
}
