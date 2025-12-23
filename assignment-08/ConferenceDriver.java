import java.text.NumberFormat;

/**
 * This class tests the ConferencePass hierarchy.
 * It creates multiple types of passes and prints their details and total costs.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public class ConferenceDriver {

    public static void main(String[] args) {

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        ExhibitorPass e1 = new ExhibitorPass("Ebi A", true, 3, true);
        ExhibitorPass e2 = new ExhibitorPass("King Kong", false, 1, false);

        AttendeePass a1 = new AttendeePass("Kim Kar", true, 2);
        AttendeePass a2 = new AttendeePass("Jacki Lee", false, 0);

        StudentAttendeePass s1 = new StudentAttendeePass("Lee Chan", true, 12);
        StudentAttendeePass s2 = new StudentAttendeePass("Meo Dog", false, 1);

        System.out.println("\n     Exhibitor Pass Details");
        System.out.println("================================\n");

        System.out.println("Pass Type: Exhibitor Pass");
        System.out.println("Name: " + e1.getName());
        System.out.println("ACM Member: " + e1.getMemberAcm());
        System.out.println("Number of Tables: " + e1.getNumOfTables());
        System.out.println("Power Outlet Required: " + e1.getPowerOutlet());
        System.out.println("Total Cost: " + currencyFormat.format(e1.totalCost()));
        System.out.println();

        System.out.println("Pass Type: Exhibitor Pass");
        System.out.println("Name: " + e2.getName());
        System.out.println("ACM Member: " + e2.getMemberAcm());
        System.out.println("Number of Tables: " + e2.getNumOfTables());
        System.out.println("Power Outlet Required: " + e2.getPowerOutlet());
        System.out.println("Total Cost: " + currencyFormat.format(e2.totalCost()));
        System.out.println();

        System.out.println("     Attendee Pass Details");
        System.out.println("================================\n");

        System.out.println("Pass Type: Attendee Pass");
        System.out.println("Name: " + a1.getName());
        System.out.println("ACM Member: " + a1.getMemberAcm());
        System.out.println("Total Banquet Tickets: " + a1.getTotalBanquetTickets());
        System.out.println("Total Cost: " + currencyFormat.format(a1.totalCost()));
        System.out.println();

        System.out.println("Pass Type: Attendee Pass");
        System.out.println("Name: " + a2.getName());
        System.out.println("ACM Member: " + a2.getMemberAcm());
        System.out.println("Total Banquet Tickets: " + a2.getTotalBanquetTickets());
        System.out.println("Total Cost: " + currencyFormat.format(a2.totalCost()));
        System.out.println();

        System.out.println("     Student Attendee Pass Details");
        System.out.println("====================================\n");

        System.out.println("Pass Type: Student Attendee Pass");
        System.out.println("Name: " + s1.getName());
        System.out.println("ACM Member: " + s1.getMemberAcm());
        System.out.println("Total Banquet Tickets: " + s1.getTotalBanquetTickets());
        System.out.println("Giveaway Item: " + s1.getGiveawayItem());
        System.out.println("Total Cost: " + currencyFormat.format(s1.totalCost()));
        System.out.println();

        System.out.println("Pass Type: Student Attendee Pass");
        System.out.println("Name: " + s2.getName());
        System.out.println("ACM Member: " + s2.getMemberAcm());
        System.out.println("Total Banquet Tickets: " + s2.getTotalBanquetTickets());
        System.out.println("Giveaway Item: " + s2.getGiveawayItem());
        System.out.println("Total Cost: " + currencyFormat.format(s2.totalCost()));
    }

}