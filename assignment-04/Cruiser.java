/**
 * This class shows the information of a cruiser.
 * Each cruiser has a name, activity fees, shore excursion fees,
 * a discount, and a stateroom.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public class Cruiser {

	/**
	 * The name of the cruiser.
	 */
	private String name;

	/**
	 * The shore excursion fee for the cruiser.
	 */
	private double shoreExcursionFee;

	/**
	 * The activity fee for the cruiser.
	 */
	private double activityFee;

	/**
	 * The discount for the cruiser.
	 */
	private double discount;

	/**
	 * The stateroom where the cruiser is staying.
	 */
	private Stateroom stateroom;

	/**
	 * This method constructs a Cruiser object with the specified
	 * name, shore excursion fee, activity fee, discount, and stateroom.
	 * 
	 * @param name              the name of the cruiser.
	 * @param shoreExcursionFee the fee for shore excursions.
	 * @param activityFee       the fee for activities.
	 * @param discount          the discount applied.
	 * @param stateroom         the stateroom assigned.
	 */
	public Cruiser(String name, double shoreExcursionFee, double activityFee, double discount, Stateroom stateroom) {

		this.name = name;
		this.shoreExcursionFee = shoreExcursionFee;
		this.activityFee = activityFee;
		this.discount = discount;
		this.stateroom = stateroom;
	}

	/**
	 * mutator methods:
	 * Method is called to change the name of the cruiser.
	 * 
	 * @param name the new name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Mutator methods:
	 * Method is called to set the shore excursion fee.
	 * 
	 * @param shoreExcursionFee the new shore excursion fee.
	 */
	public void setShoreExcursionFee(double shoreExcursionFee) {
		this.shoreExcursionFee = shoreExcursionFee;
	}

	/**
	 * mutator methods:
	 * Method is called to set the activity fee.
	 * 
	 * @param activityFee the new activity fee.
	 */
	public void setActivityFee(double activityFee) {
		this.activityFee = activityFee;
	}

	/**
	 * mutator methods:
	 * Method is set to change the discount amount.
	 * 
	 * @param discount the new discount.
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	/**
	 * mutator methods:
	 * Method is called to set/change the stateroom.
	 * 
	 * @param stateroom the new stateroom.
	 */
	public void setStateroom(Stateroom stateroom) {
		this.stateroom = stateroom;
	}

	/**
	 * mutator methods:
	 * Method calculates the total amount the cruiser
	 * must pay for the cruise.
	 * 
	 * @return the total payment owing.
	 */
	public double getTotalPaymentOwing() {
		return shoreExcursionFee + activityFee + discount;
	}

	/**
	 * This method retrieves and returns the cruiser informations.
	 * 
	 * @return a string with the cruiser details.
	 */
	public String getCruiserDetails() {

		return name + "\n\t - " + stateroom.getName() + "\n\t - " + stateroom.getRoomNum();
	}

}