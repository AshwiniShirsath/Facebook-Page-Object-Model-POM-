/*This is Home page of Facebook*/

package com.fb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.fb.qa.base.TestBase;

public class HomePage extends TestBase {
	public static WebElement search;
	public static WebElement logo;
	public static WebElement menu;
	public static WebElement friends;
	public static WebElement groups;
	public static WebElement shortCutLogo;
	public static WebElement shortcutField;
	public static WebElement messenger;
	public static WebElement iconOfPlus;
	public static WebElement findFriendsLink;

	public String verifySearchFieldOfHomePage() {
		search = driver.findElement(By.xpath(
				"//input[contains(@class,'qi72231t s3jn8y49 k14qyeqv mz1h5j5e ztn2w49o s19c0p35 febi1ev9 pccvoycu c84hr6m5 losq46hw qgrdou9d nu7423ey n3hqoq4p r86q59rh b3qcqh3k fq87ekyn f92fqwvt cavyzvzu bbgqxxx1 j4vk3mq5 bdao358l pbevjfx6 tgm57n0e cgu29s5g i15ihif8 no6h3tfh k1z55t6l aeinzg81 icdlwmnq om3e55n1 rh5b4hnh gy87pps4 b0eko5f3 r9fxt90l nq2b4knc jrp0dh92 m8m1d84o him0ws1g s0u2i99n oe2youzz mizpstq0 adj1mh9s h7nzrzxv gl9yfm1p ap9gnrge k4z0jo6w')]"));
		return search.getAttribute("class");
	}

	public String verifyMenuFieldLogo() {
		logo = driver.findElement(By.xpath(
				"(//div[@class='qmqpeqxj e7u6y3za qwcclf47 nmlomj2f i85zmo3j frfouenu bonavkto djs4p424 r7bn319e bdao358l fxk3tzhb jcxyg2ei om3e55n1 a5wdgl2o h7q9eq3y iryl7rsq'])[1]"));
		return logo.getAttribute("class");
	}

	public String verifyMenuField() {
		menu = driver.findElement(
				By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q'])"));
		return menu.getAttribute("class");
	}

	public String verifyFriendsField() {
		friends = driver.findElement(By.xpath("(//span)[5]"));
		return friends.getAttribute("class");
	}

	public String verifyGroupsField() {
		groups = driver.findElement(
				By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q'])[2]"));
		return groups.getAttribute("class");
	}

	public String verifyShorcutFieldField() {
		shortCutLogo = driver.findElement(By.xpath("(//i[@class='gneimcpu b0w474w7'])[3]"));
		return shortCutLogo.getAttribute("class");
	}

	public String verifyShortcutField() {
		shortcutField = driver.findElement(
				By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q'])[3]"));
		return shortcutField.getAttribute("class");
	}

	public String verifymessengerField() {
		messenger = driver.findElement(
				By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q'])[8]"));
		return messenger.getAttribute("class");
	}

	public String verifyPlusIconField() {
		iconOfPlus = driver.findElement(By.xpath("(//i[@class='gneimcpu b0w474w7'])[3]"));
		return iconOfPlus.getAttribute("class");
	}

	public String verifyFindFriendsLink() {
		findFriendsLink = driver
				.findElement(By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken'])[13]"));
		return findFriendsLink.getAttribute("class");
	}
}
