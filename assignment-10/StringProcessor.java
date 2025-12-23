import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;

/**
 * StringProcessor GUI:
 *
 * Allow the user to type a textual string.
 * The program will check for Doublicates, and Longest sequence.
 * Also Generating Acronyms and Password.
 *
 * @author Ebrahim Arefi, 3621326
 */

public class StringProcessor extends Application {

    private TextField enter;
    private Label output;

    public void start(Stage primaryStage) {
        primaryStage.setTitle("String Processor");

        enter = new TextField();
        enter.setPrefWidth(300);

        Label enterLabel = new Label("Enter the textual string:");
        output = new Label("Awaiting your string-processing request!");

        Button resetButton = new Button("Reset");
        resetButton.setOnAction(this::processReset);

        Button doubleButton = new Button("Double Digit?");
        doubleButton.setOnAction(this::processDouble);

        Button longestButton = new Button("Longest Alphabetical Sequence?");
        longestButton.setOnAction(this::processLongest);

        Button acronymButton = new Button("Generate Acronym");
        acronymButton.setOnAction(this::processAcronym);

        Button passwordButton = new Button("Generate Password");
        passwordButton.setOnAction(this::processPassword);

        FlowPane pane = new FlowPane(20, 20,
                enterLabel, enter,
                doubleButton, longestButton,
                acronymButton, passwordButton,
                resetButton,
                output);

        pane.setAlignment(Pos.CENTER);
        pane.setVgap(10);
        pane.setHgap(10);

        Scene scene = new Scene(pane, 350, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void processDouble(ActionEvent e) {
        String input = enter.getText();
        if (hasDoubleDigit(input)) {
            output.setText("Yes, there are adjacent double digits.");
        } else {
            output.setText("No, there are no adjacent double digits.");
        }
    }

    private void processAcronym(ActionEvent e) {
        String input = enter.getText();
        output.setText("Generated Acronym: " + generateAcronym(input));
    }

    private void processPassword(ActionEvent e) {
        String input = enter.getText();
        output.setText("Generated Password: " + generatePassword(input));
    }

    private void processReset(ActionEvent e) {
        enter.setText("");
        output.setText("Awaiting your string-processing request!");
    }

    private void processLongest(ActionEvent e) {
        String input = enter.getText();
        int result = longestSequence(input);
        output.setText("Longest alphabetical sequence: " + result);
    }

    public boolean hasDoubleDigit(String text) {

        for (int i = 0; i < text.length() - 1; i++) {
            char ch1 = text.charAt(i);
            char ch2 = text.charAt(i + 1);
            if (ch1 >= '0' && ch1 <= '9' && ch2 >= '0') {
                if (ch2 <= '9' && ch1 == ch2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int longestSequence(String text) {
        int longest = 0;
        String textLower = text.toLowerCase();

        for (int i = 0; i < textLower.length(); i++) {
            char ch = textLower.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                int current = 1;
                char last = ch;

                for (int j = i + 1; j < textLower.length(); j++) {
                    char next = textLower.charAt(j);

                    if (next >= 'a' && next <= 'z') {
                        if (next >= last) {
                            current++;
                            last = next;
                        }
                    }
                }
            }
        }
        return longest;
    }

    public static String generateAcronym(String text) {

        String acronym = "";
        String tokenDigit = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == ' ') {
                if (tokenDigit.length() > 0) {
                    char first = tokenDigit.charAt(0);

                    if (first >= 'A' && first <= 'Z') {
                        acronym += first;
                    } else if (first >= '0' && first <= '9') {
                        acronym += tokenDigit;
                    }
                }
                tokenDigit = "";

            } else {
                tokenDigit += ch;
            }
        }

        if (tokenDigit.length() > 0) {
            char first = tokenDigit.charAt(0);
            if (first >= 'A' && first <= 'Z') {
                acronym = acronym + first;
            } else if (first >= '0' && first <= '9') {
                acronym += tokenDigit;
            }
        }

        if (acronym.length() < 2) {
            return "Unable to generate an acronym from this input";
        }
        return acronym;
    }

    public static String generatePassword(String text) {
        String password = "";
        String token = "";
        int tokenCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch != ' ') {
                token = token + ch;
            } else {

                if (token.length() > 3) {

                    tokenCount++;

                    if (tokenCount % 2 == 1) {

                        int len = token.length();

                        char c1 = token.charAt(len - 2);
                        char c2 = token.charAt(len - 1);

                        if (c1 >= 'A' && c1 <= 'Z')
                            c1 = (char) (c1 + 32);
                        if (c2 >= 'A' && c2 <= 'Z')
                            c2 = (char) (c2 + 32);

                        password = password + c1 + c2;
                    }

                }
                token = "";
            }
        }
        if (token.length() > 3) {
            password += token.charAt(0);
        }
        return password;
    }

}