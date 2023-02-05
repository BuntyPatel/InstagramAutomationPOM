package com.ig.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ig.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	// Page Factory - OR (Object Repo):
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(linkText = "Sign up")
	WebElement signUpBtn;
	
	@FindBy(xpath = "//i[@data-visualcompletion='css-img']")
	WebElement igLogo;
	
	
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this); 
	}
	
	//Actions:
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateIGImage() {
		return igLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
}
