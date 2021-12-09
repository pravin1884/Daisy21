package com.codekuul.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class HostMeetingPage {
	UiKeywords keyword = UiKeywords.getInstance();

	public HostMeetingPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}

	@FindBy(css = "h1.set-sharingmade")
	public WebElement screenSharingTitle;
	
	@FindBy(css="div[class='set-sharingmade_cta-wrapper'] a")
	public WebElement tryItButton;
	
	public String getScreenSharingTitle() {
		return screenSharingTitle.getText();
	}
	
	public void clickOnTryItButton() {
		keyword.click(tryItButton);
	}

}
