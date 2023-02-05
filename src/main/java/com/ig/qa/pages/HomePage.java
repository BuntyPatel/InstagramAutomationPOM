package com.ig.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ig.qa.base.TestBase;

public class HomePage extends TestBase {

	// after Logged in Notification handle
	@FindBy(xpath = "//button[contains(text(),'Not Now')]")
	WebElement notNowBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Not Now')]")
	WebElement notNowNotificationBtn;
	
	@FindBy(xpath = "//a[contains(text(),'the0ddb0x')]")
	WebElement userNameLabel;
	
	@FindBy(linkText = "Search")
	WebElement searchLink;
	
	@FindBy(linkText = "Explore")
	WebElement exploreLink;
	
	@FindBy(linkText = "Reels")
	WebElement reelsLink;
	
	@FindBy(linkText = "Messages")
	WebElement messagesLink;
	
	@FindBy(linkText = "Notifications")
	WebElement notificationsLink;
	
	@FindBy(linkText = "Create")
	WebElement createLink;
	
	@FindBy(linkText = "Profile")
	WebElement profileLink;
	
	@FindBy(linkText = "More")
	WebElement moreLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this); 
	}
	
	public void turnOffSaveInfoTab() {
		notNowBtn.click();
		System.out.println("Save Info Closed.");
	}
	
	public void turnOffNotificationTab() {
		notNowNotificationBtn.click();
		System.out.println("Notifications Closed.");
		//return new HomePage();
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}
	
	public SearchPage  clickOnSearchLink() {
		searchLink.click();
		return new SearchPage();
	}
	
	public ExplorePage clickOnExploreLink() {
		exploreLink.click();
		return new ExplorePage();
	}
	
	public ReelsPage clickOnReelsLink() {
		reelsLink.click();
		return new ReelsPage();
	}
		
	public MessagesPage clickOnMessagesLink() {
		messagesLink.click();
		return new MessagesPage();
	}
		
	public NotificationsPage clickOnNotificationsLink() {
		notificationsLink.click();
		return new NotificationsPage();
	}
	
	public CreatePage clickOnPCreateLink() {
		createLink.click();
		return new CreatePage();
	}
	
	public ProfilePage clickOnProfileLink() {
		profileLink.click();
		return new ProfilePage();
	}
}
