/**
 * This class represents a group fitness session.
 * 
 * @author Leah Bidlake
 * @author Ebrahim Arefi, 3621326
 */
public class GroupFitnessSession {

   // Instance variables:
   // For each GroupFitnessSession object, store the name of the group fitness
   // session,
   // the instructor, the intensity level,
   // and the number of participants signed up for the session so far.
   private String sessionName;
   private String instructor;
   private int intensityLevel;
   private int participants;
   private String location;

   // The constructor creates a new GroupFitnessSession object and
   // initializes the instance variables.
   public GroupFitnessSession(String sessionNameIn, String instructorIn, int intensityLevelIn, String locationIn) {
      sessionName = sessionNameIn;
      instructor = instructorIn;
      intensityLevel = intensityLevelIn;
      participants = 0; // the class initially has no participants
      location = locationIn;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String locationIn) {
      location = locationIn;
   }

   public void addParticipants(int participantsIn) {
      participants += participantsIn;

   }

   // This is a method that we can call on a GroupFitnessSession object
   // (Specifically, it is an accessor method). This method
   // creates and returns a String containing all the information
   // about the state of the object.
   public String toString() {
      return "Group Fitness Session: " + sessionName +
            "\n\tIntensity Level: " + intensityLevel +
            "\n\tParticipants: " + participants +
            "\n\tlocation: " + location;
   }

}