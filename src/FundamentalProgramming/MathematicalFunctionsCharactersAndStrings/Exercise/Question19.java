package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN: ");
        String ISBNString = input.nextLine();

        long ISBN = Integer.parseInt(ISBNString);

        byte digitNine = (byte) (ISBN % 10);
        byte digitEight = (byte) ((ISBN % 100) / 10);
        byte digitSeven = (byte) ((ISBN % 1000) / 100);
        byte digitSix = (byte) ((ISBN % 10000) / 1000);
        byte digitFive = (byte) ((ISBN % 100000) / 10000);
        byte digitFour = (byte) ((ISBN % 1000000) / 100000);
        byte digitThree = (byte) ((ISBN % 10000000) / 1000000);
        byte digitTwo = (byte) ((ISBN % 100000000) / 10000000);
        byte digitOne = (byte) ((ISBN % 1000000000) / 100000000);

        byte digitTen =
                (byte)((digitOne + digitTwo * 2 + digitThree * 3 + digitFour * 4 + digitFive * 5 + digitSix * 6 + digitSeven * 7 + digitEight * 8 + digitNine * 9) % 11);

        if (digitTen == 10){
            System.out.println("The ISBN-10 number is " + ISBNString + "X.");
        } else {
            System.out.println("The ISBN-10 number is " + ISBNString + digitTen + ".");
        }
    }
}
