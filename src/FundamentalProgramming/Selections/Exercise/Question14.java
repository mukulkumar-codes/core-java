package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        byte headOrTail = (byte) ((Math.random() * 100) % 2);

        System.out.print("Enter 0 for HEAD and 1 for TAIL: ");
        byte guess = input.nextByte();

        if (headOrTail == 0 && headOrTail == guess){
            System.out.println("User guessed and system generated Head, which is correct.");
        } else if (headOrTail == 0 && guess == 1){
            System.out.println("User guessed Tail and system generated Head, which is incorrect.");
        } else if (headOrTail == 1 && guess == 0){
            System.out.println("User guessed Head and system generated Tail, which is incorrect.");
        } else if (headOrTail == 1 && headOrTail == guess){
            System.out.println("User guessed and system generated Tail, which is correct.");
        } else {
            System.out.println("Enter an valid guess next time as per given.");
        }
    }
}
