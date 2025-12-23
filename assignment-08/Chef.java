/**
 * This class represents a chef in a restaurant.
 * Calculates total weekly pay after union fees.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public class Chef extends RestaurantWorker {
    /**
     * The union fees deducted from pay.
     */
    private double unionFees;

    /**
     * Constructs a Chef with the given name, job title, hourly rate, and union
     * fees.
     * 
     * @param nameIn       the chef’s name.
     * @param jobTitleIn   the chef’s job title.
     * @param hourlyRateIn the hourly pay rate.
     * @param unionFeesIn  the union fees.
     */
    public Chef(String name, String jobTitle, double hourlyRate, double unionFees) {
        super(name, jobTitle, hourlyRate);
        this.unionFees = unionFees;
    }

    /**
     * Accessor method that retrieves the union fees.
     * 
     * @return the union fees.
     */
    public double getUnionFees() {
        return unionFees;
    }

    /**
     * Calculates the chef’s total weekly pay after union fees considering overtime
     * pay.
     * 
     * @param hours the number of hours worked.
     * @return the total weekly pay after deductions.
     */
    public double computePay(double hours) {
        double weeklySalary;

        if (hours <= 40) {
            weeklySalary = hours * getHourlyRate();

        } else {
            double overtimeHours = hours - 40;
            double overtimePay = overtimeHours * (getHourlyRate() * 1.5);
            weeklySalary = (40 * getHourlyRate()) + overtimePay;
        }
        return weeklySalary - unionFees;
    }
}