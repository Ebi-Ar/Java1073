/**
 * This class represents a server in a restaurant who receives an additional
 * allowance.
 * The footwear allowance is paid only for full hours worked.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public class Server extends RestaurantWorker {

    /**
     * The footwear allowance amount per hour.
     */
    private double allowance;

    /**
     * Constructs a Server with the given name, job title, hourly rate, and
     * allowance.
     * 
     * @param nameIn       the server’s name.
     * @param jobTitleIn   the server’s job title.
     * @param hourlyRateIn the hourly pay rate.
     * @param allowanceIn  the allowance per hour.
     */
    public Server(String name, String jobTitle, double hourlyRate, double allowance) {
        super(name, jobTitle, hourlyRate);
        this.allowance = allowance;
    }

    /**
     * Accessor method that retrieves the allowance amount.
     * 
     * @return the allowance per hour.
     */
    public double getAllowance() {
        return allowance;
    }

    /**
     * Calculates the total weekly pay for the server, considering their allowance.
     * 
     * @param hours the number of hours worked.
     * @return the total pay including allowance.
     */
    public double computePay(double hours) {

        double hourlySalary = getHourlyRate() * hours;

        double bonus = (int) hours * allowance;

        return hourlySalary + bonus;
    }
}