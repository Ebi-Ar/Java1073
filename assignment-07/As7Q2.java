import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Driver class for the Trick or Treat Bag App.
 * Allows users to enter the dimensions for Witch Hat and Frankenstein bags
 * and calculates their surface area and volume.
 *
 * @author Ebrahim Arefi, 3621326
 */
public class As7Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.000");

        double smallestSurface = 0;
        double largestVolume = 0;
        String smallestType = "";
        String largestType = "";

        boolean running = true;
        while (running) {
            System.out.println("");
            System.out.println("------------------------------------");
            System.out.println("Select one of the following options:");
            System.out.println("1 - Enter the information for a Witch Hat bag");
            System.out.println("2 - Enter the information for a Frankenstein bag");
            System.out.println("3 - Quit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 3) {
                running = false;
                if (largestVolume > 0) {
                    System.out.println(
                            "The trick or treat bag that can hold the most candy is a " + largestType + " bag.");
                    System.out.println("Highest volume: " + df.format(largestVolume) + " cm^3");
                }
                if (smallestSurface > 0) {
                    System.out.println(
                            "The trick or treat bag with the smallest surface area is a " + smallestType + " bag.");
                    System.out.println("Smallest surface area: " + df.format(smallestSurface) + " cm^2");
                }
            } else if (choice == 1) {
                System.out.print("Input radius of opening (in cm): ");
                double openingRadius = sc.nextDouble();
                while (openingRadius <= 0) {
                    System.out.print("Invalid Input. Input radius of opening (in cm): ");
                    openingRadius = sc.nextDouble();
                }

                System.out.print("Input radius to outside of brim (in cm): ");
                double outsideRadius = sc.nextDouble();
                while (outsideRadius <= 0 || outsideRadius < openingRadius) {
                    System.out.print("Invalid Input. Input radius to outside of brim (in cm): ");
                    outsideRadius = sc.nextDouble();
                }

                System.out.print("Input length of the bag (in cm): ");
                double length = sc.nextDouble();
                while (length <= 0) {
                    System.out.print("Invalid Input. Input length of the bag (in cm): ");
                    length = sc.nextDouble();
                }

                WitchHatBag bag = new WitchHatBag(openingRadius, outsideRadius, length);
                double surface = bag.calculateOutside();
                double volume = bag.calculateVolume();

                System.out.println("Surface area: " + df.format(surface) + " cm^2");
                System.out.println("Volume: " + df.format(volume) + " cm^3");

                if (smallestSurface == 0 || surface < smallestSurface) {
                    smallestSurface = surface;
                    smallestType = "Witch Hat";
                }
                if (volume > largestVolume) {
                    largestVolume = volume;
                    largestType = "Witch Hat";
                }
            } else if (choice == 2) {
                System.out.print("Input width of opening (in cm): ");
                double width = sc.nextDouble();
                while (width <= 0) {
                    System.out.print("Invalid Input. Input width of opening (in cm): ");
                    width = sc.nextDouble();
                }

                System.out.print("Input depth of opening (in cm): ");
                double depth = sc.nextDouble();
                while (depth <= 0) {
                    System.out.print("Invalid Input. Input depth of opening (in cm): ");
                    depth = sc.nextDouble();
                }

                System.out.print("Input length of the bag (in cm): ");
                double length = sc.nextDouble();
                while (length <= 0) {
                    System.out.print("Invalid Input. Input length of the bag (in cm): ");
                    length = sc.nextDouble();
                }

                FrankensteinBag bag = new FrankensteinBag(width, depth, length);
                double surface = bag.calculateOutside();
                double volume = bag.calculateVolume();

                System.out.println("Surface area: " + df.format(surface) + " cm^2");
                System.out.println("Volume: " + df.format(volume) + " cm^3");

                if (smallestSurface == 0 || surface < smallestSurface) {
                    smallestSurface = surface;
                    smallestType = "Frankenstein";
                }
                if (volume > largestVolume) {
                    largestVolume = volume;
                    largestType = "Frankenstein";
                }
            } else {
                System.out.println("Invalid choice - try again!");
            }
        }

    }

}
