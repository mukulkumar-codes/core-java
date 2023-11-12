package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {

        // Generate a random lottery number of 3 digits
        int lottery = (int)(Math.random() * 1000);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        // get digits from the lottery
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = lottery % 100 / 10;
        int lotteryDigit3 = lottery % 10;

        // Get digits from guess
        int guessDigit1 = guess / 100;
        int guessDigit2 = guess % 100 / 10;
        int guessDigit3 = guess % 10;

        int lotteryPalindrome = lotteryDigit3 * 100 + lotteryDigit2 * 10 + lotteryDigit1;

        System.out.println("The lottery number is " + lottery);

        //check the guess
        if (guess > 0 && guess < 1000) {
            if (guess == lottery)
                System.out.println("Exact match: you win $12,000");
            else if (guess == lotteryPalindrome)
                System.out.println("Match all digits: you win $5,000");
            else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
                System.out.println("Match some digits: you win $2,000");
            else
                System.out.println("Sorry, no match");
        } else
            System.out.println("Your guess is violating the rules.");
    }
}
