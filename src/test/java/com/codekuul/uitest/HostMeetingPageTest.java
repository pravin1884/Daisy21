package com.codekuul.uitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codekuul.config.BaseClass;
import com.codekuul.keywords.UiKeywords;
import com.codekuul.pages.HomePage;
import com.codekuul.pages.HostMeetingPage;
import com.codekuul.pages.SignUpPage;

public class HostMeetingPageTest extends BaseClass {
	UiKeywords keyword = UiKeywords.getInstance();
	
	@Test
	public void validateTryItLinkRedirectToSignUpPage() {
		HomePage home = new HomePage();
		SignUpPage signup = new SignUpPage();
		HostMeetingPage host = new HostMeetingPage();
		home.clickOnHostMeetingTab();
		host.clickOnTryItButton();
		String text = signup.getSignUppageTitle();
		Assert.assertEquals(text,"Sign Up");
		

	}
     
}
