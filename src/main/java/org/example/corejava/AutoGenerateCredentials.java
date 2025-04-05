package org.example.corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;
import java.util.UUID;

public class AutoGenerateCredentials {

    public static void main(String[] args) {
        // Set the path of your chromedriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to your registration or login page
            driver.get("https://example.com/register");

            // Generate random username and password
            String username = generateRandomUsername();
            String password = generateRandomPassword();

            // Locate the username and password input fields and fill them
            WebElement usernameField = driver.findElement(By.id("username")); // Update with actual element locator
            WebElement passwordField = driver.findElement(By.id("password")); // Update with actual element locator

            usernameField.sendKeys(username);
            passwordField.sendKeys(password);

            // Optional: Submit the form if needed
            WebElement submitButton = driver.findElement(By.id("submitButton")); // Update with actual submit button
            submitButton.click();

            // Output the generated credentials
            System.out.println("Generated Username: " + username);
            System.out.println("Generated Password: " + password);

        } finally {
            // Close the browser after the task
            driver.quit();
        }
    }

    // Function to generate a random username
    private static String generateRandomUsername() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder username = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(characters.length());
            username.append(characters.charAt(index));
        }
        return username.toString();
    }

    // Function to generate a random password
    private static String generateRandomPassword() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 12); // Example: generates 12 character password
    }
}


