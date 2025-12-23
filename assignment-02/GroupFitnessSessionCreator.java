import java.util.Scanner;

/**
 * A driver class that collects information about the Fitness Sessions.
 *
 * @author Ebrahim Arefi, 3621326
 */

public class GroupFitnessSessionCreator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of the session: ");
        String sessionName = scanner.nextLine();

        System.out.print("Enter instructor's name: ");
        String instructorName = scanner.nextLine();

        System.out.print("Enter the locatoin: ");
        String location = scanner.nextLine();

        System.out.print("Enter the intensity level: ");
        int level = scanner.nextInt();
        
        System.out.print("Enter the number of Participants: ");
        int participantsNum = scanner.nextInt();
                    
        
        
        GroupFitnessSession session5 = new GroupFitnessSession(sessionName, instructorName, level, location);


        session5.addParticipants(participantsNum);

        System.out.println("session5: " + session5.toString());

    }
}