package com.codekuul.pages;

import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class SupportPage {
	UiKeywords keyword = UiKeywords.getInstance();

	public SupportPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}
	
	public  String getSupportPageUrl() {
		return keyword.getDriver().getCurrentUrl();

	}
}
