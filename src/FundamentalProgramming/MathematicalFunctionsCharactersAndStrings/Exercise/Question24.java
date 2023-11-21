package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first country: ");
        String firstCountry = input.nextLine();

        System.out.print("Enter the second country: ");
        String secondCountry = input.nextLine();

        System.out.print("Enter the third country: ");
        String thirdCountry = input.nextLine();

        String descendingOrderOfCountries;

        if (firstCountry.compareTo(secondCountry) < 0){
            if (secondCountry.compareTo(thirdCountry) < 0){
                descendingOrderOfCountries = thirdCountry + " " + secondCountry + " " + firstCountry;
            } else {
                descendingOrderOfCountries = secondCountry + " " + thirdCountry + " " + firstCountry;
            }
        } else{
            if (firstCountry.compareTo(thirdCountry) < 0)
                descendingOrderOfCountries = thirdCountry + " " + firstCountry + " " + secondCountry;
            else
                descendingOrderOfCountries = firstCountry + " " + thirdCountry + " " + secondCountry;
        }

        System.out.println("The three countries in descending order are " + descendingOrderOfCountries);
    }
}
