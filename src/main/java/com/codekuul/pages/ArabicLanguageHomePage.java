package com.codekuul.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class ArabicLanguageHomePage {
	UiKeywords keyword = UiKeywords.getInstance();
	public ArabicLanguageHomePage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}
	
	@FindBy(css="li[class='nav-item active'] a[class='nav-link'] span")
	private WebElement myAccountArabicText;
	
	

	public String getMyAccountArabicText() {
		return keyword.getErrMessageText(myAccountArabicText);
		
	}
	
	

}
