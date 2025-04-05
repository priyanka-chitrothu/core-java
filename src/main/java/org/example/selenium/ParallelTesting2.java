package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTesting2 {
     WebDriver driver;
     @Test
     void LoginTest() throws InterruptedException{
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://customer.uat.monarchtractor.com/login");
        driver.findElement(By.tagName("input")).sendKeys("support_3953772269@monarchtractor.com");
        driver.findElement(By.id("password")).sendKeys("Monarch!23");
        driver.findElement(By.id("login")).click();
        Thread.sleep(5000);

    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
