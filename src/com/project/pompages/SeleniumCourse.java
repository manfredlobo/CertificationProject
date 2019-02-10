package com.project.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.utilities.BasePage;


public class SeleniumCourse extends BasePage
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
			
			@FindBy(linkText="All Courses")
			private WebElement acourse;
			
			@FindBy(id="search-inp")
			private WebElement sinput;
			
			@FindBy(id="search-button-top")
			private WebElement searchicon;
			
			@FindBy(id="d_wishlist-icon-535")
			private WebElement wicon;
			
			@FindBy(xpath="(//span[@class='webinar-profile-name'])[1]")
			private WebElement pname;
			
			@FindBy(linkText="My Wishlist")
			private WebElement wlist;
			
			@FindBy(xpath="//i[@class='icon-logo edu-logo-style']")
			private WebElement erka;
			
			//initialization
			public SeleniumCourse(WebDriver driver) {
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
			
			public void clickcourse() {
				verifyElementPresent(acourse);
				acourse.click();
			}
			
			public void searchinp() {
				verifyElementPresent(sinput);
				sinput.sendKeys("Selenium 3.0");
			}
			
			public void searchicon() {
				verifyElementPresent(searchicon);
				searchicon.click();
				
			}
			
			public void wishlisticon() {
				verifyElementPresent(wicon);
				wicon.click();
			}
			
			public void prfname() {
				verifyElementPresent(pname);
				pname.click();
			}
			
			public void mywishlist() {
				verifyElementPresent(wlist);
				wlist.click();
			}
			
			public void edureka() {
				verifyElementPresent(erka);
				erka.click();
			}
				
}
