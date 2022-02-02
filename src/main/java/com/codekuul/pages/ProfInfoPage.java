package com.codekuul.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class ProfInfoPage {
	UiKeywords keyword = UiKeywords.getInstance();
	public ProfInfoPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}
	
	@FindBy(css="h3[class='card-label user-personal-infor-st']")
	public WebElement personalInfoTitle;
	
	public String getPersonalInfoTitle() {
		return keyword.getAttributeValue(personalInfoTitle);
	}
	
	

}
