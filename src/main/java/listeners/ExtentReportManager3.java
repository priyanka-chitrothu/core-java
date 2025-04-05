package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static org.openqa.selenium.devtools.v85.page.Page.captureScreenshot;

public class ExtentReportManager3 {
    public static void main(String[] args) throws IOException {
        ExtentReports extentReports = new ExtentReports();
        File file =new File("C:\\Users\\karth\\Documents");
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(file);
        extentReports.attachReporter(extentSparkReporter);

        extentReports
                .createTest("test 1 ", "Test Desc")
                .assignDevice("Chrome 65")
                .assignCategory("Sanity")
                .assignAuthor("John")
                .pass("This test is passed");

        extentReports
                .createTest("test 2 ", "Test Desc")
                .assignDevice("Chrome 65")
                .assignCategory("Sanity")
                .assignAuthor("Rebecca")
                .pass("This test is passed");

        extentReports
                .createTest("test 3 ", "Test Desc")
                .assignDevice("fire fox")
                .assignCategory("Sanity")
                .assignAuthor("John")
                .fail("This test is failed");
        extentReports
                .createTest("test 4 ", "Test Desc")
                .assignDevice("Chrome 65")
                .assignCategory("Sanity")
                .assignAuthor("Rebecca")
                .fail("This test is failed");

        extentReports.flush();
        Desktop.getDesktop().browse(new File("C:\\Users\\karth\\Documents").toURI());





    }
}
