package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com.au/");
        WebElement element = driver.findElement(By.xpath("//body/div[@id='mainContent']/div[@class='page-grid-container hp-grid-container']/div[@class='page-grid hp-grid']/div[@id='vl-flyout-nav']/ul[@class='vl-flyout-nav__container']/li[2]/a"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//body[1]/div[7]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/nav[1]/ul[1]/li[5]")))).click();
    }
}
