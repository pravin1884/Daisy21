package com.codekuul.uitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codekuul.config.Application;
import com.codekuul.config.BaseClass;
import com.codekuul.keywords.UiKeywords;
import com.codekuul.pages.HomePage;
import com.codekuul.pages.JoinMeetingPage;

public class JoinMeetingPageTests extends BaseClass{
	UiKeywords keywords = UiKeywords.getInstance();
	
	
	@Test
	public void validateQuickJoinMeetingForValidInput() {
		HomePage home = new HomePage();
		JoinMeetingPage join = new JoinMeetingPage();
		Application app = new Application();
		home.clickOnjoinMeetingTab();
		join.enterUserName(app.getUserName());
		join.enterMeetingId(app.getMeetingId());
		join.clickJoinmeetingButton();

	}
	
	@Test
	public void validateNameFieldForBlankName() throws InterruptedException {
		HomePage home = new HomePage();
		JoinMeetingPage join = new JoinMeetingPage();
		Application app = new Application();
		home.clickOnjoinMeetingTab();
		join.enterMeetingId(app.getMeetingId());
		join.clickJoinmeetingButton();
		Thread.sleep(3000);
		Assert.assertEquals(join.getUserErrMessage(),"Please enter username");

	}
	@Test
	public void validateMeetingidFieldForBlankId() throws InterruptedException {
		HomePage home = new HomePage();
		JoinMeetingPage join = new JoinMeetingPage();
		Application app = new Application();
		home.clickOnjoinMeetingTab();
		join.enterUserName(app.getUserName());
		join.clickJoinmeetingButton();
		Thread.sleep(3000);
		Assert.assertEquals(join.getMeetingIdErrMessage(),"Please enter meeting id");

	}
	

}
