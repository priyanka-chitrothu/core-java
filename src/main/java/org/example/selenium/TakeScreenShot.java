package org.example.selenium;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {
    public static void main(String[] args) throws IOException, InterruptedException {
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebuy.com.au");

        File ScreenShotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(ScreenShotfile,new File("C:\\workspace\\ProjectMaven_1\\screenshots\\first_one.png"));
        Thread.sleep(2000);
        System.out.println("File copied successfully....");
        //driver.quit();
    }
}
