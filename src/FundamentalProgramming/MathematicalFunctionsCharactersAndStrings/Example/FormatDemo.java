package FundamentalProgramming.MathematicalFunctionsCharactersAndStrings.Example;

public class FormatDemo {
    public static void main(String[] args) {
        // Display the header of the table
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees",
                "Radians", "Sine", "Cosine", "Tangent");

        // Display values for 30 degrees
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,
                radians, Math.sin(radians), Math.cos(radians),
                Math.tan(radians));

        // Display values for 60 degrees
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,
                radians, Math.sin(radians), Math.cos(radians),
                Math.tan(radians));

        System.out.printf("amount is %f %e\n", 32.32, 32.32);
        System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
        System.out.printf("%6b\n", (1 > 2));
        System.out.printf("%6s\n", "Java");
        System.out.printf("%-6b%s\n", (1 > 2), "Java");
        System.out.printf("%6b%-8s\n", (1 > 2), "Java");
        System.out.printf("%,5d %,6.1f\n", 312342, 315562.932);
        System.out.printf("%05d %06.1f\n", 32, 32.32);
    }
}
