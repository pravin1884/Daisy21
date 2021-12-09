package com.codekuul.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class ResetPasswordPage {
	UiKeywords keyword = UiKeywords.getInstance();

	public ResetPasswordPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}

	@FindBy(xpath = "//h4[contains(text(),' Reset Password ')]")
	public WebElement resetPasswordText;
	
	public String getResetPasswordText() {
		return keyword.getErrMessageText(resetPasswordText);
	}
	

}
