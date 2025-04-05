package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssertion {
    @Test
    public static void TestTitle() {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        SoftAssertion softAssertion = new SoftAssertion();
        String expectedtext = "Search";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String actualTitle = driver.getTitle();
        System.out.println("Verifying Title");
        Assert.assertEquals(actualTitle, expectedtitle, "Title Verification failed");
        String actualtext = driver.findElement(By.xpath("(//span[@class='gh-search-button__label'])")).getAttribute("value");
        System.out.println("Verifying Text");
        Assert.assertEquals(actualtext, expectedtext, "Title Verification failed");
    }
}
