package com.codekuul.uitest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codekuul.config.BaseClass;
import com.codekuul.keywords.UiKeywords;
import com.codekuul.pages.HomePage;
import com.codekuul.pages.JoinMeetingPage;

public class HomePageTests extends BaseClass {
	UiKeywords keywords = new UiKeywords();

	@Test
	public void verifyTitleOfHomePage() {
		String expectedTitle = "IJmeet";
		Assert.assertEquals(keywords.getTitleOfPage(), expectedTitle);

	}

	@Test
	public void verifyIfUserRedirectsToJoinMeetingPage() {
		HomePage home = new HomePage();
		home.clickOnjoinMeetingTab();
		JoinMeetingPage joinMeeting = new JoinMeetingPage();
		String title = joinMeeting.getQuickJoinMeetingTitle();
		Assert.assertTrue(title.contains("Qui"));

	}
}
