/**
 * This class represents a stateroom on the cruise ship.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public class Stateroom {

	/**
	 * The section name of stateroom.
	 */
	private String sectionName;

	/**
	 * The room number of the stateroom.
	 */
	private int roomNum;

	/**
	 * The price per week for the stateroom.
	 */
	private double pricePerWeek;

	/**
	 * This method constructs a Stateroom object with the specified
	 * section name, room number, and weekly price.
	 * 
	 * @param sectionNameIn  the section name of the stateroom.
	 * @param roomNumIn      the room number of the stateroom.
	 * @param pricePerWeekIn the price per week of the stateroom.
	 */
	public Stateroom(String sectionNameIn, int roomNumIn, double pricePerWeekIn) {
		sectionName = sectionNameIn;
		roomNum = roomNumIn;
		pricePerWeek = pricePerWeekIn;
	}

	/**
	 * This method retrieves the section name of the stateroom.
	 * 
	 * @return the section name.
	 */
	public String getName() {
		return sectionName;
	}

	/**
	 * This method retrieves the room number of the stateroom.
	 * 
	 * @return the room number.
	 */
	public int getRoomNum() {
		return roomNum;
	}

	/**
	 * This method retrieves the weekly price of the stateroom.
	 * 
	 * @return the weekly price.
	 */
	public double getWeeklyPrice() {
		return pricePerWeek;
	}
}