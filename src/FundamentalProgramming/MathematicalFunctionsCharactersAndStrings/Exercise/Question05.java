package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides for regular polygon: ");
        int numberOfSides = input.nextInt();

        System.out.print("Enter the length of sides for regular polygon: ");
        double side = input.nextDouble();

        double areaOfNSideRegularPolygon = numberOfSides * Math.pow(side, 2) / (4 * Math.tan(Math.PI / numberOfSides));

        System.out.println("The area of " + numberOfSides + " side regular polygon is " + (int)(areaOfNSideRegularPolygon * 100 + 0.5) / 100.0);
    }
}
