import java.util.Scanner;
/**
 @author Ebrahim Arefi 3621326
**/
public class InputAndOutput {

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("My name is TOM. What is your name?");
 String userInput = sc.nextLine();
 System.out.println("Pleased to meet you, " + userInput);
 System.out.println("In which program are you enrolled?");
 String programInput = sc.nextLine();
 System.out.println("Nice to meet you " + userInput + ", " + "good luck with " + programInput);
 }
}
