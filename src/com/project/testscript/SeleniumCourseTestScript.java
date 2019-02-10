package com.project.testscript;


import org.testng.annotations.Test;

import com.project.pompages.SeleniumCourse;
import com.project.utilities.BaseTest;
import com.project.utilities.ReadExcel;

public class SeleniumCourseTestScript extends BaseTest
{

	SeleniumCourse scourse =null;
	
	@Test
	
	public void selcourse() throws InterruptedException{
		
		try {
			String[][] credentials = ReadExcel.getData(filePath, "User_Login");
			for (int i = 1; i < credentials.length; i++) {
				String email = credentials[i][0];
				String password = credentials[i][1]; 
				scourse = new SeleniumCourse(driver);
				scourse.clickonLogin();
				Thread.sleep(800);
				scourse.enterEmail(email);
				Thread.sleep(800);
				scourse.enterPassword(password);
				Thread.sleep(800);
				scourse.clicktoStart();
				Thread.sleep(800);
				scourse.courses();
				Thread.sleep(800);
				scourse.clickcourse();
				Thread.sleep(800);
				scourse.searchinp();
				Thread.sleep(500);
				scourse.searchicon();
				Thread.sleep(500);
				scourse.wishlisticon();
				Thread.sleep(500);
				scourse.prfname();
				Thread.sleep(500);
				scourse.mywishlist();
				Thread.sleep(500);
				scourse.edureka();
				
				
}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}
}
