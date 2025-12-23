/**
 * This class represents a restaurant worker.
 * Stores the worker’s name, job title, and hourly rate.
 * Computes their total pay based on hours worked.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public class RestaurantWorker {

    /**
     * The worker's name.
     */
    private String name;

    /**
     * The worker's job title.
     */
    private String jobTitle;

    /**
     * The worker's hourly pay rate.
     */
    private double hourlyRate;

    /**
     * Constructs a RestaurantWorker with the given name, job title, and hourly
     * rate.
     * 
     * @param nameIn       the worker’s name.
     * @param jobTitleIn   the worker’s job title.
     * @param hourlyRateIn the hourly pay rate.
     */
    public RestaurantWorker(String name, String jobTitle, double hourlyRate) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.hourlyRate = hourlyRate;
    }

    /**
     * Accessor method that retrieves worker's name.
     * 
     * @return the worker’s name.
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor method that retrieves the worker's job title.
     * 
     * @return the worker’s job title.
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Accessor method that retrieves the worker's hourly rate.
     * 
     * @return the worker’s hourly rate.
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Additional method to compute the salary.
     * 
     * @param hours the number of hours worked.
     * @return the total pay.
     */
    public double computePay(double hours) {
        return hourlyRate * hours;
    }
}