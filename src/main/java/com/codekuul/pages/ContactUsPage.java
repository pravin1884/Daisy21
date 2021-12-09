package com.codekuul.pages;

import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class ContactUsPage {
	UiKeywords keyword = UiKeywords.getInstance();

	public ContactUsPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}
	
	public  String getContactUsPageUrl() {
		return keyword.getDriver().getCurrentUrl();

	}
}
