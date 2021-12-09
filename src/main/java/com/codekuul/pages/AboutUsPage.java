package com.codekuul.pages;

import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class AboutUsPage {
	UiKeywords keyword = UiKeywords.getInstance();

	public AboutUsPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}

	public String getAboutUsPageUrl() {
		return keyword.getDriver().getCurrentUrl();

	}

}
