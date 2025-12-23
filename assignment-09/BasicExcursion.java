/**
 * BasicExcursion class represents a basic excursion.
 * Includes meals, interpretive walks, and provides a complimentary perk.
 *
 * @author Ebrahim Arefi, 3621326
 */
public class BasicExcursion extends Excursion {

    /**
     * The base rate per day for basic customers.
     */
    private static final double BASE_RATE = 125.00;

    /**
     * The cost of each meal.
     */
    private static final double MEAL_COST = 16.75;

    /**
     * The cost of each interpretive walk (normal rate).
     */
    private static final double WALK_COST = 26.50;

    /**
     * The discounted cost of each interpretive walk (if 3 or more walks).
     */
    private static final double WALK_DISCOUNT = 23.75;

    /**
     * Constructs a BasicExcursion with the given information.
     * 
     * @param nameIn     the customer's name.
     * @param daysNumIn  the number of days.
     * @param mealsNumIn the number of meals.
     * @param walksNumIn the number of interpretive walks.
     */
    public BasicExcursion(String nameIn, int daysNumIn, int mealsNumIn, int walksNumIn) {
        super(nameIn, daysNumIn, mealsNumIn, walksNumIn);
    }

    /**
     * Calculates the total cost for the basic excursion.
     * 
     * Basic customers pay the standard rates listed above.
     * If they book 3 or more walks, a discount is applied.
     * 
     * @return the total cost of the excursion.
     */
    public double calculateCost() {
        double total = BASE_RATE * getDaysNum();
        total += MEAL_COST * getMealsNum();

        if (getWalksNum() >= 3) {
            total += WALK_DISCOUNT * getWalksNum();
        } else {
            total += WALK_COST * getWalksNum();
        }

        return total;
    }

    /**
     * Retrieves the complimentary perk for basic customers.
     * 
     * @return the complimentary perk.
     */
    public String getPerk() {
        return "Water Bottle";
    }
}