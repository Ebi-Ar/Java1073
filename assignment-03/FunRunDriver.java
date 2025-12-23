/**
 * This is a driver class prints out each participant's name, number, total
 * funds, and their employer's gift contribution.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public class FunRunDriver {
        public static void main(String[] args) {

                FunRunParticipant sonia = new FunRunParticipant("Sonia Jackson", 1234512345L);
                sonia.addDonation(48.00);

                FunRunParticipant karl = new FunRunParticipant("Karl Wagner", 5246801135L);
                karl.addDonation(39.60);

                FunRunParticipant ivy = new FunRunParticipant("Ivy Paul", 9834510621L);
                ivy.addDonation(138.20);

                FunRunParticipant luca = new FunRunParticipant("Luca Conti", 7864236928L);
                luca.addDonation(153.80);
                luca.addDonation(64.00);

                karl.addDonation(75.00);

                sonia.addDonation(50.00);
                ivy.addDonation(50.00);

                System.out.println("As3Q2Output:");
                System.out.println("----------");
                System.out.println(
                                "Name: " + sonia.getName() + "\n\tparticipant number: " + sonia.getParticipantNumber()
                                                + "\n\tTotal funds: "
                                                + sonia.getFunds());

                System.out.println();
                System.out.println("----------");
                System.out.println(
                                "Name: " + karl.getName() + "\n\tparticipant number: " + karl.getParticipantNumber()
                                                + "\n\tTotal funds: "
                                                + karl.getFunds());

                System.out.println();
                System.out.println("----------");
                System.out.println(
                                "Name: " + ivy.getName() + "\n\tparticipant number: " + ivy.getParticipantNumber()
                                                + "\n\tTotal funds: "
                                                + ivy.getFunds());

                System.out.println();
                System.out.println("----------");
                System.out.println(
                                "Name: " + luca.getName() + "\n\tparticipant number: " + luca.getParticipantNumber()
                                                + "\n\tTotal funds: "
                                                + luca.getFunds());

                double soniaGift = sonia.calculateEmployerGift(0.2);
                double karlGift = karl.calculateEmployerGift(0.15);

                double ivyGift = ivy.calculateEmployerGift(0.25);
                double lucaGift = luca.calculateEmployerGift(0.25);

                System.out.println();
                System.out.println();
                System.out.println("--------------------");
                System.out.println("Gift received by sonia: " + soniaGift + "\n");
                System.out.println();
                System.out.println("Gift received by karl: " + karlGift + "\n");
                System.out.println();
                System.out.println("Gift received by ivy: " + ivyGift + "\n");
                System.out.println();
                System.out.println("Gift received by luca: " + lucaGift + "\n");
        }

}