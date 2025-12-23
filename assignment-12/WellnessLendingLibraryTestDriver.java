import java.text.NumberFormat;

/** 
  Test driver class to test the ResidentMember, StaffResidentMember 
  and LibraryItem classes.
  @author Natalie Webber
*/
public class WellnessLendingLibraryTestDriver {

  public static void main (String[] args) {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    
    //*********************************************************************************
    
    System.out.println
      ("\n*** Test case #1: Create a ResidentMember object & test accessors");
    ResidentMember maria = new ResidentMember ("Maria Diaz", 163,"mdiaz03");
    System.out.println("Name:     " + maria.getName()
                   + "\nUnit #:   " + maria.getRoomNumber()
                   + "\nPhone:    " + maria.getChatName()
                   + "\nMember #: " + maria.getMembershipNumber());
    
    LibraryItem[] mariasItemList = maria.getSignedOutItems();
    if (mariasItemList.length == 0) {
      System.out.println ("Correct result: Maria has zero lending items.");
    }
    else {
      System.out.println (">> ERROR: Maria has more than zero lending items.");
    }
    
    //*********************************************************************************
    
    System.out.println
      ("\n*** Test case #2: Create a StaffResidentMember object & test accessors");
    StaffResidentMember rory = new StaffResidentMember ("Rory MacDonald",
                                                         306,
                                                         "rmacdo12",
                                                         "Music Teacher");
    System.out.println ("Name:     " + rory.getName()
                    + "\nUnit #:   " + rory.getRoomNumber()
                    + "\nPhone:    " + rory.getChatName()
                    + "\nMember #: " + rory.getMembershipNumber()
                    + "\nDeparts:  " + rory.getJobTitle());
    
    LibraryItem[] rorysItemList = rory.getSignedOutItems();
    if (rorysItemList.length == 0) {
      System.out.println ("Correct result: Rory has zero lending items.");
    }
    else {
      System.out.println (">> ERROR: Rory has more than zero lending items.");
    }


    //*********************************************************************************
    
    System.out.println ("\n*** Test case #3: Automatically generate a member number");
    ResidentMember owen = new ResidentMember ("Owen King", 228, "oking05");
    if (owen.getMembershipNumber() == 100002) {
      System.out.println ("Correct result: 100002 is the correct member number.");
    }
    else {
      System.out.println(">> ERROR: Invalid member number: " 
                         + owen.getMembershipNumber());
    }
    
    //*********************************************************************************
    
    System.out.println
      ("\n*** Test case #4: Create a LibraryItem object & test accessors");
    
    // Create several EntertainmentItem objects and test the first one
    final int MAXITEMS = 10;
    LibraryItem[] testItemList = new LibraryItem[MAXITEMS + 1];
    String[] testItemDescription = 
      { "Skip-Bo (Card Game)",
        "Connect 4 (Board Game)",
        "Frisbee",
        "Cribbage Board and Cards",
        "Codenames (Card Game)",
        "Badminton Raquets (2) and Birdies",
        "Ladder Ball Set",
        "Scrabble (Board Game)",
        "Spikeball Game Set",
        "Karaoke Machine",
        "Crokinole Game Set" };
    for (int i=0; i<=MAXITEMS; i++) {
      testItemList[i] = 
        new LibraryItem (testItemDescription[i],
                               11.25 + (i * 4.75),  // Made-up prices
                               (i%2) == 0);  // Every 2nd item was donated
    } // end for loop
    
    System.out.println 
         ("Description:    " + testItemList[0].getDescription()
      + "\nOriginal Price: " + formatter.format(testItemList[0].getPrice())
      + "\nAlumni Donated: " + testItemList[0].getAlumniDonated());
    
    //*********************************************************************************
   
    System.out.println("\n*** Test case #5: Change name for StaffResidentMember");
    
    String updatedName = "Rory MacDonald-Lewis";
    rory.setName(updatedName);

    if (rory.getName().equals(updatedName)) {
      System.out.println("Correct result: Rory's name successfully changed.");
    }
    else {
      System.out.println(">> ERROR: Rory's name is incorrect: "
                         + rory.getName());
    }
    
    //*********************************************************************************
    
    System.out.println 
      ("\n*** Test case #6: Change room number for both resident types");
    int testRoom1 = 226;
    int testRoom2 = 595;
    maria.setRoomNumber(testRoom1);
    rory.setRoomNumber(testRoom2);

    if (maria.getRoomNumber() == testRoom1) {
      System.out.println ("Correct result: Maria's room number successfully changed.");
    }
    else {
      System.out.println (">> ERROR: Maria's room number is incorrect: "
                          + maria.getRoomNumber());
    }

    if (rory.getRoomNumber() == testRoom2) {
      System.out.println ("Correct result: Rory's room number successfully changed.");
    }
    else {
      System.out.println (">> ERROR: Rory's room number is incorrect: "
                          + rory.getRoomNumber());
    }
    
    //*********************************************************************************
    
    System.out.println ("\n*** Test case #7: Sign out one LibraryItem");
    
    if (maria.signOut(testItemList[0])) {
      System.out.println ("Correct result: Maria signed out an item successfully.");
      mariasItemList = maria.getSignedOutItems();
      if (mariasItemList.length == 1) {
        System.out.println ("Correct result: Maria has one lending item.");
      }
      else {
        System.out.println (">> ERROR: Maria has other than one lending item.");
      }
    }
    else {
      System.out.println (">> ERROR: Maria was unable to sign out an item.");
    }

    //*********************************************************************************
   
    System.out.println ("\n*** Test case #8: Sign out multiple LibraryItems");
    
    boolean successfulSignOut = true;
    for (int i=1; i<=2; i++) {
      successfulSignOut = successfulSignOut && maria.signOut(testItemList[i]);
    }
    if (successfulSignOut) {
      System.out.println ("Correct result: "
        + "Maria signed out two more items successfully.");
      mariasItemList = maria.getSignedOutItems();
      if (mariasItemList.length == 3) {
        System.out.println ("Correct result: Maria has three lending items.");
      }
      else {
        System.out.println (">> ERROR: Maria has other than three lending items.");
      }
    }
    else {
      System.out.println (">> ERROR: Maria was unable to sign out two more items.");
    }
    
    //*********************************************************************************
    
    System.out.println ("\n*** Test case #9: Intentionally exceed the sign out limit");
    
    for(int i=3; i<MAXITEMS; i++) {
      maria.signOut(testItemList[i]);
    }
    if (!maria.signOut(testItemList[MAXITEMS])) {
      System.out.println ("Correct result: "
                          + "Maria was prevented from signing out more than "
                          + MAXITEMS + " lending items.");
    }
    else {
      System.out.println (">> ERROR: Maria was able to sign out more than "
                          + MAXITEMS + " lending items.");
    }

    //*********************************************************************************
    
    System.out.println ("\n*** Test case #10: "
      + "A staff resident tries to sign out items");
    
    LibraryItem rorysItem = null;
    
    for(int i=0; i<2; i++) {
      if(rory.signOut(testItemList[i])) {
        rorysItem = testItemList[i];        // Remember this for Test case #10
        if (testItemList[i].getAlumniDonated()) {
          System.out.println (">> ERROR: "
            + "Rory was able to sign out an alumni-donated item.");
        }
        else {
          System.out.println ("Correct result: "
            + "Rory was able to sign out a non-alumni-donated item.");
        }
      }
      else {
        if (testItemList[i].getAlumniDonated()) {
          System.out.println ("Correct result: "
            + "Rory was prevented from signing out an alumni-donated item.");
        }
        else {
          System.out.println (">> ERROR: "
            + "Rory was prevented from signing out a non-alumni-donated item.");
        }
      }
    }//end for

    //*********************************************************************************
    
    System.out.println 
      ("\n*** Test case #11: Returning the only item that was signed out");
    
    int roryListLength = rory.getSignedOutItems().length;

    if (rory.returnItem(rorysItem)) {
      System.out.println ("Correct result: Rory's item was successfully returned.");
    }
    else {
      System.out.println (">> ERROR: Rory's item was not successfully returned.");
    }

    if(rory.getSignedOutItems().length == roryListLength - 1) {
      System.out.println ("Correct result: Rory's list length changed appropriately.");
    }
    else {
      System.out.println (">> ERROR: Rory's list length did not change appropriately.");
    }


    //*********************************************************************************
    
    System.out.println ("\n*** Test case #12: Returning an item that was not signed out");
    
    if (rory.returnItem(testItemList[3])) {
      System.out.println (">> ERROR: Returned an item that was not signed out.");
    }
    else {
      System.out.println ("Correct result: "
        + "Unsuccessful attempt to return an item that was not signed out.");
    }
  
    //*********************************************************************************
    
    System.out.println
      ("\n*** Test case #13: Returning the first item that was signed out");
    
    int mariaListLength = maria.getSignedOutItems().length;

    if (maria.returnItem(testItemList[0])) {
      System.out.println ("Correct result: "
        + "Maria's first item was successfully returned.");
    }
    else {
      System.out.println (">> ERROR: Maria's first item was not successfully returned.");
    }

    if (maria.getSignedOutItems().length == mariaListLength - 1) {
      System.out.println ("Correct result: Maria's list length changed appropriately.");
    }
    else {
      System.out.println (">> ERROR: Maria's list length did not change appropriately.");
    }

    System.out.println
      ("\nConfirm return: Skip-Bo should be absent from the following list:");
    mariasItemList = maria.getSignedOutItems();
    for (int i=0; i<mariasItemList.length; i++) {
      System.out.println (mariasItemList[i].getDescription());
    }


    //*********************************************************************************
    
    System.out.println("\n*** Test case #14: Returning a mid-list item");
    
    mariaListLength = maria.getSignedOutItems().length;

    if (maria.returnItem(testItemList[4])) {
      System.out.println 
         ("Correct result: Codenames (Card Game) was successfully returned.");
    }
    else {
      System.out.println 
         (">> ERROR: Codenames (Card Game) was not successfully returned.");
    }

    if (maria.getSignedOutItems().length == mariaListLength - 1) {
      System.out.println ("Correct result: Maria's list length changed appropriately.");
    }
    else {
      System.out.println (">> ERROR: Maria's list length did not change appropriately.");
    }

    System.out.println ("\nConfirm return: "
      + "Codenames (Card Game) should be absent from the following list:");
    mariasItemList = maria.getSignedOutItems();
    for (int i=0; i<mariasItemList.length; i++) {
      System.out.println (mariasItemList[i].getDescription());
    }

    //*********************************************************************************
    
    System.out.println("\n************* End of Test Cases ***************\n");
    
  } // end main method


} // end class