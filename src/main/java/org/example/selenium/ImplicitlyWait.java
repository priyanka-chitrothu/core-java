package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ImplicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com.au/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        WebElement element= driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

        driver.findElement(By.xpath("(//a[normalize-space()='Electronic Sales'])")).click();

    }
}
