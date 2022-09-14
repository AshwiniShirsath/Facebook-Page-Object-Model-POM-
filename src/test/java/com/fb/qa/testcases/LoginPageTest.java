/*This is Login page test of Facebook*/

package com.fb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialize();
		loginPage = new LoginPage();
		
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,"Facebook – log in or sign up");
	}

	@Test(priority = 2)
	public  void validateFbImage() {
		boolean flag = loginPage.validateFbLogo();
		Assert.assertTrue(flag);
	}


	@Test(priority = 3)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}

	@Test(priority = 4)
	public void homePageTitleTest() {
		String title = loginPage.validateHomePageTitle();
		Assert.assertEquals(title,"Facebook – log in or sign up");
	}


	@Test(priority = 5)
	public void validateUsernameTextField(){
		String userName = loginPage.verifyUserId1TextField();
		Assert.assertEquals(userName,"email");
	}

	@Test(priority = 6)
	public void validateUsernameByIdTextField(){
		String userName = loginPage.verifyUserId2TextField();
		Assert.assertEquals(userName,"email");
	}

	@Test(priority = 7)
	public void validatePasswordField(){
		String logInPwd = loginPage.verifyPass1TextField();
		Assert.assertEquals(logInPwd,"pass");
	}

	@Test(priority = 8)
	public void validatePassword2Field(){
		String logInPwd = loginPage.verifyPass2TextField();
		Assert.assertEquals(logInPwd,"pass");
	}

	@Test(priority = 9)
	public void validateCreateAccBtnOfPage(){
		String createBtn = loginPage.verifyCreateAccountBtn();
		System.out.println(createBtn);
		Assert.assertEquals(createBtn,"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy");
	}

	@Test(priority = 10)
	public  void validateCreateAccountBtnEnabled() {
		boolean flag = loginPage.verifyCreateAccountBtnIsEnabled();
		Assert.assertTrue(flag);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}