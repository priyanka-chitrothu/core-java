package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOniframe {
    public static void main(String[] args) throws Throwable {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
        //iframe by index
        driver.switchTo().frame(1);
        //iframe by id
        driver.switchTo().frame("");
        //iframe by name
        WebElement name = driver.findElement(By.name(""));
        driver.switchTo().frame(name);
        //iframe by parentFrame
        driver.switchTo().parentFrame();
        driver.findElement(By.tagName("button")).click();
    }
}
