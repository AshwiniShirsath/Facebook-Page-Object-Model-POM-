package com.fb.qa.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "Test case started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "The name of the testcase passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + "The name of the testcase failed");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + "The name of the testcase skipped");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName() + "Test program start");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + "Test program stop");
	}
}
