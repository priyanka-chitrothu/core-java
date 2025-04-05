package stringExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractOrderIDFromString {
        public static void main(String[] args) {
            String message = "your order placed successfully with ID #1234WDW, please note for further reference.";
//           String ID = message.replaceAll("[^A-Z0-9#]", " ");
//            System.out.println(ID);

            // Compile the regex pattern to find order ID after #
            Pattern pattern = Pattern.compile("#([A-Z0-9]+)");

            // Create matcher to find matches
            Matcher matcher = pattern.matcher(message);

            if (matcher.find()) {
                System.out.println("Order ID: " + matcher.group(1)); // Extracts the matched group
            } else {
                System.out.println("Order ID not found.");
            }
        }
    }

