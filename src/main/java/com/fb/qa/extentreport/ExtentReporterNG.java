/*This is Extent report of Facebook*/

package com.fb.qa.extentreport;


import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExtentReporterNG {
	static ExtentTest test;
	static ExtentReports report;
	static WebDriver driver;

	@BeforeClass
	public static void startTest()
	{
		report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
	}
	@Test
	public void extentReportsDemo()
	{System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		if(driver.getTitle().equals("Google"))
		{
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
			test.log(LogStatus.FAIL, "Test Failed");
		}
	}

	@Test
	public void extentReportsDemo2()
	{System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		if(driver.getTitle().equals("Facebook – log in or sign up"))
		{
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
			test.log(LogStatus.FAIL, "Test Failed");
		}
	}
	@AfterClass
	public static void endTest()
	{
		report.endTest(test);
//		report.flush();
		driver.quit();

	}
}