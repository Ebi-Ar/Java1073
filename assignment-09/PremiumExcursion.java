import java.util.Random;

/**
 * PremiumExcursion class represents a premium excursion.
 * Includes meals, interpretive walks, and assigns one random perk.
 *
 * @author Ebrahim Arefi, 3621326
 */
public class PremiumExcursion extends Excursion {

    /**
     * The base rate per day for premium customers.
     */
    private static final double BASE_RATE = 315.00;

    /**
     * The cost of each meal.
     */
    private static final double MEAL_COST = 16.75;

    /**
     * The cost of each interpretive walk.
     */
    private static final double WALK_COST = 20.95;

    /**
     * Constructs a PremiumExcursion with the given information.
     * 
     * @param nameIn     the customer's name.
     * @param daysNumIn  the number of days.
     * @param mealsNumIn the number of meals.
     * @param walksNumIn the number of interpretive walks.
     */
    public PremiumExcursion(String nameIn, int daysNumIn, int mealsNumIn, int walksNumIn) {
        super(nameIn, daysNumIn, mealsNumIn, walksNumIn);
    }

    /**
     * Calculates the total cost for the premium excursion.
     * Premium customers get one free meal per day and one free walk.
     * 
     * @return the total cost of the excursion.
     */
    public double calculateCost() {
        double total = BASE_RATE * getDaysNum();

        int mealsExpenses = getMealsNum() - getDaysNum();
        if (mealsExpenses < 0) {
            mealsExpenses = 0;
        }
        total += mealsExpenses * MEAL_COST;

        return total;
    }

    /**
     * Retrieves a random complimentary perk for premium customers.
     * 
     * @return the complimentary perk.
     */
    public String getPerk() {
        Random rand = new Random();
        int num = rand.nextInt(3) + 1;
        String perk;

        if (num == 1) {
            perk = "Walking Poles";
        } else if (num == 2) {
            perk = "Backpack";
        } else {
            perk = "Binoculars";
        }

        return perk;
    }
}