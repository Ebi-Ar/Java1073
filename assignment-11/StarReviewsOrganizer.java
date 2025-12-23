import java.util.Scanner;

/**
 * This is a driver class named StarReviewsOrganizer.
 * It reads company/product name and has list of star ratings.
 * Calculates the ratings, and, and identifies the least and
 * most frequent ratings.
 * 
 * @author Ebrahim Arefi
 */

public class StarReviewsOrganizer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter the name of the company or product for review: ");
        String nameInput = sc.nextLine();

        System.out.print("Enter the number of star reviews separated by semi-colons: ");
        String inputRev = sc.nextLine();
        int[] starTracker = new int[5];

        int sum = 0;
        int totalReviews = 0;

        for (int i = 0; i < inputRev.length(); i++) {
            char convert = inputRev.charAt(i);

            if (convert != ';') {
                int rating = convert - '0';
                starTracker[rating - 1]++;
                sum += rating;
                totalReviews++;
            }
        }
        int average = sum / totalReviews;
        int belowAvg = 0;
        for (int star = 1; star <= 5; star++) {
            if (star < average) {
                belowAvg += starTracker[star - 1];
            }
        }

        int leastStar = 1;
        int leastCount = starTracker[0];
        int mostStar = 1;
        int mostCount = starTracker[0];

        for (int star = 2; star <= 5; star++) {
            int count = starTracker[star - 1];

            if (count < leastCount) {
                leastCount = count;
                leastStar = star;
            }

            if (count > mostCount) {
                mostCount = count;
                mostStar = star;
            }
        }

        System.out.println("\nSummary: " + nameInput);
        for (int star = 1; star <= 5; star++) {
            System.out.println(star + "-star reviews: " + starTracker[star - 1]);
        }

        System.out.println("");
        System.out.println("Average review: " + average + "stars");
        System.out.println("Number of below average reviews: " + belowAvg);
        System.out.println("Fewest reviews (" + leastCount + ") were received for: " + leastStar + " stars");
        System.out.println("Most reviews (" + mostCount + ") were received for: " + mostStar + " stars");
        System.out.println("");
    }
}