/**
Represents a manufacturer.
@author Leah Bidlake
*/
public class Manufacturer{

   /**The name of the manufacturer.*/
   private String name;

   /**The location of the manufacturer.*/
   private String location;

   /**The number of employees.*/
   private int employees;

   /**
   Constructs a manufacturer given the name of the manufacturer, 
   the location of the manufacturer, and the number of employees.
   @param name the name of the manufacturer.
   @param value the location of the manufacturer.
   @param year the number of employees.
   */   
   public Manufacturer(String name, String location, int employees){
      this.name = name;
      this.location = location;
      this.employees = employees;
   }

   /**
   Returns the name of the manufacturer.
   @return the name of the manufacturer.
   */
   public String getName(){
      return name;
   }

   /**
   Returns the location of the manufacturer.
   @return the location of the manufacturer.
   */
   public String getLocation(){
      return location;
   }

   /**
   Returns the number of employees.
   @return the number of employees.
   */
   public int getEmployees(){
      return employees;
   }
}