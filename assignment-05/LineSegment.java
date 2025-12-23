/**
 * This class represents a line segment.
 * Each line has two end points represented by CartesianPoint objects.
 *
 * @author Ebrahim Arefi, 3621326
 */

public class LineSegment {

    /**
     * The first end point of the line segment.
     */
    private CartesianPoint pointA;

    /**
     * The second end point of the line segment.
     */
    private CartesianPoint pointB;

    /**
     * Constructor #1: constructs a LineSegment using two CartesianPoint objects.
     *
     * @param pointA the first endpoint of the line segment.
     * @param pointB the second endpoint of the line segment.
     */
    public LineSegment(CartesianPoint pointAln, CartesianPoint pointBln) {
        pointA = pointAln;
        pointB = pointBln;
    }

    /**
     * Constructor #2: constructs a LineSegment using four coordinate values.
     *
     * @param x1 x-coordinate of the first point.
     * @param y1 y-coordinate of the first point.
     * @param x2 x-coordinate of the second point.
     * @param y2 y-coordinate of the second point.
     */
    public LineSegment(double x1, double y1, double x2, double y2) {
        pointA = new CartesianPoint(x1, y1);
        pointB = new CartesianPoint(x2, y2);

    }

    /**
     * Returns a text description of both end points of the line segment.
     *
     * @return a string listing the coordinates of both points.
     */
    public String toString() {
        return "End points: " + "\n\tPoint A: " + pointA + "\n\tpoint B: " + pointB;
    }

    /**
     * Calculates and returns the length of the line segment.
     *
     * @return the distance between the two end points.
     */
    public double length() {
        return pointA.distance(pointB);
    }

    /**
     * Whether the line segment crosses either the x-axis or the y-axis.
     *
     * @return true if the line segment crosses an axis, false otherwise.
     */
    public boolean crossesAxis() {
        return (pointA.getY() * pointB.getY() <= 0) || (pointA.getX() * pointB.getX() <= 0);
    }

    /**
     * Does the CartesianPoint lies on this line segment?
     *
     * @param p the point to be tested.
     * @return true if the point lies on the line segment, false otherwise.
     */
    public boolean containsPoint(CartesianPoint p) {
        double TOLERANCE = 0.00001;

        double ap = pointA.distance(p);
        double pb = p.distance(pointB);
        double ab = pointA.distance(pointB);

        if (Math.abs((ap + pb) - ab) < TOLERANCE) {
            return true;
        } else {
            return false;
        }
    }
}
