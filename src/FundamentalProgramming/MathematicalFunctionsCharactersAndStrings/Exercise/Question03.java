package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {

        final double RADIUS_OF_EARTH = 6_371.01;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Atlanta (latitude and longitude) in degrees: ");
        double atlantaLatitude = input.nextDouble();
        double atlantaLongitude = input.nextDouble();

        System.out.print("Enter Orlando (latitude and longitude) in degrees: ");
        double orlandoLatitude = input.nextDouble();
        double orlandoLongitude = input.nextDouble();

        System.out.print("Enter Savannah (latitude and longitude) in degrees: ");
        double savannahLatitude = input.nextDouble();
        double savannahLongitude = input.nextDouble();

        System.out.print("Enter Charlotte (latitude and longitude) in degrees: ");
        double charlotteLatitude = input.nextDouble();
        double charlotteLongitude = input.nextDouble();

        // formula for the great circle distance
        // d = radius * arccos(sin (atlantaLatitude) * sin(orlandoLatitude) + cos(atlantaLatitude) * cos(orlandoLatitude) * cos(atlantaLongitude - orlandoLongitude))

        double atlantaToOrlando =
                RADIUS_OF_EARTH * Math.acos(Math.sin(Math.toRadians(atlantaLatitude)) * Math.sin(Math.toRadians(orlandoLatitude)) + Math.cos(Math.toRadians(atlantaLatitude)) * Math.cos(Math.toRadians(orlandoLatitude)) * Math.cos(Math.toRadians(atlantaLongitude - orlandoLongitude)));

        double orlandoToSavannah =
                RADIUS_OF_EARTH * Math.acos(Math.sin(Math.toRadians(orlandoLatitude)) * Math.sin(Math.toRadians(savannahLatitude)) + Math.cos(Math.toRadians(orlandoLatitude)) * Math.cos(Math.toRadians(savannahLatitude)) * Math.cos(Math.toRadians(orlandoLongitude - savannahLongitude)));

        double savannahToAtlanta =
                RADIUS_OF_EARTH * Math.acos(Math.sin(Math.toRadians(savannahLatitude)) * Math.sin(Math.toRadians(atlantaLatitude)) + Math.cos(Math.toRadians(savannahLatitude)) * Math.cos(Math.toRadians(atlantaLatitude)) * Math.cos(Math.toRadians(savannahLongitude - atlantaLongitude)));

        double atlantaToCharlotte =
                RADIUS_OF_EARTH * Math.acos(Math.sin(Math.toRadians(atlantaLatitude)) * Math.sin(Math.toRadians(charlotteLatitude)) + Math.cos(Math.toRadians(atlantaLatitude)) * Math.cos(Math.toRadians(charlotteLatitude)) * Math.cos(Math.toRadians(atlantaLongitude - charlotteLongitude)));

        double savannahToCharlotte =
                RADIUS_OF_EARTH * Math.acos(Math.sin(Math.toRadians(savannahLatitude)) * Math.sin(Math.toRadians(charlotteLatitude)) + Math.cos(Math.toRadians(savannahLatitude)) * Math.cos(Math.toRadians(charlotteLatitude)) * Math.cos(Math.toRadians(savannahLongitude - charlotteLongitude)));
        
        double semiPerimeterOne = (atlantaToOrlando + orlandoToSavannah + savannahToAtlanta) / 2;
        double firstTriangleArea =
                Math.sqrt(semiPerimeterOne * (semiPerimeterOne - atlantaToOrlando) * (semiPerimeterOne - orlandoToSavannah) * (semiPerimeterOne - savannahToAtlanta));
        double semiPerimeterTwo = (atlantaToCharlotte + savannahToCharlotte + savannahToAtlanta) / 2;
        double secondTriangleArea =
                Math.sqrt(semiPerimeterTwo * (semiPerimeterTwo - atlantaToCharlotte) * (semiPerimeterTwo - savannahToCharlotte) * (semiPerimeterTwo - savannahToAtlanta));
        
        double totalArea = firstTriangleArea + secondTriangleArea;

        System.out.printf("Area of land covered by Atlanta, Orlando, Savannah and Charlotte is %4.2f square kilometer",
                totalArea);
        // Atlanta (latitude, longitude) => 33.749 -84.38798
        // Orlando (latitude, longitude) => 28.53834 -81.37924
        // Savannah (latitude, longitude) => 32.076176 -81.088371
        // Charlotte (latitude, longitude) => 35.227085 -80.843124
    }
}
