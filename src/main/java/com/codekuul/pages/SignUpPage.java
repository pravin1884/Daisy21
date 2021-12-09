package com.codekuul.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class SignUpPage {
	UiKeywords keyword = UiKeywords.getInstance();

	public SignUpPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}

	@FindBy(css = ".auth-form-transparent.text-left.px-3  h4")
	public WebElement signUppageTitle;

	public String getSignUppageTitle() {
		return signUppageTitle.getText();
	}
}
