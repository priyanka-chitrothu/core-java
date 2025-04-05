package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// how to get entered Text
public class InterviewQuestionTCS {
    public static void main(String[] args) {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://customer.uat.monarchtractor.com/login");
            WebElement email_id = driver.findElement(By.id("userId"));
            email_id.sendKeys("support_3953772269@monarchtractor.com");
            String enteredEmail = email_id.getAttribute("value");
            System.out.println("Entered email: "+ enteredEmail);
        } finally {
            driver.quit();
        }
    }
}
