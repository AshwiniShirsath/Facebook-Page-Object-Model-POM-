/*This is Login page of Facebook*/
package com.fb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class LoginPage extends TestBase {
	public static WebElement pass1;
	public static WebElement createAcBtn1;
	public static WebElement createAcBtn2;
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name="pass")
	WebElement pass;
	
	@FindBy(xpath="//button[contains(text(), 'Log In')]")
	WebElement loginBtn;

	@FindBy(xpath="//button[contains(@linkText(), 'Create New Account')]")
	WebElement createAccountBtn;

	@FindBy(xpath = "//img[contains(@class, 'fb_logo _8ilh img')]")
	WebElement fbLogo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	public boolean validateFbLogo(){
		return fbLogo.isDisplayed();
	}

	public HomePage login(String emailId, String password) {
		email.sendKeys(emailId);
		pass.sendKeys(password);
		loginBtn.click();
		
		return new HomePage();
	}

//	public void createAccount(){
//		createAccountBtn;
//	}

	public String verifyUserId1TextField() {
		return email.getAttribute("name");
	}

	public String verifyUserId2TextField() {
		return email.getAttribute("id");
	}

	public String verifyPass1TextField() {
		pass1 = driver.findElement(By.id("pass"));
		return pass1.getAttribute("name");
	}

	public String verifyPass2TextField() {
		return pass.getAttribute("id");
	}

	public String verifyCreateAccountBtn() {
		createAcBtn1 = driver.findElement(By.linkText("Create New Account"));
		return createAcBtn1.getAttribute("class");
	}

	public boolean verifyCreateAccountBtnIsEnabled() {
		createAcBtn2 = driver.findElement(By.linkText("Create New Account"));
		return createAcBtn2.isEnabled();
	}
}
