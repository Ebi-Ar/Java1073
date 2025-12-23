/**
 * This is a driver class to test the Stateroom and Cruiser classes.
 * It creates objects and prints the details.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public class As4TestDriver {
	public static void main(String[] args) {

		Stateroom sea = new Stateroom("Sea Breeze", 248, 1265.95);
		Cruiser tamara = new Cruiser("Tamara Glass", 456.50, 274.70, 85.00, sea);

		Stateroom odyssey = new Stateroom("Odyssey", 231, 1400.75);
		Cruiser ohas = new Cruiser("Ohas Natarajan", 325.50, 245.95, 0, odyssey);

		Stateroom nautilus = new Stateroom("Nautilus", 173, 1374.50);
		Cruiser vinson = new Cruiser("Vinson Tadeja", 395.50, 115.80, 105.00, nautilus);

		tamara.setActivityFee(304.55);

		Stateroom zephyr = new Stateroom("Zephyr", 936, 1630.95);
		ohas.setStateroom(zephyr);

		vinson.setShoreExcursionFee(489.75);

		tamara.setDiscount(105.00);

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println(tamara.getCruiserDetails() + "\n\tTotal amount owing: " + tamara.getTotalPaymentOwing());
		System.out.println("--------------------------------");
		System.out.println(ohas.getCruiserDetails() + "\n\tTotal amount owing: " + ohas.getTotalPaymentOwing());
		System.out.println("--------------------------------");
		System.out.println(vinson.getCruiserDetails() + "\n\tTotal amount owing: " + vinson.getTotalPaymentOwing());
		System.out.println("--------------------------------");
		System.out.println();
	}

}