package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class commond implements ITestListener{

	
	public void onTestStart(ITestResult result) {
    System.out.println("listen test start");
	}
	public void onTestSuccess(ITestResult result) {
    System.out.println("listen test Success");
	}

	public void onTestFailure(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}
}

