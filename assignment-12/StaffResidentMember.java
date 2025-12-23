/**
 * Is a child class of the ResidentMember class.
 * Represents a staff member.
 * Holds information of the super class, and members.
 * 
 * @author Ebrahim Arefi
 */
public class StaffResidentMember extends ResidentMember {

    private String jobTitle;

    /**
     * Constructor method:
     *
     * @param nameIn     Full name of the staff.
     * @param roomNumIn  Room number of the staff.
     * @param chatNameIn Chat username of the staff.
     * @param jobTitleIn Job title of the staff.
     */
    public StaffResidentMember(String nameIn, int roomNumIn, String chatNameIn, String jobTitleIn) {
        super(nameIn, roomNumIn, chatNameIn);
        jobTitle = jobTitleIn;
    }

    /**
     * Accessor method:
     * Returns the job title of the staff.
     *
     * @return
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Mutator method:
     * Staff cannot sign out items that were donated by alumni.
     *
     * @param wantedItem The library item to be signed out.
     * @return True if the item is not funded by alumni, else false.
     */
    public boolean signOut(LibraryItem wantedItem) {

        if (wantedItem.getAlumniDonated()) {
            return false;
        }

        return super.signOut(wantedItem);
    }

}