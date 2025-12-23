/**
 * Represents library item's description.
 * A library item may be signed out by resident members unless its restricted.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public class LibraryItem {
    private final String description;
    private final double price;
    private final boolean isDonatedByAlumni;

    /**
     * Constructor method:
     *
     * @param descriptionIn     Description of the library item.
     * @param priceIn           Purchase price of the library item.
     * @param donatedByAlumniIn True if the Alumni funded the item.
     */
    public LibraryItem(String descriptionIn, double priceIn, boolean donatedByAlumni) {

        description = descriptionIn;
        price = priceIn;
        isDonatedByAlumni = donatedByAlumni;
    }

    /**
     * Accessor method:
     * Returns description of the item.
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Accessor method:
     * Returns the price of the item.
     *
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     * Accessor method:
     * Checks if the library item was funded by the Alumni Association.
     *
     * @return
     */
    public boolean getAlumniDonated() {
        return isDonatedByAlumni;
    }
}