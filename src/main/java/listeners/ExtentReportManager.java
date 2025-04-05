package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ExtentReportManager  {
    public static void main(String[] args) throws IOException {
//        String driverPath = "C:\\karthik\\libs\\chromedriver-win64\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", driverPath);
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        ExtentReports extentReports = new ExtentReports();
        //File file = new File("index.html");
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("C:\\Users\\karth\\Documents");
        extentReports.attachReporter(sparkReporter);
        ExtentTest test1 =extentReports.createTest("Test 1");
        test1.pass(" Test Successful");

        ExtentTest test2 =extentReports.createTest("Test 1");
        test2.log(Status.FAIL, "Test Failed");

        extentReports.createTest("Test 3").skip("This Test Skipped");

        extentReports.flush();
        Desktop.getDesktop().browse(new File("C:\\Users\\karth\\Documents").toURI());
    }


}
