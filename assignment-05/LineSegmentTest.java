/**
 * A driver class for testing the LineSegment.java
 * It creates and tests 3 line objects.
 * 
 * @author Ebrahim Arefi, 3621326
 */

public class LineSegmentTest {
    public static void main(String[] args) {

        CartesianPoint a = new CartesianPoint(2, -3);
        CartesianPoint b = new CartesianPoint(5, 4);

        LineSegment line1 = new LineSegment(a, b);
        LineSegment line2 = new LineSegment(-4, 2, 4, 2);
        LineSegment line3 = new LineSegment(1, 1, 4, 4);

        System.out.println();
        System.out.println("--------------------------");
        System.out.println("ToStrings: ");
        System.out.println();
        System.out.println("line1: " + line1.toString());
        System.out.println("line2: " + line2.toString());
        System.out.println("line3: " + line3.toString());
        System.out.println();

        System.out.println("--------------------------");
        System.out.println("Lengths: ");
        System.out.println();
        System.out.println("Length of line1 is: " + line1.length());
        System.out.println("Length of line2 is: " + line2.length());
        System.out.println("Length of line3 is: " + line3.length());
        System.out.println();

        System.out.println("--------------------------");
        System.out.println("Does it cross?");
        System.out.println();
        if (line1.crossesAxis()) {
            System.out.println("Line 1 crosses at least one axis.");
        } else {
            System.out.println("Line 1 does not cross either axis.");
        }

        if (line2.crossesAxis()) {
            System.out.println("Line 2 crosses at least one axis.");
        } else {
            System.out.println("Line 2 does not cross either axis.");
        }

        if (line3.crossesAxis()) {
            System.out.println("Line 3 crosses at least one axis.");
        } else {
            System.out.println("Line 3 does not cross either axis.");
        }
        System.out.println();

        System.out.println("--------------------------");
        System.out.println("Testings:");
        System.out.println();
        CartesianPoint p1 = new CartesianPoint(0, 2); 
        CartesianPoint p2 = new CartesianPoint(2, 2.5); 

        if (line2.containsPoint(p1)) {
            System.out.println("Point 1 is on line 2.");
        } else {
            System.out.println("Point 1 is not on line 2.");
        }

        if (line2.containsPoint(p2)) {
            System.out.println("Point 2 is on line 2.");
        } else {
            System.out.println("Point 2 is not on line 2.");

        }
        System.out.println();
        System.out.println("--------------------------");
    }

}