package FundamentalProgramming.IntroductionToComputers.Exercise;

public class Question10 {
    public static void main(String[] args) {
        System.out.print("Runner's average speed in miles/hour = ");
        // Runner travels in 1 second = total-distance-in-meter/time-in-seconds
        // i.e. 15000.0 / (50 * 60 + 30)

        // Runner's speed in km/hour  = (speed in meter/second) * (18.0 / 5)
        // i.e. (15000.0 / (50 * 60 + 30)) * (18.0 / 5)

        // Runner's speed in miles/hour = (speed in km/hour) / 1.6
        // i.e. ((15000.0 / (50 * 60 + 30)) * (18.0 / 5))/ 1.6

        System.out.println(((15000.0 / (50 * 60 + 30)) * (18.0 / 5))/ 1.6);
    }
}
