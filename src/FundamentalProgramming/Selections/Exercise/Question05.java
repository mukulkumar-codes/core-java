package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sunday as 0 || Monday as 1 || Tuesday as 2 || Wednesday as 4 ||\n Thursday as 5 || Friday" +
                "as 6 || Saturday as 7\n");

        System.out.print("Enter today’s day: ");
        int day = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();
        int elapsedDay = (day + elapsed) % 7;

        // Today is Monday and the future day is Thursday
        switch (day){
            case 0:
                switch (elapsedDay){
                    case 0:
                        System.out.println("Today is Sunday and the future day is Sunday.");
                        break;
                    case 1:
                        System.out.println("Today is Sunday and the future day is Monday.");
                        break;
                    case 2:
                        System.out.println("Today is Sunday and the future day is Tuesday.");
                        break;
                    case 3:
                        System.out.println("Today is Sunday and the future day is Wednesday.");
                        break;
                    case 4:
                        System.out.println("Today is Sunday and the future day is Thursday.");
                        break;
                    case 5:
                        System.out.println("Today is Sunday and the future day is Friday.");
                        break;
                    case 6:
                        System.out.println("Today is Sunday and the future day is Saturday.");
                        break;
                }
                break;
            case 1:
                switch (elapsedDay){
                    case 0:
                        System.out.println("Today is Monday and the future day is Sunday.");
                        break;
                    case 1:
                        System.out.println("Today is Monday and the future day is Monday.");
                        break;
                    case 2:
                        System.out.println("Today is Monday and the future day is Tuesday.");
                        break;
                    case 3:
                        System.out.println("Today is Monday and the future day is Wednesday.");
                        break;
                    case 4:
                        System.out.println("Today is Monday and the future day is Thursday.");
                        break;
                    case 5:
                        System.out.println("Today is Monday and the future day is Friday.");
                        break;
                    case 6:
                        System.out.println("Today is Monday and the future day is Saturday.");
                        break;
                }
                break;
            case 2:
                switch (elapsedDay){
                    case 0:
                        System.out.println("Today is Tuesday and the future day is Sunday.");
                        break;
                    case 1:
                        System.out.println("Today is Tuesday and the future day is Monday.");
                        break;
                    case 2:
                        System.out.println("Today is Tuesday and the future day is Tuesday.");
                        break;
                    case 3:
                        System.out.println("Today is Tuesday and the future day is Wednesday.");
                        break;
                    case 4:
                        System.out.println("Today is Tuesday and the future day is Thursday.");
                        break;
                    case 5:
                        System.out.println("Today is Tuesday and the future day is Friday.");
                        break;
                    case 6:
                        System.out.println("Today is Tuesday and the future day is Saturday.");
                        break;
                }
                break;
            case 3:
                switch (elapsedDay){
                    case 0:
                        System.out.println("Today is Wednesday and the future day is Sunday.");
                        break;
                    case 1:
                        System.out.println("Today is Wednesday and the future day is Monday.");
                        break;
                    case 2:
                        System.out.println("Today is Wednesday and the future day is Tuesday.");
                        break;
                    case 3:
                        System.out.println("Today is Wednesday and the future day is Wednesday.");
                        break;
                    case 4:
                        System.out.println("Today is Wednesday and the future day is Thursday.");
                        break;
                    case 5:
                        System.out.println("Today is Wednesday and the future day is Friday.");
                        break;
                    case 6:
                        System.out.println("Today is Wednesday and the future day is Saturday.");
                        break;
                }
                break;
            case 4:
                switch (elapsedDay){
                    case 0:
                        System.out.println("Today is Thursday and the future day is Sunday.");
                        break;
                    case 1:
                        System.out.println("Today is Thursday and the future day is Monday.");
                        break;
                    case 2:
                        System.out.println("Today is Thursday and the future day is Tuesday.");
                        break;
                    case 3:
                        System.out.println("Today is Thursday and the future day is Wednesday.");
                        break;
                    case 4:
                        System.out.println("Today is Thursday and the future day is Thursday.");
                        break;
                    case 5:
                        System.out.println("Today is Thursday and the future day is Friday.");
                        break;
                    case 6:
                        System.out.println("Today is Thursday and the future day is Saturday.");
                        break;
                }
                break;
            case 5:
                switch (elapsedDay){
                    case 0:
                        System.out.println("Today is Friday and the future day is Sunday.");
                        break;
                    case 1:
                        System.out.println("Today is Friday and the future day is Monday.");
                        break;
                    case 2:
                        System.out.println("Today is Friday and the future day is Tuesday.");
                        break;
                    case 3:
                        System.out.println("Today is Friday and the future day is Wednesday.");
                        break;
                    case 4:
                        System.out.println("Today is Friday and the future day is Thursday.");
                        break;
                    case 5:
                        System.out.println("Today is Friday and the future day is Friday.");
                        break;
                    case 6:
                        System.out.println("Today is Friday and the future day is Saturday.");
                        break;
                }
                break;
            case 6:
                switch (elapsedDay){
                    case 0:
                        System.out.println("Today is Saturday and the future day is Sunday.");
                        break;
                    case 1:
                        System.out.println("Today is Saturday and the future day is Monday.");
                        break;
                    case 2:
                        System.out.println("Today is Saturday and the future day is Tuesday.");
                        break;
                    case 3:
                        System.out.println("Today is Saturday and the future day is Wednesday.");
                        break;
                    case 4:
                        System.out.println("Today is Saturday and the future day is Thursday.");
                        break;
                    case 5:
                        System.out.println("Today is Saturday and the future day is Friday.");
                        break;
                    case 6:
                        System.out.println("Today is Saturday and the future day is Saturday.");
                        break;
                }
                break;
        }
    }
}
