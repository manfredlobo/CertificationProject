package com.project.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.project.utilities.BaseTest;

public class ITest implements ITestListener 
{
	@Override
	public void onTestStart(ITestResult result) {

		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try
		{
			String name = result.getMethod().getMethodName();  //identify the method which is failed and capture the name
			//screenshot	
			EventFiringWebDriver event = new EventFiringWebDriver(BaseTest.driver);
			File src =event.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(".\\Screenshots\\"+name+".png"));
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		
		
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
