package com.codekuul.uitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codekuul.config.Application;
import com.codekuul.config.BaseClass;
import com.codekuul.keywords.UiKeywords;
import com.codekuul.pages.HomePage;
import com.codekuul.pages.ResetPasswordPage;
import com.codekuul.pages.SignInPage;
import com.codekuul.pages.SignUpPage;

public class SignInPageTests extends BaseClass {
	UiKeywords keyword = UiKeywords.getInstance();

	@Test
	public void validateSignInWithValidInput() {
		HomePage home = new HomePage();
		SignInPage signIn = new SignInPage();
		Application app = new Application();
		home.clickOnSignInTab();
		signIn.enterEmailAddress(app.getQaEmailId());
		signIn.enterPassword(app.getPassword());
		signIn.clickSignInButton();
		Assert.assertEquals(keyword.getCurrentUrl(), "https://ijmeet.com/dashboard");

	}

	@Test
	public void validateSignInWithBlankEmail() {
		HomePage home = new HomePage();
		SignInPage signIn = new SignInPage();
		Application app = new Application();
		home.clickOnSignInTab();
		signIn.enterPassword(app.getPassword());
		signIn.clickSignInButton();
		Assert.assertEquals(keyword.getCurrentUrl(), "https://ijmeet.com/dashboard");
	}

	@Test
	public void validateForgotPasswordLink() {
		HomePage home = new HomePage();
		SignInPage signIn = new SignInPage();
		Application app = new Application();
		ResetPasswordPage reset = new ResetPasswordPage();
		home.clickOnSignInTab();
		signIn.clickOnForgotPasswordLink();
		Assert.assertEquals(reset.getResetPasswordText(), "Reset Password");
	}

	@Test
	public void validateRememberMeCheckBox() {
		HomePage home = new HomePage();
		SignInPage signIn = new SignInPage();
		home.clickOnSignInTab();
		signIn.clickRememberMeCheckBox();
		Assert.assertTrue(signIn.isSelectedRememberMeCheckBox());
	}

	@Test
	public void validateSignUpLink() {
		HomePage home = new HomePage();
		SignInPage signIn = new SignInPage();
		SignUpPage signup = new SignUpPage();
		home.clickOnSignInTab();
		signIn.clickOnSignUpLink();
		Assert.assertEquals(signup.getSignUppageTitle(), "Sign Up");
	}

	@Test
	public void validateViewPasswordButton() {
		HomePage home = new HomePage();
		SignInPage signIn = new SignInPage();
		Application app = new Application();
		home.clickOnSignInTab();
		signIn.enterPassword(app.getPassword());
		signIn.clickOnViewPassword();

	}

}
