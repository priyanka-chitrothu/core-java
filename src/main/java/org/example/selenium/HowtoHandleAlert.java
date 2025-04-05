package org.example.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowtoHandleAlert {
    public static void main(String[] args) throws Throwable {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        WebElement frame1= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("(//button[normalize-space()='Try it'])")).click();
        Thread.sleep(2000);
        Alert alertToPage = driver.switchTo().alert();
        alertToPage.sendKeys("Hello World");
        alertToPage.accept();

        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());


    }
}
