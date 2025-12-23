
/**
 * A class named ScreenTimeSummary, which asks the user questions about the screen time.
 * Evaluates it and returns the average.
 * @author Ebrahim Arefi, 3621326
 */

import java.util.Scanner;

public class ScreenTimeSummary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Please enter your desired hours for your target.");
        double hourslimit = sc.nextDouble();

        System.out.println(
                "Please enter your screen time in of hours for each day. (Please type a negavtive number to end the list.)");
        double hoursDaily = sc.nextDouble();

        double sum = 0;
        double hours = 0;
        double highest = 0;
        double hoursLess = 0;

        while (hoursDaily >= 0) {
            hours++;
            sum += hoursDaily;

            if (hoursDaily < hourslimit) {
                hoursLess++;
            }

            if (hoursDaily > highest) {
                highest = hoursDaily;
            }
            hoursDaily = sc.nextDouble();
        }
        double average = sum / hours;

        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Screen Time:");
        System.out.println("Number of days below screen time limit: " + (int) hoursLess);
        System.out.println("Highest screen time hours: " + highest);
        System.out.println("Average screen time: " + average);
        System.out.println("-------------------------------------------------------------------");
    }

}
