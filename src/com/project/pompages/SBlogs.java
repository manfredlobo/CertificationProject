package com.project.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.utilities.BasePage;

public class SBlogs extends BasePage
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
		
		@FindBy(id="dropdownMenu4")
		private WebElement blg;
		
		@FindBy(linkText="Blog")                    //(//a[@data-button-name='Blog' and @class='giTrackElementHeader'])[2]
		private WebElement bllg;
		
		@FindBy(id="search-inp")
		private WebElement search;
		
		@FindBy(xpath="(//i[@class='icon-search search_ico submit-ico-button search-button-top'])[1]")
		private WebElement searchicon;
		
		@FindBy(linkText="Interview Questions")
		private WebElement question;
		
		//initialization
				public SBlogs(WebDriver driver) {
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
				
				public void navigateblog() {
					verifyElementPresent(blg);
					blg.click();
				}
				
				public void gotoblog() {
					verifyElementPresent(bllg);
					bllg.click();
				}
				
				public void searchtext() {
					verifyElementPresent(search);
					search.sendKeys("Selenium");
				}
				
				public void clickicon() {
					verifyElementPresent(searchicon);
					searchicon.click();
				}
				
				public void explorequestion() {
					verifyElementPresent(question);
					question.click();
				}
				
}
