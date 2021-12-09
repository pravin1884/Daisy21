package com.codekuul.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class WebinarPage {
	UiKeywords keyword = UiKeywords.getInstance();
	
	public WebinarPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}
	
	@FindBy(css="[id='upcoming-webinars']  div[class='row'] div div button")
	public WebElement webinarText;
	
	public String getWebinarText() {
		return keyword.getAttributeValue(webinarText);
	}

}
