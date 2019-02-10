package com.project.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.utilities.BasePage;

public class EnrollCourse extends BasePage
{
	//declaration
	@FindBy(xpath="//a[@data-button-type='Static' and @data-button-name='Login']")
	private WebElement lgn;
	
	@FindBy(id="si_popup_email")
	private WebElement uid;
	
	@FindBy(id="si_popup_passwd")
	private WebElement pwd;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement start;
	
	@FindBy(id="dropdownMenu3")
	private WebElement crs;
	
	@FindBy(linkText="My Classroom")
	private WebElement mcroom;
	
	@FindBy(xpath="//span[@class='user_name']")
	private WebElement me;
	
	@FindBy(linkText="Log Out")
	private WebElement lout;
		
	//initialization
		public EnrollCourse(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
    
	//utilization

		public void clickonLogin() {
			verifyElementPresent(lgn);
			lgn.click();
		}
		
		public void enterEmail(String emailaddress ) {
			verifyElementPresent(uid);
			uid.sendKeys(emailaddress);
		}
		
		public void enterPassword(String password) {
			verifyElementPresent(pwd);
			pwd.sendKeys(password);
		}
		
		public void clicktoStart() {
			verifyElementPresent(start);
			start.click();
		}
		
		public void courses() {
			verifyElementPresent(crs);
			crs.click();
		}
		
		public void mclassroom() {
			verifyElementPresent(mcroom);
			mcroom.click();
		}
		
		public void mname() {
			verifyElementPresent(me);
			me.click();
		}
		
		public void lgout() {
			verifyElementPresent(lout);
			lout.click();
		}
			
}
