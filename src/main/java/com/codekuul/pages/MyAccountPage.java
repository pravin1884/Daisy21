package com.codekuul.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class MyAccountPage {
	UiKeywords keyword = UiKeywords.getInstance();

	public MyAccountPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}

	@FindBy(css = "div[class='mtab-add'] button:nth-child(1)")
	public WebElement upCommingMeetingTitle;

	@FindBy(css = "div[class='mtab-add'] button:nth-child(1)+button")
	public WebElement previousMeetingsTitle;

	@FindBy(css = "div[class='mtab-add'] button:last-child")
	public WebElement scheduleMeetingButton;

	@FindBy(css = "input[name='upcoming_meeting_search_key']")
	public WebElement meetingIdSearchBox;

	@FindBy(css = "input[id='upcoming_meeting_start_date']")
	public WebElement fromDatecalendar;

	@FindBy(css = "div[id='datepicker-popup2']")
	public WebElement toDateCalendar;

	@FindBy(css = "div[class='col-xl-2 col-lg-3']>a[class='btn btn-default mbtn search_value_upcoming_meeting']")
	public WebElement searchButton;

	@FindBy(css = "button[class='btn btn-warning btn-hover-text-primary schedule-new-meet-btn ']")
	public WebElement bottomScheduleMeetingButton;

	@FindBy(css = "#webinartab>a>span")
	public WebElement webinarLink;

	@FindBy(css = "#profiletab>a[class='btn btn-default']>span[class='navi-text font-size-lg']")
	public WebElement profileInformationLink;

	@FindBy(css = "div[class='card-body px-md-3 pt-4']>div+div div:nth-last-child(2)")
	public WebElement changePasswordLink;

	@FindBy(css = "div[class='card-body px-md-3 pt-4']>div+div div:nth-last-child(1)")
	public WebElement logOutLink;

	@FindBy(xpath = "//span[contains(text(),'Home')]")
	public WebElement homePageLink;

	@FindBy(xpath = "//ul[@class='custom-navbar-cl-page-navigation-st bottom-navbar nav page-navigation ']//child::li[3]//child::a//span")
	public WebElement inviteLink;

	@FindBy(xpath = "//li[@class='nav-item']/child::a/child::span[contains(text(),'Application')]")
	public WebElement applicationLink;

	@FindBy(css = "span>.project-first-latter")
	public WebElement logOutButton;
	
	@FindBy(css = "a[href*='/logout']")
	public WebElement logOutInnerLink;
	
	@FindBy(css=".mirror-view-language")
	public WebElement languageChangeTab;

	public String getMyAccountPageUrl() {
		return keyword.getCurrentUrl();

	}

	public void clickOnHomePageTab() {
		keyword.click(homePageLink);

	}

	public void clickInvitePageTab() {
		keyword.click(inviteLink);

	}

	public void clickOnApplicationPageTab() {
		keyword.click(applicationLink);

	}

	public void clickOnPreviousMeetingsTitle() {
		keyword.click(previousMeetingsTitle);

	}

	public void clickOnScheduleMeetingButton() {
		keyword.click(scheduleMeetingButton);

	}

	public void searchFromMeetingId(String metId) {
		keyword.enterText(meetingIdSearchBox, metId);

	}

	public void enterFromDate(String fDate) {
		keyword.enterText(fromDatecalendar, fDate);

	}

	public void enterToDate(String tDate) {
		keyword.enterText(toDateCalendar, tDate);

	}
	
	public void clickOnSearchButton() {
		keyword.click(searchButton);

	}
	
	public void clickOnWebinarLink() {
		keyword.click(webinarLink);

	}
	
	public void clickOnProfileInfoLink() {
		keyword.click(profileInformationLink);

	}
	
	public void clickOnChangePasswordLink() {
		keyword.click(changePasswordLink);

	}
	
	public void clickOnLogOutLink() {
		keyword.click(logOutLink);

	}
	
	public void clickOnBottomScheduleMeetingButton() {
		keyword.click(bottomScheduleMeetingButton);

	}
	
	public void clickOnLogOut() {
		keyword.click(logOutButton);
		keyword.click(logOutInnerLink);

	}
	
	public void clickOnLanguageChangeTab() {
		keyword.click(languageChangeTab);
		

	}
	
	
	
	
	
	
}
