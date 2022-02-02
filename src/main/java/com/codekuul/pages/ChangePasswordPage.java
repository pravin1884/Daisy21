package com.codekuul.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class ChangePasswordPage {
	UiKeywords keyword = UiKeywords.getInstance();
	
	public ChangePasswordPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}
	
	@FindBy(css="h3[class='card-label font-weight-bolder text-dark mb-0 change-pass-three-text-22']")
	public WebElement changePasswordText;
	
	public String getchangePasswordTest() {
		return keyword.getAttributeValue(changePasswordText);

	}

}
