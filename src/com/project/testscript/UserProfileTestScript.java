package com.project.testscript;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.project.pompages.UserProfile;
import com.project.utilities.BaseTest;
import com.project.utilities.ReadExcel;

public class UserProfileTestScript extends BaseTest
{

	UserProfile upfile = null;
	
	@Test
	
	public void updateuserprofile() throws InterruptedException, IOException{
		try {
			String[][] credentials = ReadExcel.getData(filePath, "User_Login");
			for (int i = 1; i < credentials.length; i++) {
				String email = credentials[i][0];
				String password = credentials[i][1];
				upfile = new UserProfile(driver);
				upfile.clickonLogin();
				Thread.sleep(500);
				upfile.enterEmail(email);
				Thread.sleep(500);
				upfile.enterPassword(password);
				upfile.clicktoStart();
				upfile.prfname();
				Thread.sleep(500);
				upfile.gotoprofile();
				Thread.sleep(500);
				upfile.prfedit();
				Thread.sleep(900);
				upfile.compname();
				Thread.sleep(2800);
				upfile.myskill();
				Thread.sleep(5500);
				wait = new WebDriverWait(driver, 50);
				EventFiringWebDriver event = new EventFiringWebDriver(BaseTest.driver);
				File src =event.getScreenshotAs(OutputType.FILE);
				String userprofile = null;
				FileUtils.copyFile(src, new File(".\\Screenshots\\"+userprofile+".png"));
				driver.quit();
				//upfile.clickback();
				//upfile.entermycity();
				//wait = new WebDriverWait(driver, 50);
				//Thread.sleep(2000);
				//upfile.clicknnext();
				//upfile.savedetails();
				//Thread.sleep(1800);
				
				
}
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
}
}
