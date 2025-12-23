/**
 * This class represents a program called FunRunParticipant for a fundraising
 * event.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public class FunRunParticipant {

    /**
     * The full name of the participant.
     */
    private String name;

    /**
     * The 10-digit number of the participant.
     */
    private long digitNum;

    /**
     * The total funds raised by the participant.
     */
    private double totalFunds;

    /**
     * This method constructs a FunRunParticipant object with a specific
     * name and participant number. The total funds are initialized to 0.00
     * 
     * @param name     the name of the participant.
     * @param digitNum the number of the participant.
     */
    public FunRunParticipant(String name, long digitNum) {
        this.name = name;
        this.digitNum = digitNum;
        totalFunds = 0.00;
    }

    /**
     * This method retrieves the name of the doparticipantg.
     * 
     * @return the name of the participant.
     */
    public String getName() {
        return name;
    }

    /**
     * This method retrieves the participant number.
     * 
     * @return the participant number.
     */
    public long getParticipantNumber() {
        return digitNum;
    }

    /**
     * This method retrieves the total funds raised.
     * 
     * @return the total funds raised by the participant.
     */
    public double getFunds() {
        return totalFunds;
    }

    /**
     * This method adds a donation amount to the total funds raised
     * by the participant.
     * 
     * @param donation the amount donated by a sponsor.
     */
    public void addDonation(double donation) {
        totalFunds += donation;
    }

    /**
     * This method calculates the gift amount, based on
     * a percentage of the participant’s total funds raised.
     * 
     * @param percentage the percentage expressed in decimal format.
     * 
     * @return the employer gift amount for the charity.
     */
    public double calculateEmployerGift(double percentage) {
        return totalFunds * percentage;
    }

}