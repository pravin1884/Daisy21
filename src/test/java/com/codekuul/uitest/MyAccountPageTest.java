package com.codekuul.uitest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.codekuul.config.Application;
import com.codekuul.config.BaseClass;
import com.codekuul.keywords.UiKeywords;
import com.codekuul.pages.DashboardPage;
import com.codekuul.pages.HomePage;
import com.codekuul.pages.MyAccountPage;
import com.codekuul.pages.SignInPage;
import com.codekuul.pages.WebinarPage;
/**
 * This class contains methods wich is used for testing objects on My account page
 * @author pravin
 *
 */
@Listeners(com.codekuul.util.MyListners.class)
public class MyAccountPageTest extends BaseClass{
	UiKeywords keyword = UiKeywords.getInstance();
	@Test
	public void validateHomePageLink() {
		Application app = new Application();
		HomePage home = new HomePage();
	    DashboardPage dashBoard = new DashboardPage();
		MyAccountPage myAccount = new MyAccountPage();
		home.clickOnSignInTab();
		SignInPage signIn = new SignInPage();
		signIn.enterEmailAddress(app.getQaEmailId());
		signIn.enterPassword(app.getPassword());
		signIn.clickSignInButton();
		dashBoard.clickOnMyAccountTab();
		myAccount.clickOnHomePageTab();
		String oriUrl = keyword.getCurrentUrl();
	    String expextedStr = "dashboard";
	    Assert.assertTrue(oriUrl.contains(expextedStr));
		

	}
	
	@Test
	public void validateInvitesPageLink() {
		Application app = new Application();
		HomePage home = new HomePage();
	    DashboardPage dashBoard = new DashboardPage();
		MyAccountPage myAccount = new MyAccountPage();
		home.clickOnSignInTab();
		SignInPage signIn = new SignInPage();
		signIn.enterEmailAddress(app.getQaEmailId());
		signIn.enterPassword(app.getPassword());
		signIn.clickSignInButton();
		dashBoard.clickOnMyAccountTab();
		myAccount.clickInvitePageTab();
		String oriUrl = keyword.getCurrentUrl();
	    String expextedStr = "invites";
	    Assert.assertTrue(oriUrl.contains(expextedStr));

	}
	@Test
	public void validateApllicationPageLink() {
		Application app = new Application();
		HomePage home = new HomePage();
	    DashboardPage dashBoard = new DashboardPage();
		MyAccountPage myAccount = new MyAccountPage();
		home.clickOnSignInTab();
		SignInPage signIn = new SignInPage();
		signIn.enterEmailAddress(app.getQaEmailId());
		signIn.enterPassword(app.getPassword());
		signIn.clickSignInButton();
		dashBoard.clickOnMyAccountTab();
		myAccount.clickOnApplicationPageTab();
		String oriUrl = keyword.getCurrentUrl();
	    String expextedStr = "application";
	    Assert.assertTrue(oriUrl.contains(expextedStr));

	}
	@Test
	public void validateWebinarLink() {
		Application app = new Application();
		HomePage home = new HomePage();
	    DashboardPage dashBoard = new DashboardPage();
		MyAccountPage myAccount = new MyAccountPage();
		WebinarPage webi = new WebinarPage();
		home.clickOnSignInTab();
		SignInPage signIn = new SignInPage();
		signIn.enterEmailAddress(app.getQaEmailId());
		signIn.enterPassword(app.getPassword());
		signIn.clickSignInButton();
		dashBoard.clickOnMyAccountTab();
		myAccount.clickOnWebinarLink();
		String oriText = webi.getWebinarText();
	    String expextedText = "webinar";
	    Assert.assertTrue(oriText.contains(expextedText));

	}
	
	

}
