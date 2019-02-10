package com.project.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.apache.log4j.Logger;

import com.project.utilities.BasePage;

public class BasePage {
	public WebDriver driver = null;
	public Logger logger = Logger.getLogger(BasePage.class);      //log4j output logging
		
		public BasePage(WebDriver driver) 
		{
		 this.driver=driver; //takes the current instance of the class	
		}

	  public void verifyElementPresent(WebElement ele)
	  {
		  WebDriverWait w= new WebDriverWait(driver, 60);
		  try
		  {
			  w.until(ExpectedConditions.visibilityOf(ele));
			  Reporter.log(ele +"found");
			  logger.info(ele +" found");            //log4j output logging   //logger.info("Pass, Title matched");
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
			  Reporter.log(ele+"not found");
			  logger.debug("This is a debug message"+ ele +"not found");       //log4j output logging    //logger.error("Fail, Title mismatch");
			  
		  }
		  
	  }
}
