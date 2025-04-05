package org.example.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  BasicWebDriverMethods{
    public static void main(String[] args) {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://customer.uat.monarchtractor.com/login");
        driver.manage().window().maximize();
        //to get the page URL
        String current = driver.getCurrentUrl();
        System.out.println("Current URL is : " + current);
        //to get the page title
        String title = driver.getTitle();
        System.out.println("Page Title is : "+ title );
        // to get page source
        String pageSource = driver.getPageSource();
        System.out.println("Page source is "+  pageSource);
        // to navigate to another window
        driver.navigate().to("https://www.youtube.com");
        //to close current window
        driver.close();

    }
}
