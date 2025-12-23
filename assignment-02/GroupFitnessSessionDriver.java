/**
 * This is an example of a driver class; its purpose
 * is to try out the GroupFitnessSession class.
 * 
 * @author Leah Bidlake
 * @author Ebrahim Arefi, 3621326
 */
public class GroupFitnessSessionDriver {

   public static void main(String[] args) {

      // Create some GroupFitnessSession objects
      GroupFitnessSession session1 = new GroupFitnessSession("Yoga Flow", "Anuja", 3, "Head Hall");
      GroupFitnessSession session2 = new GroupFitnessSession("Aquafit Express", "Wendy", 1, "China Town");
      GroupFitnessSession session3 = new GroupFitnessSession("Mat Pilates", "Chinasa", 6, "Windsor Hall");
      GroupFitnessSession session4 = new GroupFitnessSession("007", "James Bond", 10, "United Kingdom");

      System.out.println("Sign ups: ");
      session1.addParticipants(14);
      session2.addParticipants(8);
      session3.addParticipants(21);
      // later in the week
      session2.addParticipants(10);
      
      // Now I can print out my session to confirm they
      // were created properly
      System.out.println("session1: " + session1.toString());
      System.out.println("session2: " + session2.toString());
      System.out.println("session3: " + session3.toString());
      System.out.println("session4: " + session4.toString());
      

   }

}