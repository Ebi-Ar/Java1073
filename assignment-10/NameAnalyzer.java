
/**
 * NameAnalyzer Application.
 * Analyzes user's inputs and gathers data. 
 *
 * @author Ebrahim Arefi
 */

import java.util.Scanner;

public class NameAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String surname = "";
        String givenName = "";
        String currentNick = "";

        boolean readingSurname = true;
        boolean readingGivenName = false;
        boolean readingNickName = false;

        int nickNameCount = 0;
        String longestNickName = "";
        int longestLength = 0;

        int commaCount = 0;

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            if (c == ',') {
                commaCount++;

                if (commaCount == 1) {
                    readingSurname = false;
                    readingGivenName = true;
                    readingNickName = false;
                }

                else if (commaCount == 2) {
                    readingSurname = false;
                    readingGivenName = false;
                    readingNickName = true;
                }

                else if (commaCount >= 3) {

                    int letters = 0;
                    for (int j = 0; j < currentNick.length(); j++) {

                        char d = currentNick.charAt(j);
                        boolean upper = (d >= 'A' && d <= 'Z');
                        boolean lower = (d >= 'a' && d <= 'z');

                        if (upper || lower) {
                            letters++;
                        }
                    }

                    if (letters > longestLength) {
                        longestLength = letters;
                        longestNickName = currentNick;
                    }

                    nicknameCount++;
                    currentNick = "";
                }
            } else {

                if (readingSurname) {
                    surname += c;
                } else if (readingGivenName) {
                    givenName += c;
                } else if (readingNickName) {
                    currentNick += c;
                }
            }
        }

        if (readingNickName && currentNick.length() > 0) {

            int letters = 0;
            for (int j = 0; j < currentNick.length(); j++) {
                char d = currentNick.charAt(j);
                boolean upper = (d >= 'A' && d <= 'Z');
                boolean lower = (d >= 'a' && d <= 'z');
                if (upper || lower) {
                    letters++;
                }
            }

            if (letters > longestLength) {
                longestLength = letters;
                longestNickName = currentNick;
            }

            nicknameCount++;
        }

        boolean multiWord = false;
        for (int i = 0; i < givenName.length(); i++) {
            char c = givenName.charAt(i);
            if (c == '-') {
                multiWord = true;
            }
        }

        char firstSurLetter = ' ';
        for (int i = 0; i < surname.length(); i++) {
            char ch = surname.charAt(i);

            boolean upper = (ch >= 'A' && ch <= 'Z');
            boolean lower = (ch >= 'a' && ch <= 'z');

            if (upper || lower) {

                if (upper) {
                    ch = (char) (ch + 32);
                }
                firstSurLetter = ch;
                break;
            }
        }

        char lastGivenLetter = ' ';
        for (int i = givenName.length() - 1; i >= 0; i--) {
            char ch = givenName.charAt(i);

            boolean upper = (ch >= 'A' && ch <= 'Z');
            boolean lower = (ch >= 'a' && ch <= 'z');

            if (upper || lower) {

                if (upper) {
                    ch = (char) (ch + 32);
                }
                lastGivenLetter = ch;
                break;
            }
        }

        boolean letterFlow = false;
        if (lastGivenLetter == firstSurLetter) {
            letterFlow = true;
        }

        System.out.println(" ");
        System.out.println("------------------------");
        System.out.println("Output:\n");

        String full = givenName.toUpperCase() + " " + surname.toUpperCase();

        if (nickNameCount > 0) {
            full += " (" + longestNickName + ")";
        }

        System.out.println(full);
        System.out.println("Multi-word Given Name: " + multiWord);
        System.out.println("Letter Flow: " + letterFlow);
        System.out.println("Number of Nicknames: " + nickNameCount);
        System.out.println(" ");
        System.out.println(" ");

    }
}