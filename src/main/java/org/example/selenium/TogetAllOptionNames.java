package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TogetAllOptionNames {
    public static void main(String[] args) {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sugarcrm.com/au/request-demo/");

        List<WebElement> allTags = driver.findElements(By.tagName(("option")));
        System.out.println("all Tags are: " + allTags.size());
        for(int i=1; i<allTags.size() ; i++){
            System.out.println("All Options are: "+ allTags.get(i).getAttribute("value"));
        }
    }
}
