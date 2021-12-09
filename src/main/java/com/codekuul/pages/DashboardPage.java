package com.codekuul.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class DashboardPage {
	UiKeywords keyword = UiKeywords.getInstance();

	public DashboardPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}

	@FindBy(xpath = "//li[@class='nav-item'][1]/a[1]/span[1]")
	public WebElement myAccountTab;

	@FindBy(xpath = "//li[@class='nav-item'][2]/a[1]/span[1]")
	public WebElement inviteTab;

	@FindBy(xpath = "//li[@class='nav-item'][3]/a[1]/span[1]")
	public WebElement applicationTab;
	
	@FindBy(css = "input[id='upcoming_meeting_search_key']")
	public WebElement meetingIdSearchKey;
	
	public void clickOnMyAccountTab() {
		keyword.click(myAccountTab);

	}
	
	

}
