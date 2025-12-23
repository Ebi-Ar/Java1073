/**
 * A driver class for As5Q1
 * Represents a chat bot that asks the user questions about their program and GPA.
 * @author Ebrahim Arefi, 3621326
 */

import java.util.Scanner;

public class As5Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Are you a current undergraduate student at UNB?");

        String undergraduate = sc.nextLine();

        if (undergraduate.equalsIgnoreCase("no")) {
            System.out.println("Sorry, you are not eligible to join");

        } else if (undergraduate.equalsIgnoreCase("yes")) {
            System.out.println("Have you successfuly completed cs 1083 or cs 1023?");
            String csPrereq = sc.nextLine();

            if (csPrereq.equalsIgnoreCase("no")) {
                System.out.println("Sorry, you are not eligible to join");

            } else if (csPrereq.equalsIgnoreCase("yes")) {
                System.out.println("What is your program of study?");
                String programAnswer = sc.nextLine();

                if ((programAnswer.equalsIgnoreCase("BCS")) || (programAnswer.equalsIgnoreCase("BSSWE"))
                        || (programAnswer.equalsIgnoreCase("BABCS")) || (programAnswer.equalsIgnoreCase("BCSBSC"))) {
                    System.out.println("What is your cumulative GPA?");

                    double gpa = sc.nextDouble();
                    if (gpa >= 2.5) {
                        System.out.println("You may join welcome!");

                    } else {
                        System.out.println("Sorry, you are not eligible to join");
                    }

                } else {
                    System.out.println("Have you participated in a programming contest at UNB?");
                    String contest = sc.nextLine();

                    if (contest.equalsIgnoreCase("no")) {
                        System.out.println("Sorry, you are not eligible to join");
                    } else if (contest.equalsIgnoreCase("yes")) {
                        System.out.println("What is your GPA from CS/SWE classes?");

                        double gpa = sc.nextDouble();
                        if (gpa >= 3.0) {
                            System.out.println("You may join welcome!");
                        }

                    } else {
                        System.out.println("Sorry, you are not eligible to join");
                    }

                }
            }

        }

    }

}
