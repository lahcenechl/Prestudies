package Week_1_BrightWay;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class TimeUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of seconds
        System.out.print("Enter number of seconds: ");
        long totalSeconds = scanner.nextLong();

        // Convert seconds to years, days, hours, minutes, and seconds using TimeUnit
        long years = TimeUnit.SECONDS.toDays(totalSeconds) / 365;
        long days = TimeUnit.SECONDS.toDays(totalSeconds) % 365;
        long hours = TimeUnit.SECONDS.toHours(totalSeconds) % 24;
        long minutes = TimeUnit.SECONDS.toMinutes(totalSeconds) % 60;
        long seconds = totalSeconds % 60;

        // Display the result
        System.out.println(years + " years and " + days + " days and " + hours + " hours and " + minutes + " minutes and " + seconds + " seconds");

        scanner.close();
    }
}
