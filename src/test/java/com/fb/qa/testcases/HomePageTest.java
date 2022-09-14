package com.fb.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.pages.HomePage;

public class HomePageTest extends HomePage {

	public HomePageTest(){
        super();
    }

	@BeforeMethod
	public void setUp() {
		initialize();
		driver.get("https://www.facebook.com/?sk=welcome");
		driver.findElement(By.name("email")).sendKeys("ashwinishirsath1221@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("ashwini1221");
		driver.findElement(By.name("login")).click();
	}

	@Test(priority = 1)
	public void verifySearchFieldInHomePage() {
		String searchField = verifySearchFieldOfHomePage();
		Assert.assertEquals(searchField,
				"qi72231t s3jn8y49 k14qyeqv mz1h5j5e ztn2w49o s19c0p35 febi1ev9 pccvoycu c84hr6m5 losq46hw qgrdou9d nu7423ey n3hqoq4p r86q59rh b3qcqh3k fq87ekyn f92fqwvt cavyzvzu bbgqxxx1 j4vk3mq5 bdao358l pbevjfx6 tgm57n0e cgu29s5g i15ihif8 no6h3tfh k1z55t6l aeinzg8 ...");
	}

	@Test(priority = 2)
	public void verifyMenuFieldLogoInHomePage() {
		String logoOfMenu = verifyMenuFieldLogo();
		Assert.assertEquals(logoOfMenu,
				"qmqpeqxj e7u6y3za qwcclf47 nmlomj2f i85zmo3j frfouenu bonavkto djs4p424 r7bn319e bdao358l fxk3tzhb jcxyg2ei om3e55n1 a5wdgl2o h7q9eq3y iryl7rsq");
	}

	@Test(priority = 3)
	public void verifyMenuFieldForHomePage() {
		String menuField = verifyMenuField();
		Assert.assertEquals(menuField, "b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q");
	}

	@Test(priority = 4)
	public void verifyFriendsFieldOfHomePage() {
		String friendField = verifyFriendsField();
		Assert.assertEquals(friendField,
				"f7rl1if4 adechonz f6oz4yja dahkl6ri axrg9lpx rufpak1n qtovjlwq qbmienfq rfyhaz4c rdmi1yqr ohrdq8us nswx41af fawcizw8 l1aqi3e3 sdu1flz4");
	}

	@Test(priority = 5)
	public void verifyGroupsFieldOfPage() {
		String groupsField = verifyGroupsField();
		Assert.assertEquals(groupsField, "b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q");
	}

	@Test(priority = 6)
	public void verifyShortcutFieldLogoOfPage() {
		String LogoOfShorcut = verifyShorcutFieldField();
		Assert.assertEquals(LogoOfShorcut, "gneimcpu b0w474w7");
	}

	@Test(priority = 7)
	public void verifyShortcutFieldOfPage() {
		String shortcutField = verifyShortcutField();
		Assert.assertEquals(shortcutField, "b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q");
	}

	@Test(priority = 8)
	public void verifyCreateGroupsFieldOfPage() {
		String createGroupField = verifymessengerField();
		Assert.assertEquals(createGroupField, "b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q");
	}

	@Test(priority = 9)
	public void verifyPlusIconOfHomePage() {
		String plusIcon = verifyPlusIconField();
		Assert.assertEquals(plusIcon, "gneimcpu b0w474w7");
	}

	@Test(priority = 10)
	public void verifyFindFriendsLinkOfHomePage() {
		String linkOfFindFriends = verifyFindFriendsLink();
		Assert.assertEquals(linkOfFindFriends, "b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken");
	}

	@AfterTest
	public void closeBrowsers() {
		driver.quit();
	}
}
