package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("first three letters of a month name (with the first letter in uppercase).");
        System.out.println();

        System.out.print("Enter a month: ");
        String month = input.nextLine();

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));

        switch (month){
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                System.out.println(month + " " + year + " has 31 days.");
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                System.out.println(month + " " + year + " has 30 days.");
                break;
            case "Feb":
                if (isLeapYear)
                    System.out.println(month + " " + year + " has 29 days.");
                else
                    System.out.println(month + " " + year + " has 28 days.");
                break;
            default:
                System.out.println(month + " is not a correct month name as per direction.");
                break;
        }
    }
}
