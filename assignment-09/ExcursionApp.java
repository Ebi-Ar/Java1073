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

/**
 * ExcursionApp class allows customers to enter their information
 * and choose between a Basic or Premium excursion.
 *
 * @author Ebrahim Arefi, 3621326
 */
public class ExcursionApp extends Application {

    private TextField nameField;
    private TextField daysField;
    private TextField mealsField;
    private TextField walksField;
    private Text costMsg;
    private Text perkMsg;

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Explore");

        nameField = new TextField();
        daysField = new TextField();
        mealsField = new TextField();
        walksField = new TextField();

        nameField.setPrefWidth(140);
        daysField.setPrefWidth(60);
        mealsField.setPrefWidth(60);
        walksField.setPrefWidth(60);

        Label nameLabel = new Label("Name:");
        Label daysLabel = new Label("Number of Days:");
        Label mealsLabel = new Label("Number of Meals:");
        Label walksLabel = new Label("Number of Walks:");

        Button premiumButton = new Button("Premium");
        premiumButton.setOnAction(this::processPremium);

        Button basicButton = new Button("Basic");
        basicButton.setOnAction(this::processBasic);

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(this::processClear);

        costMsg = new Text("Welcome to Explore Tours.");
        perkMsg = new Text("Enter your excursion information.");

        FlowPane pane = new FlowPane(10, 10,
                nameLabel, nameField,
                daysLabel, daysField,
                mealsLabel, mealsField,
                walksLabel, walksField,
                premiumButton, basicButton, clearButton,
                perkMsg, costMsg);

        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(12);

        Scene scene = new Scene(pane, 200, 330);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processBasic(ActionEvent event) {
        String name = nameField.getText();
        int days = Integer.parseInt(daysField.getText());
        int meals = Integer.parseInt(mealsField.getText());
        int walks = Integer.parseInt(walksField.getText());

        BasicExcursion basic = new BasicExcursion(name, days, meals, walks);
        double total = basic.calculateCost();

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        costMsg.setText("Total Cost: " + currency.format(total));
        perkMsg.setText("Perk: " + basic.getPerk());
    }

    public void processPremium(ActionEvent event) {
        String name = nameField.getText();
        int days = Integer.parseInt(daysField.getText());
        int meals = Integer.parseInt(mealsField.getText());
        int walks = Integer.parseInt(walksField.getText());

        PremiumExcursion premium = new PremiumExcursion(name, days, meals, walks);
        double total = premium.calculateCost();

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        costMsg.setText("Total Cost: " + currency.format(total));
        perkMsg.setText("Perk: " + premium.getPerk());
    }

    public void processClear(ActionEvent event) {
        nameField.clear();
        daysField.clear();
        mealsField.clear();
        walksField.clear();
        costMsg.setText("Welcome to Explore Tours.");
        perkMsg.setText("Enter your excursion information.");
    }
}