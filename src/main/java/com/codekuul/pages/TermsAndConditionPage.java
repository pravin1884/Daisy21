package com.codekuul.pages;

import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class TermsAndConditionPage {
	UiKeywords keyword = UiKeywords.getInstance();

	public TermsAndConditionPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}

	public String getTermsAndConditionPageUrl() {
		return keyword.getDriver().getCurrentUrl();

	}

}
