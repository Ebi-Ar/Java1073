/**
 * This class represents Frankenstein bag.
 * Calculate the surface area and volume of the bag.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public class FrankensteinBag {

    /**
     * The width of the rectangular opening (in cm).
     */
    private double width;

    /**
     * The depth of the rectangular opening (in cm).
     */
    private double depth;

    /**
     * The length of the bag (in cm).
     */
    private double length;

    /**
     * Constructs a FrankensteinBag with a given width, depth, and length.
     * 
     * @param widthIn  the width of the bag (in cm).
     * @param depthIn  the depth of the bag (in cm).
     * @param lengthIn the length (in cm).
     */
    public FrankensteinBag(double widthIn, double depthIn, double lengthIn) {
        width = widthIn;
        depth = depthIn;
        length = lengthIn;
    }

    /**
     * Retrieves the width of the bag.
     * 
     * @return the width of the bag (in cm).
     */
    public double getWidth() {
        return width;
    }

    /**
     * Retrieves the depth of the bag.
     * 
     * @return the depth of the bag (in cm).
     */
    public double getDepth() {
        return depth;
    }

    /**
     * Retrieves the length of the bag.
     * 
     * @return the length of the bag (in cm).
     */
    public double getLength() {
        return length;
    }

    /**
     * Calculates the surface area of the bag.
     * The top of the bag is open.
     * 
     * @return the surface area in cm².
     */
    public double calculateOutside() {
        double bottom = width * depth;
        double sides = 2 * (width * length + depth * length);
        return bottom + sides;
    }

    /**
     * Calculates the volume of the bag.
     * 
     * @return the volume in cm³.
     */
    public double calculateVolume() {
        return width * depth * length;
    }
}
