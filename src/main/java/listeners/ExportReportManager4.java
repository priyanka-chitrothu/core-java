package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ExportReportManager4 {
    public static void main(String[] args) throws IOException {
        ExtentReports extentReports = new ExtentReports();
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("C:\\Users\\karth\\Documents");
        ExtentSparkReporterConfig config = extentSparkReporter.config();
        extentReports.attachReporter(extentSparkReporter);
        config.setTheme(Theme.DARK);
        config.setReportName("Report name");
        config.setDocumentTitle("Doc Title");
        config.setTimeStampFormat("dd-MM-yyyy hh:mm:ss");
        config.setCss(".badge-primary{background-color:#da0b2b}");

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
