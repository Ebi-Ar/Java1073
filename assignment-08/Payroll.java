
/**
 * A driver class named to calculate the Payroll of each worker.
 * 
 * @author Ebrahim Arefi, 3621326
 */

import java.text.NumberFormat;

public class Payroll {
        public static void main(String[] agrs) {

                NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

                RestaurantWorker Adriano = new RestaurantWorker("Adriano Oliveira", "Busser", 15.75);
                RestaurantWorker Fiona = new RestaurantWorker("Fiona Grant-Long", "Busser", 15.95);
                RestaurantWorker Hoang = new RestaurantWorker("Hoang Nguyen", "Dishwasher", 16.50);

                Server Jonathan = new Server("Jonathan Gorman", "Server", 16.5, 0.12);
                Server Aisha = new Server("Aisha Adegboyega", "Server", 15.75, 0.10);
                Server Brittany = new Server("Brittany Phillips", "Server", 17.50, 0.15);

                Chef Laura = new Chef("Laura Cox", "Executive Chef", 28.50, 57.00);
                Chef Adeline = new Chef("Adeline Gagne", "Sous Chef", 23.50, 43.50);
                Chef Nathaniel = new Chef("Nathaniel Paul", "Sous Chef", 25.75, 43.50);
                Chef Eleanor = new Chef("Eleanor Ryan", "Pastry Chef", 22.00, 39.00);

                System.out.println("Worker's Name & Job Title\tRate of Pay\tPay this week");
                System.out.println("=========================\t============\t===============");

                System.out.println(Fiona.getName() + " (" + Fiona.getJobTitle() + ")\t" +
                                currencyFormat.format(Fiona.getHourlyRate()) + "  /hr\t" +
                                currencyFormat.format(Fiona.computePay(14.5)) + "\n-------------------------");

                System.out.println(Adriano.getName() + " (" + Adriano.getJobTitle() + ")\t" +
                                currencyFormat.format(Adriano.getHourlyRate()) + "  /hr\t" +
                                currencyFormat.format(Adriano.computePay(18)) + "\n-------------------------");

                System.out.println(Aisha.getName() + " (" + Aisha.getJobTitle() + ")\t" +
                                currencyFormat.format(Aisha.getHourlyRate()) + "  /hr\t" +
                                currencyFormat.format(Aisha.computePay(18)) + "\n-------------------------");

                System.out.println(Adeline.getName() + " (" + Adeline.getJobTitle() + ")\t" +
                                currencyFormat.format(Adeline.getHourlyRate()) + "  /hr\t" +
                                currencyFormat.format(Adeline.computePay(18)) + "\n-------------------------");

                System.out.println(Nathaniel.getName() + " (" + Nathaniel.getJobTitle() + ")\t" +
                                currencyFormat.format(Nathaniel.getHourlyRate()) + "  /hr\t" +
                                currencyFormat.format(Nathaniel.computePay(26)) + "\n-------------------------");

                System.out.println(Brittany.getName() + " (" + Brittany.getJobTitle() + ")\t" +
                                currencyFormat.format(Brittany.getHourlyRate()) + "  /hr\t" +
                                currencyFormat.format(Brittany.computePay(38.5)) + "\n-------------------------");

                System.out.println(Hoang.getName() + " (" + Hoang.getJobTitle() + ")\t" +
                                currencyFormat.format(Hoang.getHourlyRate()) + "  /hr\t" +
                                currencyFormat.format(Hoang.computePay(42)) + "\n-------------------------");

                System.out.println(Eleanor.getName() + " (" + Eleanor.getJobTitle() + ")\t" +
                                currencyFormat.format(Eleanor.getHourlyRate()) + "  /hr\t" +
                                currencyFormat.format(Eleanor.computePay(42)) + "\n-------------------------");

                System.out.println(Jonathan.getName() + " (" + Jonathan.getJobTitle() + ")\t" +
                                currencyFormat.format(Jonathan.getHourlyRate()) + "  /hr\t" +
                                currencyFormat.format(Jonathan.computePay(46.5)) + "\n-------------------------");

                System.out.println(Laura.getName() + " (" + Laura.getJobTitle() + ")\t" +
                                currencyFormat.format(Laura.getHourlyRate()) + "  /hr\t" +
                                currencyFormat.format(Laura.computePay(46.5)) + "\n-------------------------");
        }
}
