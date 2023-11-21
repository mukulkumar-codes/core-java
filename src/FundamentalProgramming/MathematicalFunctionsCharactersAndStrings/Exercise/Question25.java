package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

public class Question25 {
    public static void main(String[] args) {
        char firstCharacter = (char) (65 + (int) (Math.random() * 100) % 26);
        char secondCharacter = (char) (65 + (int) (Math.random() * 100) % 26);
        char thirdCharacter = (char) (65 + (int) (Math.random() * 100) % 26);

        String digits;
        int randomDigits = (int) (Math.random() * 10000);

        if (randomDigits <= 999)
            digits = "0" + randomDigits;
        else
            digits = "" + randomDigits;

        System.out.println("Vehicle plate number is: " + firstCharacter + secondCharacter + thirdCharacter + " " + digits);
    }
}
