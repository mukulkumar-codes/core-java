package FundamentalProgramming.IntroductionToComputers.Exercise;

public class Question12 {
    public static void main(String[] args) {
        System.out.print("Runner's average speed in km/hour = ");

        // Runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds
        // total running time (in seconds) = 100 * 60 + 35
        // total distance (in meter) = 24 * 1.6 * 1000

        //distance travelled in 1 second = total-distance-in-meter / total time is seconds
        // i.e. (24 * 1.6 * 1000) / (100 * 60 + 35)

        // Runner's speed in km/hour  = (speed in meter/second) * (18.0 / 5)
        // i.e. ((24 * 1.6 * 1000) / (100 * 60 + 35)) * (18.0 / 5)

        System.out.println(((24 * 1.6 * 1000) / (100 * 60 + 35)) * (18.0 / 5));
    }
}
