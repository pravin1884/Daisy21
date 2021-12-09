package com.codekuul.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class SignInPage {
	UiKeywords keyword = UiKeywords.getInstance();

	public SignInPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}

	@FindBy(xpath = "//h4[contains(text(),' Sign In ')]")
	public WebElement signInTitle;

	@FindBy(css = "#email")
	public WebElement emailAddField;

	@FindBy(css = "#password")
	public WebElement passwordField;

	@FindBy(css = "button[type='submit']")
	public WebElement signInButton;

	@FindBy(css = "#remember")
	public WebElement rememberMeCheckBox;

	@FindBy(css = ".auth-link.text-black")
	public WebElement forgotYourPasswordLink;

	@FindBy(css = ".sign-up-accounthave")
	public WebElement signUpLink;
	
	@FindBy(css = "#icon-change")
	public WebElement viewPassword;
	

	public String getSignInPageTitle() {
		return signInTitle.getText();

	}

	public void enterEmailAddress(String email) {
		keyword.enterText(emailAddField, email);

	}

	public void enterPassword(String password) {
		keyword.enterText(passwordField, password);

	}

	public void clickSignInButton() {
		keyword.click(signInButton);

	}

	public void clickRememberMeCheckBox() {
		keyword.click(rememberMeCheckBox);

	}

	public void clickOnForgotPasswordLink() {
		keyword.click(forgotYourPasswordLink);

	}
	public boolean isSelectedRememberMeCheckBox() {
		return rememberMeCheckBox.isSelected();

	}
	
	public void clickOnSignUpLink() {
		keyword.click(signUpLink);

	}
	
	public void clickOnViewPassword() {
		keyword.click(viewPassword);

	}
	
	

}
