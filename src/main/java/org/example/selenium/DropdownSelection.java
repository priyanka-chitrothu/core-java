package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelection {
    public static void main(String[] args){
        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        WebElement Dropd= driver.findElement(By.name("input_8"));
        Select select = new Select(Dropd);
        //To get the first selected option name
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println("To get the first selected option"+ firstSelectedOption.getText());

        select.selectByIndex(2);
        WebElement Dropd1 = driver.findElement(By.name("input_75"));
        Select select1 = new Select(Dropd1);
        select1.selectByValue("Agriculture");
        WebElement Dropd2 = driver.findElement(By.name("input_1_75"));
        Select select2 = new Select(Dropd2);
        select2.selectByVisibleText("Chemicals");




    }
}
