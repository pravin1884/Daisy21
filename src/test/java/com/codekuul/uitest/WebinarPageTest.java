package com.codekuul.uitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codekuul.config.Application;
import com.codekuul.config.BaseClass;
import com.codekuul.pages.DashboardPage;
import com.codekuul.pages.HomePage;
import com.codekuul.pages.MyAccountPage;
import com.codekuul.pages.ScheduleWebinarPage;
import com.codekuul.pages.SignInPage;
import com.codekuul.pages.WebinarPage;
import com.codekuul.util.WaitFor;

public class WebinarPageTest extends BaseClass {

	@Test
	public void validateTitleOfPage() {
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
		myAccount.clickOnWebinarLink();
		WebinarPage webPage = new WebinarPage();
		String text = webPage.getWebinarText();
		Assert.assertTrue(text.contains("webinar"));

	}
	
	@Test
	public void validateScheduleWebinarButton() throws InterruptedException {
		Application app = new Application();
		HomePage home = new HomePage();
		DashboardPage dashBoard = new DashboardPage();
		MyAccountPage myAccount = new MyAccountPage();
		WaitFor wait = new WaitFor();
		WebinarPage webPage = new WebinarPage();
		ScheduleWebinarPage scWeb = new ScheduleWebinarPage();
		SignInPage signIn = new SignInPage();
		home.clickOnSignInTab();
		signIn.enterEmailAddress(app.getQaEmailId());
		signIn.enterPassword(app.getPassword());
		signIn.clickSignInButton();
		dashBoard.clickOnMyAccountTab();
		myAccount.clickOnWebinarLink();
		wait.elementToBeClickable(webPage.scheduleWebinarButton);
		webPage.clickOnScheduleWebinarButton();
		String title = scWeb.getScheduleWebinarTitle();
		Assert.assertEquals(title,"webinar-span");
		

	}
	
	@Test
	public void validateStartDateField(){
		Application app = new Application();
		HomePage home = new HomePage();
		DashboardPage dashBoard = new DashboardPage();
		MyAccountPage myAccount = new MyAccountPage();
		WebinarPage webPage = new WebinarPage();
		SignInPage signIn = new SignInPage();
		home.clickOnSignInTab();
		signIn.enterEmailAddress(app.getQaEmailId());
		signIn.enterPassword(app.getPassword());
		signIn.clickSignInButton();
		dashBoard.clickOnMyAccountTab();
		myAccount.clickOnWebinarLink();
		WaitFor.visibilityOfElement(webPage.getStartDateFieldWebelement(), 100);
		webPage.enterDateInStartDateField("03/12/2022");
		WaitFor.visibilityOfElement(webPage.getStartDateFieldWebelement(), 100);
		String date = webPage.getDateInStartDateField();
		Assert.assertEquals(date,"03/12/2022");
		
		

	}
	@Test
	public void validateEndDateField(){
		Application app = new Application();
		HomePage home = new HomePage();
		DashboardPage dashBoard = new DashboardPage();
		MyAccountPage myAccount = new MyAccountPage();
		WebinarPage webPage = new WebinarPage();
		SignInPage signIn = new SignInPage();
		home.clickOnSignInTab();
		signIn.enterEmailAddress(app.getQaEmailId());
		signIn.enterPassword(app.getPassword());
		signIn.clickSignInButton();
		dashBoard.clickOnMyAccountTab();
		myAccount.clickOnWebinarLink();
		WaitFor.visibilityOfElement(webPage.getEndDateFieldWebelement(), 100);
		webPage.enterDateInEndDateField("03/12/2022");
		WaitFor.visibilityOfElement(webPage.getEndDateFieldWebelement(), 100);		
		String date = webPage.getDateInEndDateField();
		Assert.assertEquals(date,"03/12/2022");
		
		

	}
	
	@Test
	public void validateSearchWebinarFunctionality() throws InterruptedException {
		Application app = new Application();
		HomePage home = new HomePage();
		DashboardPage dashBoard = new DashboardPage();
		MyAccountPage myAccount = new MyAccountPage();
		WebinarPage webPage = new WebinarPage();
		SignInPage signIn = new SignInPage();
		home.clickOnSignInTab();
		signIn.enterEmailAddress(app.getQaEmailId());
		signIn.enterPassword(app.getPassword());
		signIn.clickSignInButton();
		dashBoard.clickOnMyAccountTab();
		myAccount.clickOnWebinarLink();
		//WaitFor.visibilityOfElement(webPage.getStartDateFieldWebelement(), 100);
		Thread.sleep(1000);
		webPage.enterDateInStartDateField("02/01/2022");
		Thread.sleep(1000);
		webPage.enterDateInEndDateField("02/05/2022");
		Thread.sleep(1000);
		webPage.enterWebinarIdInWebinarIdSearchBox("f975715");
		Thread.sleep(1000);
		webPage.clickOnSearchWebinarButton();
		//WaitFor.visibilityOfElement(webPage.getMeetingNameWebelement(), 100);
		Thread.sleep(1000);
		String name = webPage.getMeetingName();
		Thread.sleep(1000);
		Assert.assertEquals(name,"month planning");
		
		

	}


}
