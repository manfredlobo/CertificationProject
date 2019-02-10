package com.project.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.project.utilities.AutoConst;

public abstract class BaseTest implements AutoConst 
{

	public static WebDriver driver = null;	
	public static WebDriverWait wait = null;
	
	@Parameters({"browser"})
	@BeforeMethod
	public void openApp(String browser)
	{
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		
		Reporter.log("Google Chrome Web Browser",true);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		driver.get("https://www.edureka.co/");
		
		
	}
	 
	//@Parameters({"browser"})
		//@AfterMethod
		//public void closeApp()
		//{
			//driver.quit();
		//}
}
