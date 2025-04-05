package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args){
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://customer.uat.monarchtractor.com/login");
        driver.findElement(By.tagName("input")).sendKeys("support_3953772269@monarchtractor.com");
        driver.findElement(By.id("password")).sendKeys("Monarch!23");
        driver.findElement(By.id("login")).click();
        driver.quit();

    }
}
