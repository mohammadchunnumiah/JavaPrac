/**
 * 
 */
package com.ebayLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import mavPageObjectFW.ebayLoginPage;

/**
 * @author Miah
 *
 */
public class verifyEbayLoginn {

	@Test
	public void verifyValidLogin() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "E:\\Develop\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://ebay.com");
		
		ebayLoginPage login=new ebayLoginPage(driver);
		
		login.clickOnSignin();
		login.clickOnStaySingIn();
		login.typeUserName();
		login.typePassword();
		login.clickOnSigninButton();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
