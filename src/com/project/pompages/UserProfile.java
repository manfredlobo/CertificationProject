package com.project.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.utilities.BasePage;


public class UserProfile extends BasePage
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
	
	@FindBy(xpath="(//span[@class='webinar-profile-name'])[1]")
	private WebElement pname;
	
	@FindBy(linkText="My Profile")
	private WebElement mpf;
	
	@FindBy(xpath="(//a[@class='profile-edit-icon'])[2]")
	private WebElement prfeicon;
	
	@FindBy(name="companyName")
	private WebElement cname;
	
	@FindBy(name="userSkill")
	private WebElement skill;
	
	//@FindBy(xpath="(//i[@class='icon-Arrow-Left'])[1]")
	//private WebElement goback;
	
	//@FindBy(xpath="//input[@name='currentCity' and @placeholder='Enter your city']")
	//private WebElement mycity;
	
	//@FindBy(xpath="//button[@type='submit' and text()='Next']")
	//private WebElement nnxt;
	
	//@FindBy(xpath="(//button[@type='submit' and text()='Save'])[1]")
	//private WebElement savedetail;
	
	//initialization
	public UserProfile(WebDriver driver) {
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
	
	public void prfname() {
		verifyElementPresent(pname);
		pname.click();
	}
	
	public void gotoprofile() {
		verifyElementPresent(mpf);
		mpf.click();
	}
	
	public void prfedit() {
		verifyElementPresent(prfeicon);
		prfeicon.click();
	}
	
	public void compname() {
		try {
			verifyElementPresent(cname);
			Thread.sleep(500);
			cname.clear();
			cname.sendKeys("GESS PVT LTD");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void myskill() {
		try {
			verifyElementPresent(skill);
			skill.clear();
			skill.sendKeys("Software Testing");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	//public void clickback() {
		//verifyElementPresent(goback);
		//goback.click();
	//}
	
	//public void entermycity() {
		//verifyElementPresent(mycity);
		//mycity.clear();
		//mycity.sendKeys("Mangalore");
	//}
	
	//public void clicknnext() {
		//verifyElementPresent(nnxt);
		//nnxt.click();
	//}
	
	//public void savedetails() {
		//verifyElementPresent(savedetail);
		//savedetail.click();
	//}
	
}
