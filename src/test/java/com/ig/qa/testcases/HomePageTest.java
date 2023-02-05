package com.ig.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ig.qa.base.TestBase;
import com.ig.qa.pages.HomePage;
import com.ig.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;

	public HomePageTest() {
		super();
	}
	//test cases should be separated -- indepent with eachother
	//Before each test case -- lauch the browser and login
	//@test -- execute tets case
	//after each test case -- close the browser
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();	
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Instagram", "Home Page title not matched"); // Only printed if assersion get fail.
	}
	
	@Test (priority = 2)
	public void verifyUserNameTest() {
		homePage.turnOffSaveInfoTab();
		homePage.turnOffNotificationTab();
		Assert.assertTrue(homePage.verifyCorrectUserName());		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
