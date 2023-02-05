package com.ig.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ig.qa.base.TestBase;
import com.ig.qa.pages.HomePage;
import com.ig.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();				
	}
	
	@Test(priority=1)
	public void loginPageTitlePage() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Instagram","Login Page title not matched");
	}
	
	@Test(priority=2)
	public void igLogoImageTest() {
	boolean flag = loginPage.validateIGImage();
	Assert.assertTrue(flag);	
	}
	
	@Test(priority=3)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
	}
	
}
