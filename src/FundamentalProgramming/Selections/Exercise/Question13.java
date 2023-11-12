package FundamentalProgramming.Selections.Exercise;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("(0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household) \nEnter the filing status: ");
        byte status = input.nextByte();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        double tax = 0.0;

        if (status == 0){
            if (income <= 8_350)
                tax = income * 0.10;
            else if (income <= 33_950)
                tax = 8_350 * 0.10 + (income - 8_350) * 0.15;
            else if (income <= 82_250)
                tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (income - 33_950) * 0.25;
            else if (income <= 171_550)
                tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (income - 82_250) * 0.28;
            else if (income <= 372_950)
                tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (171_550 - 82_250) * 0.28 + (income - 171_550) * 0.33;
            else
                tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (171_550 - 82_250) * 0.28 + (372_950 - 171_550) * 0.33 + (income - 372_950) * 0.35;
        } else if (status == 1) {
            if (income <= 16_700)
                tax = income * 0.10;
            else if(income <= 67_900)
                tax = 16_700 * 0.10 + (income - 16_700) * 0.15;
            else if (income <= 137_050)
                tax = 16_700 * 0.10 + (67_900 - 16_700) * 0.15 + (income - 67_900) * 0.25;
            else if (income <= 208_850)
                tax = 16_700 * 0.10 + (67_900 - 16_700) * 0.15 + (137_050 - 67_900) * 0.25 + (income - 137_050) * 0.28;
            else if (income <= 372_950)
                tax = 16_700 * 0.10 + (67_900 - 16_700) * 0.15 + (137_050 - 67_900) * 0.25 + (208_850 - 137_050) * 0.28 + (income - 208_850) * 0.33;
            else
                tax = 16_700 * 0.10 + (67_900 - 16_700) * 0.15 + (137_050 - 67_900) * 0.25 + (208_850 - 137_050) * 0.28 + (372_950 - 208_850) * 0.33 + (income - 375_950) * 0.35;
        } else if (status == 2){
            if (income <= 8_350)
                tax = income * 0.10;
            else if (income <= 33_950)
                tax = 8_350 * 0.10 + (income - 8_350) * 0.15;
            else if (income <= 68_525)
                tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (income - 33_950) * 0.25;
            else if (income <= 104_425)
                tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (68_525 - 33_950) * 0.25 + (income - 68_525) * 0.28;
            else if (income <= 186_475)
                tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (68_525 - 33_950) * 0.25 + (104_425 - 68_525) * 0.28 + (income - 104_425) * 0.33;
            else
                tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (68_525 - 33_950) * 0.25 + (104_425 - 68_525) * 0.28 + (186_475 - 104_425) * 0.33 + (income - 186_475) * 0.35;
        } else if (status == 3) {
            if (income <= 11_950)
                tax = income * 0.10;
            else if (income <= 45_500)
                tax = 11_950 * 0.10 + (income - 11_950) * 0.15;
            else if (income <= 117_450)
                tax = 11_950 * 0.10 + (45_500 - 11_950) * 0.15 + (income - 45_500) * 0.25;
            else if (income <= 190_200)
                tax = 11_950 * 0.10 + (45_500 - 11_950) * 0.15 + (117_450 - 45_500) * 0.25 + (income - 117_450) * 0.28;
            else if (income <= 372_950)
                tax = 11_950 * 0.10 + (45_500 - 11_950) * 0.15 + (117_450 - 45_500) * 0.25 + (190_200 - 117_450) * 0.28 + (income - 190_200) * 0.33;
            else
                tax = 11_950 * 0.10 + (45_500 - 11_950) * 0.15 + (117_450 - 45_500) * 0.25 + (190_200 - 117_450) * 0.28 + (372_950 - 190_200) * 0.33 + (income - 372_950) * 0.35;
        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }
        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }
}
