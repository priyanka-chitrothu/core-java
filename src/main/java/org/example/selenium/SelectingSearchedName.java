package org.example.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelectingSearchedName {
    public static void main(String[] args) throws Throwable{
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeOptions options = new ChromeOptions();

        // Suppress "Chrome is being controlled by automated test software" message
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        // Create a Map for preferences
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 1); // 1 = Allow, 2 = Block
        prefs.put("profile.default_content_setting_values.geolocation", 1); // 1 = Allow, 2 = Block
        prefs.put("profile.default_content_setting_values.media_stream", 1); // 1 = Allow camera/mic

        options.setExperimentalOption("prefs", prefs);

        // Launch Chrome with options
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://customer.uat.monarchtractor.com/login");
        driver.findElement(By.tagName("input")).sendKeys("support_3953772269@monarchtractor.com");
        driver.findElement(By.id("password")).sendKeys("Monarch!23");
        driver.findElement(By.id("login")).click();

        // To Select searched name
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#rc_select_0")));
        element.sendKeys("W-101");
        Thread.sleep(2000);
        element.click();
        Thread.sleep(2000);
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.ENTER);
            }
        }

