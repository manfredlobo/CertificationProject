package com.project.testscript;

import java.util.Set;

import org.testng.annotations.Test;


import com.project.pompages.SBlogs;

import com.project.utilities.BaseTest;
import com.project.utilities.ReadExcel;

// This class contains all the test scripts pertaining to Selenium Blogs.	

public class SBlogsTestScript extends BaseTest
{

	SBlogs blog=null;
	
	@Test
	
	public void sblogs() throws InterruptedException {
		try {
			String parent=driver.getWindowHandle();
			String[][] credentials = ReadExcel.getData(filePath, "User_Login");
			
			for (int i = 1; i < credentials.length; i++) {
				String email = credentials[i][0];
				String password = credentials[i][1];
				blog=new SBlogs(driver);
			    blog.clickonLogin();
			    Thread.sleep(800);
			    blog.enterEmail(email);
			    Thread.sleep(700);
			    blog.enterPassword(password);
			    Thread.sleep(700);
			    blog.clicktoStart();
			    Thread.sleep(2800);
			    blog.navigateblog();
			    Thread.sleep(2800);
			    blog.gotoblog();
			    Thread.sleep(2800);
			    
			  //to switch to new window
				Set<String> allwindows = driver.getWindowHandles();
				int count = allwindows.size();
				System.out.println("The total count of windows is" +count);
				for(String child:allwindows)
				{
					if(!parent.equalsIgnoreCase(child))
					{
						driver.switchTo().window(child); 
					}
				}
			
				Thread.sleep(2800);
				blog.searchtext();
				Thread.sleep(2800);
				blog.clickicon();
				Thread.sleep(2800);
				blog.explorequestion();
				Thread.sleep(2800);
				driver.close();
				
				
				
}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
}


}
