package FundamentalProgramming.ElementaryProgramming.CaseStudies;

public class ShowCurrentTime {
    public static void main(String[] args) {
        long timeInMilliseconds = System.currentTimeMillis();

        long totalSeconds = timeInMilliseconds / 1000;
        byte seconds = (byte) (totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;
        byte minutes = (byte) (totalMinutes % 60);

        long totalHours = totalMinutes / 60;
        byte hours = (byte) (totalHours % 24);

        System.out.println("Current time is (HH:MM:SS) " + hours + ":" + minutes + ":" + seconds + " GMT");
    }
}
