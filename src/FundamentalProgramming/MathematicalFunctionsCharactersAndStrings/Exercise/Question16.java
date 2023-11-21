package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Exercise;

public class Question16 {
    public static void main(String[] args) {
        int randomChar = 97 + (int) (Math.random() * 100) % 26;
        System.out.printf("The random alphabet character is %c", randomChar);
    }
}
