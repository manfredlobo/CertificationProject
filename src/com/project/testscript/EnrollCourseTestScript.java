package com.project.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.project.utilities.ReadExcel;
import com.project.pompages.EnrollCourse;
import com.project.utilities.BaseTest;

public class EnrollCourseTestScript extends BaseTest
{

	EnrollCourse encourse=null;
	
	@Test
	public void enrollcourse() throws InterruptedException
	{
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String[][] credentials = ReadExcel.getData(filePath, "User_Login");
			
				for (int i = 1; i < credentials.length; i++) {
					String email = credentials[i][0];
					String password = credentials[i][1];
					encourse=new EnrollCourse(driver);
					encourse.clickonLogin();
					encourse.enterEmail(email);
					Thread.sleep(700);
					encourse.enterPassword(password);
					Thread.sleep(700);
					encourse.clicktoStart();
					encourse.courses();
					Thread.sleep(700);
					encourse.mclassroom();
					js.executeScript("window.scrollBy(0,400)");
					EventFiringWebDriver event = new EventFiringWebDriver(BaseTest.driver);
					File src =event.getScreenshotAs(OutputType.FILE);
					String ercourse = null;
					FileUtils.copyFile(src, new File(".\\Screenshots\\"+ercourse+".png"));
					Thread.sleep(700);
					encourse.mname();
					encourse.lgout();
					
}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
}
}
