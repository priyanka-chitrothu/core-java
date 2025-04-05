package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManger1 {
    public static void main(String[] args) throws  Exception{
        ExtentReports extentReports = new ExtentReports();
        //File file = new File("index.html");
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("C:\\Users\\karth\\Documents");
        extentReports.attachReporter(sparkReporter);

        extentReports
                .createTest("Test 1")
                .log(Status.INFO, "info1")
                .log(Status.INFO, "info2")
                .log(Status.INFO, "info3")
                .log(Status.PASS, "pass")
                .log(Status.FAIL,  "fail")
                .log(Status.SKIP, "Skip")
                .log(Status.WARNING, "warning");
        extentReports.flush();

    }
}
