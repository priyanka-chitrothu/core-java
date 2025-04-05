package org.example.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class BasicWebDriverMethods1 {
    public static void main(String[] args) {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("(//input[@id='login-button'])")).click();
        // to find list of Elements
        List< WebElement> We = driver.findElements(By.xpath("(//div[@class='inventory_list'])"));
        System.out.println("List of Elements: " +We);

        // To Handle a Window
        driver.navigate().to("https://www.sugarcrm.com/au/");
        String windowHandle = driver.getWindowHandle();
        System.out.println("Window name :"+ windowHandle);

        //To Handle Windows
        driver.findElement(By.xpath("(//span[normalize-space()='Get a Demo'])"));
        Set<String> WindowHandles = driver.getWindowHandles();
        System.out.println(WindowHandles);




    }
}
