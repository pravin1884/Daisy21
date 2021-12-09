package com.codekuul.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class JoinMeetingPage {
	UiKeywords keyword = UiKeywords.getInstance();

	public JoinMeetingPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}

	@FindBy(css = "div.joinmeeting")
	public WebElement quickJoinMeetingTitle;

	@FindBy(css = "input#username")
	public WebElement userNameField;

	@FindBy(css = "#meetingid")
	public WebElement meetingIdField;

	@FindBy(css = "#before_start")
	public WebElement joinMeetingButton;

	@FindBy(xpath = "//p[contains(text(),'Please enter username')]")
	public WebElement userNameErrMessage;
	
	@FindBy(css="p.text-center.mb-0")
	public WebElement meetingIdErrMessage;

	public String getQuickJoinMeetingTitle() {
		return quickJoinMeetingTitle.getText();

	}

	public void enterUserName(String username) {
		keyword.enterText(userNameField, username);
	}

	public void enterMeetingId(String meetingId) {
		keyword.enterText(meetingIdField, meetingId);
	}

	public void clickJoinmeetingButton() {
		keyword.click(joinMeetingButton);
	}

	public String getUserErrMessage() {
          String text =  keyword.getErrMessageText(userNameErrMessage);
          return text;
		 
	}
	public String getMeetingIdErrMessage() {
        String text =  keyword.getErrMessageText(meetingIdErrMessage);
        return text;
		 
	}

}
