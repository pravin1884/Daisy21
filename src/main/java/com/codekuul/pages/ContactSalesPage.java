package com.codekuul.pages;

import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class ContactSalesPage {
	UiKeywords keyword = UiKeywords.getInstance();

	public ContactSalesPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}
	
	public String getContactSalesPageUrl() {
		return keyword.getDriver().getCurrentUrl();

	}

}
