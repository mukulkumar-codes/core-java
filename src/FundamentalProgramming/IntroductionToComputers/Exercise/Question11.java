package FundamentalProgramming.IntroductionToComputers.Exercise;

public class Question11 {
    public static void main(String[] args) {
        System.out.println("Current Population of America = 312,032,486");
        System.out.print("Population of America after 5 years will be = ");
        // Total seconds in 5 years when each year have 365 days
        // total seconds = 5 * 365 * 24* 60 * 60

        // One birth in every 7 seconds so total possible births in next 5 years
        // total birth = (5 * 365 * 24* 60 * 60) / 7

        // One death in every 13 seconds so total possible deaths in next 5 years
        // total deaths = (5 * 365 * 24* 60 * 60) / 13

        // One immigrant in every 45 seconds so total possible immigrant in next 5 years
        // total immigrant = (5 * 365 * 24* 60 * 60) / 45
        System.out.println(312_032_486 + ((5 * 365 * 24* 60 * 60) / 7) - ((5 * 365 * 24* 60 * 60) / 13) + ((5 * 365 * 24* 60 * 60) / 45));
    }
}
