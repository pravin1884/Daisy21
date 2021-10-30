package com.codekuul.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class HomePage {
	  UiKeywords keyword = new UiKeywords();
	  public HomePage() {
		  PageFactory.initElements(keyword.getDriver(), this);
	  }

	 @FindBy(css="div#navbarContent li:nth-child(1)")
     public WebElement joinMeetingTab;

	public void clickOnjoinMeetingTab() {
		joinMeetingTab.click();
		
	}
     
}
