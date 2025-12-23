/**
 * This is a driver class, that indicates the name and age of the dog.
 * As well as, computing and changing the age.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public class DogTestDriver {
        public static void main(String[] args) {

                Dog d1 = new Dog("Joo", 2);
                Dog d2 = new Dog("Jii", 5);
                Dog d3 = new Dog("Jaa", 10);

                d3.setName("Boo");

                d2.ageIncrease();

                System.out.println("As3Q1Output");
                System.out.println("-------------");
                System.out.println("Dog 1:");
                System.out
                                .println("\tName: " + d1.getName() + "\n\tAge: " + d1.getAge() + "\n\tConverted age: "
                                                + d1.dogToHumanAge());

                System.out.println("-------------");
                System.out.println("Dog 2:");
                System.out
                                .println("\tName: " + d2.getName() + "\n\tAge: " + d2.getAge() + "\n\tConverted age: "
                                                + d2.dogToHumanAge());

                System.out.println("-------------");
                System.out.println("Dog 3:");
                System.out
                                .println("\tName: " + d3.getName() + "\n\tAge: " + d3.getAge() + "\n\tConverted age: "
                                                + d3.dogToHumanAge());

        }

}