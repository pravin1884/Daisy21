package com.codekuul.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class JoinMeetingPage {
	  UiKeywords keyword = new UiKeywords();
	  public JoinMeetingPage() {
		  PageFactory.initElements(keyword.getDriver(), this);
	  }
	  @FindBy(css="div.joinmeeting")
      public WebElement quickJoinMeetingTitle;

	public String getQuickJoinMeetingTitle() {
		return quickJoinMeetingTitle.getText();
		
	}
}
