package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("The test case started: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("The test case success: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("The test case failed: "+result.getName());
	}

	@Override
	
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
