
/**
 * A class named ServiceDogAssessment, which collects information about dogs to evaluate their
 * eligibility.
 * @author Ebrahim Arefi, 3621326
 */

import java.util.Scanner;

public class ServiceDogAssessment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("-------------------------------------------------------------------");

        System.out.print("Enter the age of the dog in months: ");
        int dogAge = sc.nextInt();
        while (dogAge < 0) {
            System.out.print("Enter the age of the dog in months: ");
            dogAge = sc.nextInt();
        }

        if (dogAge < 6 || dogAge > 12) {
            System.out.println("Sorry, the dog is not approved for service dog training.");
            return;
        }

        System.out.print("Does the dog have a valid rabies vaccine (yes/no): ");
        String dogVac = sc.next().toLowerCase();
        while (!(dogVac.equals("yes") || dogVac.equals("no"))) {
            System.out.print("Enter yes or no: ");
            dogVac = sc.next().toLowerCase();
        }

        if (dogVac.equals("no")) {
            System.out.println("Sorry, the dog is not approved for service dog training.");
            return;
        }

        System.out.print("Enter the number of training hours: ");
        int hoursTraining = sc.nextInt();
        while (hoursTraining < 0) {
            System.out.print("Re-enter hours (must be a non-negative number): ");
            hoursTraining = sc.nextInt();
        }

        System.out.print("Enter their temperament assessment score: ");
        int temperament = sc.nextInt();
        while (temperament < 1 || temperament > 20) {
            System.out.print("Re-enter temperament score (must 1-20 inclusive): ");
            temperament = sc.nextInt();
        }

        System.out.print("Enter their socialization assessment score: ");
        int socialization = sc.nextInt();
        while (socialization < 1 || socialization > 10) {
            System.out.print("Re-enter socialization assessment score (must 1-10 inclusive): ");
            socialization = sc.nextInt();
        }

        int trainingPoints;
        if (hoursTraining < 10) {
            trainingPoints = 0;
        } else if (hoursTraining < 20) {
            trainingPoints = 5;
        } else {
            trainingPoints = 10;
        }

        int totalPoints = trainingPoints + temperament + socialization;

        if (totalPoints < 10) {
            System.out.println("Your dog is not recommended for service dog training.");
        } else if (totalPoints < 25) {
            System.out.println("Your dog is recommended for service dog training.");
        } else {
            System.out.println("Your dog is highly recommended for service dog training.");
        }

        System.out.println("-------------------------------------------------------------------");
    }
}