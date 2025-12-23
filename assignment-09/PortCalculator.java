import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 * Port Fee Calculator Application
 *
 * Calculates the cost for ships to stop at ports.
 * Also allows reset with the Clear button.
 *
 * @author Ebrahim Arefi, 3621326
 */
public class PortCalculator extends Application {

    private TextField imoNumber;
    private TextField hourlyRate;
    private TextField hoursAtPort;
    private Text portMsg;
    private Text costMsg;
    private Text totalMsg;

    private double totalCost = 0.0;

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Port Calculator");

        imoNumber = new TextField();
        hourlyRate = new TextField();
        hoursAtPort = new TextField();

        imoNumber.setPrefWidth(100);
        hourlyRate.setPrefWidth(100);
        hoursAtPort.setPrefWidth(100);

        Label imoLabel = new Label("Enter the IMO number:");
        Label rateLabel = new Label("Enter the hourly rate:");
        Label hoursLabel = new Label("Enter the hours at port:");

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(this::processClear);

        Button calcButton = new Button("Calculate");
        calcButton.setOnAction(this::processCalculate);

        portMsg = new Text("Enter the port information.");
        costMsg = new Text("The cost for this port:");
        totalMsg = new Text("The total cost (all ports):");

        FlowPane pane = new FlowPane(10, 10,
                imoLabel, imoNumber,
                rateLabel, hourlyRate,
                hoursLabel, hoursAtPort,
                clearButton, calcButton,
                portMsg, costMsg, totalMsg);

        pane.setAlignment(Pos.CENTER);
        pane.setVgap(10);
        pane.setHgap(10);

        Scene scene = new Scene(pane, 250, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processCalculate(ActionEvent event) {
        double imo = Double.parseDouble(imoNumber.getText());
        double rate = Double.parseDouble(hourlyRate.getText());
        double hours = Double.parseDouble(hoursAtPort.getText());

        double cost = rate * hours;

        int lastDigit = (int) (imo % 10);
        if (lastDigit == 7) {
            cost = cost + 275.0;
        }

        totalCost = totalCost + cost;

        DecimalFormat df = new DecimalFormat("0.00");
        costMsg.setText("The cost for this port: $" + df.format(cost));
        totalMsg.setText("The total cost (all ports): $" + df.format(totalCost));
    }

    public void processClear(ActionEvent event) {
        imoNumber.clear();
        hourlyRate.clear();
        hoursAtPort.clear();
        totalCost = 0.0;

        portMsg.setText("Enter the port information.");
        costMsg.setText("The cost for this port:");
        totalMsg.setText("The total cost (all ports):");
    }
}