package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertUsingiframe {
    public static void main(String[] args) throws Throwable {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
        WebElement frame1 = driver.findElement(By.id("'iframeResult'"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("/html/body/button")).click();
        //String alertText = driver.switchTo().alert().getText();

    }
}
