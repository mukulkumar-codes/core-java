package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        //This is solved using Zeller’s congruence algorithm
        Scanner input = new Scanner(System.in);
        // 0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday,
        // 4: Wednesday, 5: Thursday, and 6: Friday
        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter month(1-12) of the year: ");
        int month = input.nextInt();
        if (month <= 2){
            month = month + 12;
            year =  year - 1;
        }

        System.out.print("Enter the day(1-31) of the month: ");
        int day = input.nextInt();

        int weekday =
                (day + 26 * (month + 1) / 10 + year % 100 + year % 100 / 4 + year / 100 / 4 + 5 * (year / 100)) % 7;

        switch (weekday){
            case 0:
                System.out.println("Day of the week is Saturday.");
                break;
            case 1:
                System.out.println("Day of the week is Sunday.");
                break;
            case 2:
                System.out.println("Day of the week is Monday.");
                break;
            case 3:
                System.out.println("Day of the week is Tuesday.");
                break;
            case 4:
                System.out.println("Day of the week is Wednesday.");
                break;
            case 5:
                System.out.println("Day of the week is Thursday.");
                break;
            case 6:
                System.out.println("Day of the week is Friday.");
                break;
        }
    }
}
