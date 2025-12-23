/**
 * This class represents a dog.
 * 
 * @author Ebrahim Arefi, 3621326
 */
public class Dog {

   /**
    * The name of the dog.
    */
   private String name;

   /**
    * The age of the dog (in years).
    */
   private int age;

   /**
    * This method constructs a Dog object with the specified
    * name and age.
    * 
    * @param nameIn the name of the dog.
    * @param ageIn  the age of the dog (in years).
    */
   public Dog(String nameIn, int ageIn) {
      name = nameIn;
      age = ageIn;
   }

   /**
    * This method retrieves the name of the dog.
    * 
    * @return the name of the dog.
    */
   public String getName() {
      return name;
   }

   /**
    * This method retrieves the age of the dog.
    * 
    * @return the age of the dog (in years).
    */
   public int getAge() {
      return age;
   }

   /**
    * This method computes and returns the dog's age in
    * "person years".
    * 
    * @return the age of the dog (in person years).
    */
   public int dogToHumanAge() {
      return age * 7;

   }

   /**
    * This method is called to change the name of the dog.
    * 
    * @param nameIn the new name for the dog.
    */
   public void setName(String nameIn) {
      name = nameIn;
   }

   /**
    * This method is called to increase the age of the dog
    * by one year.
    */
   public void ageIncrease() {
      age++;
   }

} // end Dog
