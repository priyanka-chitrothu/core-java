package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class GetWindowHandles {
    public static void main(String[] args) throws Throwable {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/in/?ir=1");
        driver.findElement(By.xpath("(//a[normalize-space()='Watch demo'])")).click();
        Thread.sleep(2000);
        Set<String> WindowHandles = driver.getWindowHandles();
        System.out.println(WindowHandles);

        Iterator<String> iterator = WindowHandles.iterator();
        String ParentWindow = iterator.next();
        String ChildWindow = iterator.next();
        driver.switchTo().window(ChildWindow);

        driver.findElement(By.name("UserFirstName")).sendKeys("Test");
        driver.findElement(By.name("UserLastName")).sendKeys("QA");

    }
}
