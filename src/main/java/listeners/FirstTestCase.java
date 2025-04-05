package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

    public class  FirstTestCase implements ITestListener {
        //This being to ITestListener and this will execute before starting the Test set/batch
        public void onStart(ITestContext arg){
            System.out.println("Start Test execution....."+ arg.getName());
        }
        //This being to ITestListener and this will finish after starting the Test set/batch
        public void onFinish(ITestContext arg){
            System.out.println("Finish Test execution....."+ arg.getName());
        }
        //This being to ITestListener and will execute before main test start i.e. @Test
        public void onTestStart(ITestResult arg0){
            System.out.println("Starts test....."+ arg0.getName());
        }
        //This being to ITestListener and will execute when a test is skipped
        public void onTestSkipped(ITestResult arg0){
            System.out.println("Skipped test....."+ arg0.getName());
        }
        //This being to ITestListener and will execute when a test is passed
        public void onTestSuccess(ITestResult arg0){
            System.out.println("Passed test....."+ arg0.getName());
        }
        //This being to ITestListener and will execute when a test is failed
        public void onTestFailure(ITestResult arg0){
            System.out.println("Failed test....."+ arg0.getName());
        }
    }


