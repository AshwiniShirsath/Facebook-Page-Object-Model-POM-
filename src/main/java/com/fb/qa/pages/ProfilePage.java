/*This is Menu page of Facebook*/

package com.fb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.fb.qa.base.TestBase;

public class ProfilePage extends TestBase {
	public static WebElement posts;
	public static WebElement about;
	public static WebElement more;
	public static WebElement friends;
	public static WebElement photos;
	public static WebElement videos;
	public static WebElement check_In;
	public static WebElement addBio;
	public static WebElement editDetails;
	public static WebElement addHobbies;

	public String verifyPostsField() {
		posts = driver.findElement(By.xpath(
				"//span[starts-with(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y d1w2l3lo')][1]"));
		return posts.getAttribute("class");
	}

	public String verifyAboutField() {
		about = driver.findElement(By.xpath(
				"(//div[@class='qmqpeqxj e7u6y3za qwcclf47 nmlomj2f i85zmo3j frfouenu bonavkto djs4p424 r7bn319e bdao358l fxk3tzhb jcxyg2ei om3e55n1 a5wdgl2o h7q9eq3y iryl7rsq'])[2]"));
		return about.getAttribute("class");
	}

	public String verifyMoreField() {
		more = driver.findElement(By.xpath(
				"(//div[@class='qmqpeqxj e7u6y3za qwcclf47 nmlomj2f i85zmo3j frfouenu bonavkto djs4p424 r7bn319e bdao358l fxk3tzhb jcxyg2ei om3e55n1 a5wdgl2o h7q9eq3y iryl7rsq'])[1]"));
		return more.getAttribute("class");
	}

	public String verifyFriendsField() {
		friends = driver.findElement(By.xpath(
				"(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y')])[3]"));
		return friends.getAttribute("class");
	}

	public String verifyPhotosField() {
		photos = driver.findElement(By.xpath(
				"(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y')])[4]"));
		return photos.getAttribute("class");
	}

	public String verifyVideosField() {
		videos = driver.findElement(By.xpath(
				"(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y')])[5]"));
		return videos.getAttribute("class");
	}

	public String verifyCheck_InField() {
		check_In = driver.findElement(By.xpath(
				"(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y')])[6]"));
		return check_In.getAttribute("class");
	}

	public String verifyAddBioField() {
		addBio = driver.findElement(
				By.xpath("(//span[contains(@class,'b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken')])[5]"));
		return addBio.getAttribute("class");
	}

	public String verifyEditDetailsField() {
		editDetails = driver.findElement(
				By.xpath("(//span[contains(@class,'b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken')])[6]"));
		return editDetails.getAttribute("class");
	}

	public String verifyAddHobbiesDetailsField() {
		addHobbies = driver
				.findElement(By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken'])[13]"));
		return addHobbies.getAttribute("class");
	}
}