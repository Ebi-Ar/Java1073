/**
 * This class represents a Witch Hat trick-or-treat bag shaped like a cone with
 * a circular brim.
 * It can calculate the outside material required (surface area) and the volume
 * of candy the bag can hold.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public class WitchHatBag {

    /**
     * The radius of the circular opening (in cm).
     */
    private double openingRadius;

    /**
     * The radius to the outer edge of the brim (in cm).
     */
    private double outsideRadius;

    /**
     * The length of the bag (in cm).
     */
    private double length;

    /**
     * Constructs a WitchHatBag with a given opening radius, outside radius, and
     * length.
     * 
     * @param openingRadiusIn the radius of the circular opening (in cm).
     * @param outsideRadiusIn the radius to the outer brim edge (in cm).
     * @param lengthIn        the length of the bag (in cm).
     */
    public WitchHatBag(double openingRadiusIn, double outsideRadiusIn, double lengthIn) {
        openingRadius = openingRadiusIn;
        outsideRadius = outsideRadiusIn;
        length = lengthIn;
    }

    /**
     * Retrieves the radius of the circular opening.
     * 
     * @return the radius of the circular opening (in cm).
     */
    public double getOpeningRadius() {
        return openingRadius;
    }

    /**
     * Retrieves the radius to the outer edge of the brim.
     * 
     * @return the radius to the outer brim (in cm).
     */
    public double getOutsideRadius() {
        return outsideRadius;
    }

    /**
     * Retrieves the length of the bag.
     * 
     * @return the length (in cm).
     */
    public double getLength() {
        return length;
    }

    /**
     * Calculates the total outside surface area of the Witch Hat bag.
     * 
     * @return the surface area in cm².
     */
    public double calculateOutside() {
        double slantHeight = Math.sqrt(Math.pow(length, 2) + Math.pow(openingRadius, 2));
        double lateralArea = Math.PI * openingRadius * slantHeight;
        double brimArea = Math.PI * (Math.pow(outsideRadius, 2) - Math.pow(openingRadius, 2));
        return lateralArea + brimArea;
    }

    /**
     * Calculates the volume of the Witch Hat bag.
     * 
     * @return the volume in cm³.
     */
    public double calculateVolume() {
        return (Math.PI * Math.pow(openingRadius, 2) * length) / 3.0;
    }
}
