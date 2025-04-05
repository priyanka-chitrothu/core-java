package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectMultipleOptionsDropdown {
    public static void main(String[] args) {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        WebElement dropd = driver.findElement(By.xpath("(//select[@id='searchDropdownBox'])"));
        dropd.click();
        Select select = new Select(dropd);
        select.selectByVisibleText("Alexa Skills");
        select.selectByIndex(5);
        List<WebElement> allitems = select.getAllSelectedOptions();
        System.out.println("Selected items number is" + allitems.size());
        select.deselectAll();
        select.selectByVisibleText("Alexa Skills");
        select.selectByIndex(2);
        select.deselectByIndex(2);
        List<WebElement> allitem2 = select.getAllSelectedOptions();
        System.out.println("All selected items count" +allitem2.size());

    }
}
