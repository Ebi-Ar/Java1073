
/**
 * A class that calculate payments of different items.
 * @author Ebrahim Arefi, 3621326
 */

import java.util.Scanner;

public class As7Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("Enter the cost of the item:");
        int cost = sc.nextInt();

        while (cost <= 0) {
            System.out.println("Invalid cost. Enter the cost of the item:");
            cost = sc.nextInt();
        }

        System.out.println("Enter the total value of the payment:");
        int payment = sc.nextInt();

        while (payment < cost) {
            System.out.println("Invalid payment. Enter the total value of the payment:");
            payment = sc.nextInt();
        }

        if (payment == cost) {
            System.out.println("Exact payment – no change is due.");
        } else {
            int change = payment - cost;
            String Symbols = "";

            while (change >= 1000) {
                Symbols += "G";
                change -= 1000;
            }

            while (change >= 500) {
                Symbols += "S";
                change -= 500;
            }

            while (change >= 100) {
                Symbols += "B";
                change -= 100;
            }

            while (change >= 50) {
                Symbols += "C";
                change -= 50;
            }

            while (change >= 10) {
                Symbols += "W";
                change -= 10;
            }

            while (change >= 1) {
                Symbols += "F";
                change -= 1;
            }

            System.out.println(Symbols);
        }
    }
}
