import java.util.Scanner;

/**
 * This is a driver class named, ManufacturerSummary.
 * It reads data from a text file using scanner.
 * Gives information about name,location,
 * number of employees and largerst Manufacturer.
 * 
 * @author Ebrahim Arefi
 */

public class ManufacturerSummary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numInput = sc.nextInt();
        sc.nextLine();
        Manufacturer[] store = new Manufacturer[numInput];

        for (int i = 0; i < numInput; i++) {

            String line = sc.nextLine();
            Scanner lineSc = new Scanner(line);
            lineSc.useDelimiter(",");

            String name = lineSc.next();
            String location = lineSc.next();
            int employees = lineSc.nextInt();

            store[i] = new Manufacturer(name, location, employees);
        }

        Manufacturer largest = store[0];
        for (int i = 1; i < store.length; i++) {
            if (store[i].getEmployees() > largest.getEmployees()) {
                largest = store[i];
            }
        }

        int sumEmployee = 0;
        for (int i = 0; i < store.length; i++) {
            sumEmployee += store[i].getEmployees();
        }
        int average = sumEmployee / store.length;

        System.out.println("The largest employer is " + largest.getName() + " and employs "
                + largest.getEmployees() + " people in " + largest.getLocation());
        System.out.println("");

        System.out.println("The average size of manufacturer in New Brunswick has "
                + average + " employees.");
        System.out.println("");

        System.out.println("The manufacturers that are in the same size category of the average:");

        for (int i = 0; i < store.length; i++) {
            int employeeCount = store[i].getEmployees();

            if (Math.abs(employeeCount - average) <= 20) {
                System.out.println("\t" + store[i].getName());
            }
        }
    }
}