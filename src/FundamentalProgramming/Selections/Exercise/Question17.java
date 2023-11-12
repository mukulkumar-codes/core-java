package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte systemGenerated = (byte)((Math.random() * 100) % 3);
        System.out.println(systemGenerated);

        System.out.print("Enter as given scissor (0), rock (1), paper (2): ");
        byte guess = input.nextByte();

        // Scissors can cut a paper, a rock can knock scissors, and a paper can wrap a rock

        switch (systemGenerated){
            case 0:
                switch (guess){
                    case 0:
                        System.out.println("System Move\t\tUser Move\t\tDescription\t\t\t\t\tResult");
                        System.out.println("\tScissor\t\tScissor\t\t\tBoth have scissor move\t\tA draw");
                        break;
                    case 1:
                        System.out.println("System Move\t\tUser Move\t\tDescription\t\t\t\t\tResult");
                        System.out.println("\tScissor\t\tRock\t\t\ta rock can knock a scissor\tUser Win");
                        break;
                    case 2:
                        System.out.println("System Move\t\tUser Move\t\tDescription\t\t\t\t\tResult");
                        System.out.println("\tScissor\t\tPaper\t\t\tA scissor can cut a paper\tSystem win");
                        break;
                    default:
                        System.out.println("User move is invalid");
                }
                break;
            case 1:
                switch (guess){
                    case 0:
                        System.out.println("System Move\t\tUser Move\t\tDescription\t\t\t\t\t\tResult");
                        System.out.println("\trock\t\tScissor\t\t\ta rock can knock a scissor\t\tSystem win");
                        break;
                    case 1:
                        System.out.println("System Move\t\tUser Move\t\tDescription\t\t\t\t\tResult");
                        System.out.println("\trock\t\tRock\t\t\tBoth have rock move\t\tA draw");
                        break;
                    case 2:
                        System.out.println("System Move\t\tUser Move\t\tDescription\t\t\t\t\tResult");
                        System.out.println("\trock\t\tPaper\t\t\tA paper can wrap a rock\t\tUser win");
                        break;
                    default:
                        System.out.println("User move is invalid");
                }
                break;
            case 2:
                switch (guess){
                    case 0:
                        System.out.println("System Move\t\tUser Move\t\tDescription\t\t\t\t\tResult");
                        System.out.println("\tPaper\t\tScissor\t\t\tA scissor can cut a paper\tUser win");
                        break;
                    case 1:
                        System.out.println("System Move\t\tUser Move\t\tDescription\t\t\t\t\tResult");
                        System.out.println("\tPaper\t\tRock\t\t\tA paper can wrap a rock\t\tSystem Win");
                        break;
                    case 2:
                        System.out.println("System Move\t\tUser Move\t\tDescription\t\t\t\t\tResult");
                        System.out.println("\tPaper\t\tPaper\t\t\tBoth have paper move\t\tA draw");
                        break;
                    default:
                        System.out.println("User move is invalid");
                }
                break;
            default:
                System.out.println("System generate an invalid move.");
        }
    }
}
