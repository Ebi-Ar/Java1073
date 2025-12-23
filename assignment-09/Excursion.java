/**
 * Excursion is an abstract class.
 * It stores the customer's name, the number of days, the number of meals,
 * and the number of interpretive walks for the excursion.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public abstract class Excursion {

    /**
     * The customer's name.
     */
    protected String name;

    /**
     * The number of days for the excursion.
     */
    protected int daysNum;

    /**
     * The number of meals requested.
     */
    protected int mealsNum;

    /**
     * The number of interpretive walks.
     */
    protected int walksNum;

    /**
     * Constructs an Excursion with the given values.
     * 
     * @param nameIn     the customer's name
     * @param daysNumIn  the number of days
     * @param mealsNumIn the number of meals
     * @param walksNumIn the number of walks
     */
    public Excursion(String nameIn, int daysNumIn, int mealsNumIn, int walksNumIn) {
        name = nameIn;
        daysNum = daysNumIn;
        mealsNum = mealsNumIn;
        walksNum = walksNumIn;
    }

    /**
     * Gets the customer's name.
     * 
     * @return the customer's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the number of days.
     * 
     * @return the number of days
     */
    public int getDaysNum() {
        return daysNum;
    }

    /**
     * Gets the number of meals.
     * 
     * @return the number of meals
     */
    public int getMealsNum() {
        return mealsNum;
    }

    /**
     * Gets the number of interpretive walks.
     * 
     * @return the number of walks
     */
    public int getWalksNum() {
        return walksNum;
    }

    /**
     * Calculates the total cost of the excursion.
     * 
     * @return the total cost
     */
    public abstract double calculateCost();

    /**
     * Retrieves the complimentary perk.
     * 
     * @return the perk description
     */
    public abstract String getPerk();
}