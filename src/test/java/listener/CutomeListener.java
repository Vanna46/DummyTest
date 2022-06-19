package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CutomeListener implements ITestListener{
	
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
		System.out.println("Failed Test Case name is " + result.getName());
		System.out.println(result.getStatus());
		System.out.println("Reason of the error is " + result.getThrowable().getMessage());
		System.out.println(result.getAttribute("Car"));
		ExtentTest test = (ExtentTest) result.getAttribute("reporter");
		test.log(Status.FAIL, result.getThrowable().getMessage());
		
		
	}



	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed");
		
		
	}
	public void onTestSkipped(ITestResult result) {
		
		
	}
	
	
	
	
	
	
	
	
	
	public void onTestStart(ITestResult result) {
		
		
	}

	
	
	
	
	
	
	
	
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
