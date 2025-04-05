package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {
    public static void main(String[] args) throws Throwable {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.singaporeair.com/en_UK/au/home#/book/bookflight");
        // to accept cookies
        // To accept cookies pop out
        driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
        Thread.sleep(2000);
        //to scroll to Radio button
         WebElement ScrolltoRadioButton = driver.findElement(By.xpath("(//input[@id='bookFlights'])"));
         Actions actions = new Actions(driver);
         actions.moveToElement(ScrolltoRadioButton).perform();
        // to click on Radio button
        WebElement radio = driver.findElement(By.xpath("(//input[@id='redeemFlights'])"));
        radio.click();
        System.out.println("To get confirmation"+ radio.isSelected());

        // To get list of Radio button present ob page
        System.out.println(driver.findElements(By.xpath("//.[@name= 'book-flight-radio']")).size());
    }
}
