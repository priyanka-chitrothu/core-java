package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

public class CheckBox {
    public static void main(String[] args) throws Throwable{
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        // To accept cookies pop out
        driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
        Thread.sleep(2000);

        //Scroll to check box
        WebElement checkBox = driver.findElement(By.id("input_1_12_1"));
        Actions actions = new Actions(driver);
        actions.moveToElement(checkBox);
        actions.perform();
        //click on Check box
       WebElement clickCheckbox = driver.findElement(By.name("input_12.1"));
       Actions actions1 = new Actions(driver);
       actions1.moveToElement(clickCheckbox).click();
       Thread.sleep(2000);
       actions1.perform();
       Thread.sleep(2000);
        actions1.moveToElement(clickCheckbox).click();

        // get number of check boxes
        System.out.println(driver.findElements(By.xpath("(//input[@id='input_1_12_1'])")).size());

    }
}
