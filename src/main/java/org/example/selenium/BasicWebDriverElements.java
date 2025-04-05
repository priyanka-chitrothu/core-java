package org.example.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  BasicWebDriverElements {
    public static void main(String[] args) {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).getAttribute("class");
       // driver.findElement(By.xpath("(//input[@id='login-button'])")).getCssValue("Login");
        System.out.println(driver.findElement(By.xpath("(//input[@id='login-button'])")).getSize());
        System.out.println(driver.findElement(By.xpath("(//input[@id='login-button'])")).getText());
        System.out.println(driver.findElement(By.xpath("(//input[@id='login-button'])")).getTagName());
        System.out.println(driver.findElement(By.xpath("(//input[@id='login-button'])")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("(//input[@id='login-button'])")).isEnabled());
        System.out.println(driver.findElement(By.xpath("(//input[@id='login-button'])")).isSelected());
    }
}
