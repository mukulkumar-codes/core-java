package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // I: Information Management
        // C: Computer Science
        // A: Accounting
        // character 1, 2, 3, 4, which
        //indicates whether a student is a freshman, sophomore, junior, or senior

        System.out.print("Enter two characters: ");
        String characters = input.nextLine();

        switch (characters.charAt(0)){
            case 'I':
                switch (characters.charAt(1)){
                    case '1':
                        System.out.println("Information Management freshman");
                        break;
                    case '2':
                        System.out.println("Information Management sophomore");
                        break;
                    case '3':
                        System.out.println("Information Management junior");
                        break;
                    case '4':
                        System.out.println("Information Management senior");
                        break;
                    default:
                        System.out.println("Invalid input");

                }
                break;
            case 'C':
                switch (characters.charAt(1)){
                    case '1':
                        System.out.println("Computer Science freshman");
                        break;
                    case '2':
                        System.out.println("Computer Science sophomore");
                        break;
                    case '3':
                        System.out.println("Computer Science junior");
                        break;
                    case '4':
                        System.out.println("Computer Science senior");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
                break;
            case 'A':
                switch (characters.charAt(1)){
                    case '1':
                        System.out.println("Accounting freshman");
                        break;
                    case '2':
                        System.out.println("Accounting sophomore");
                        break;
                    case '3':
                        System.out.println("Accounting junior");
                        break;
                    case '4':
                        System.out.println("Accounting senior");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
