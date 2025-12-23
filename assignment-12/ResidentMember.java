/**
 * Represents a resident's membership card that allows them to sign out items.
 * It holds information about their
 * name, room number, chat name and membership ID.
 *
 * @author Ebrahim Arefi
 */
public class ResidentMember {

    private String name;
    private int roomNumber;
    private final String chatName;
    private final int memberId;
    private static int nextId = 100000;

    private LibraryItem[] signedOut;
    private int count;

    /**
     * Constructor method:
     *
     * @param name     Full name of the resident.
     * @param roomNum  Room number of the resident.
     * @param chatName Chat username of the resident.
     */
    public ResidentMember(String name, int roomNum, String chatName) {
        this.name = name;
        this.roomNumber = roomNum;
        this.chatName = chatName;

        memberId = nextId++;
        signedOut = new LibraryItem[10];
        count = 0;
    }

    /**
     * Accessor method: Returns full name.
     *
     * @return Full name of the resident.
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor method: Returns the room number.
     *
     * @return Room number.
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * Accessor method: Returns the chat username.
     *
     * @return Chat name.
     */
    public String getChatName() {
        return chatName;
    }

    /**
     * Accessor method: Returns membership ID.
     *
     * @return Membership ID.
     */
    public int getMembershipNumber() {
        return memberId;
    }

    /**
     * Mutator method: Changes the name of the member.
     *
     * @param nameIn New name of the resident.
     */
    public void setName(String nameIn) {
        name = nameIn;
    }

    /**
     * Mutator method: Changes the room number of the resident.
     *
     * @param roomNumIn New room number of the resident.
     */
    public void setRoomNumber(int roomNumIn) {
        roomNumber = roomNumIn;
    }

    /**
     * Accessor method: Copies the array for the library items.
     *
     * @return A copy of the array containing only the valid items.
     */
    public LibraryItem[] getSignedOutItems() {
        LibraryItem[] copyItems = new LibraryItem[count];

        for (int i = 0; i < count; i++) {
            copyItems[i] = signedOut[i];
        }

        return copyItems;
    }

    /**
     * Mutator method: Signs out a library item.
     *
     * @param outItem Library item to be signed out.
     * @return True if the item was successfully signed out.
     */
    public boolean signOut(LibraryItem outItem) {

        if (count >= 10) {
            return false;
        }

        signedOut[count] = outItem;
        count++;
        return true;
    }

    /**
     * Mutator method: Returns a library item previously signed out
     *
     * @param returnedItem The library item to be returned.
     * @return True if the item was successfully returned, false if not.
     */
    public boolean returnItem(LibraryItem returnedItem) {

        for (int i = 0; i < count; i++) {
            if (signedOut[i].equals(returnedItem)) {

                for (int j = i; j < count - 1; j++) {
                    signedOut[j] = signedOut[j + 1];
                }

                signedOut[count - 1] = null;
                count--;
                return true;
            }
        }

        return false;
    }
}