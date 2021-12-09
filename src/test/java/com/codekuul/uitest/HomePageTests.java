package com.codekuul.uitest;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codekuul.config.BaseClass;
import com.codekuul.keywords.UiKeywords;
import com.codekuul.pages.AboutUsPage;
import com.codekuul.pages.ContactSalesPage;
import com.codekuul.pages.ContactUsPage;
import com.codekuul.pages.HomePage;
import com.codekuul.pages.HostMeetingPage;
import com.codekuul.pages.JoinMeetingPage;
import com.codekuul.pages.SignInPage;
import com.codekuul.pages.SignUpPage;
import com.codekuul.pages.SupportPage;
import com.codekuul.pages.TermsAndConditionPage;
import com.codekuul.util.WaitFor;

public class HomePageTests extends BaseClass {
	UiKeywords keywords = UiKeywords.getInstance();
    private static final Logger LOG = Logger.getLogger(HomePageTests.class);

	@Test
	public void verifyTitleOfHomePage() {
		String expectedTitle = "IJmeet";
		LOG.info("assigning expectedtitle to variable");
		Assert.assertEquals(keywords.getTitleOfPage(), expectedTitle);
		LOG.info("verifing that expected url is equal to current url");

	}

	@Test
	public void verifyIfUserRedirectsToJoinMeetingPage() {
		HomePage home = new HomePage();
		LOG.info("");
		home.clickOnjoinMeetingTab();
		JoinMeetingPage joinMeeting = new JoinMeetingPage();
		String title = joinMeeting.getQuickJoinMeetingTitle();
		Assert.assertTrue(title.contains("Qui"));

	}

	@Test
	public void verifyIfUserRedirectsToHostMeetingPage() {
		HomePage home = new HomePage();
		home.clickOnHostMeetingTab();
		HostMeetingPage hostMeeting = new HostMeetingPage();
		String title = hostMeeting.getScreenSharingTitle();
		Assert.assertTrue(title.contains("Scr"));

	}

	@Test
	public void verifyIfUserRedirectsToContactSalesPage() {
		HomePage home = new HomePage();
		home.clickOnContactSalesTab();
		ContactSalesPage contactsale = new ContactSalesPage();
		String url = contactsale.getContactSalesPageUrl();
		Assert.assertTrue(url.contains("contact"));

	}

	@Test
	public void verifyIfUserRedirectsToSignInPage() {
		HomePage home = new HomePage();
		home.clickOnSignInTab();
		SignInPage signin = new SignInPage();
		String title = signin.getSignInPageTitle();
		Assert.assertTrue(title.contains("Sign"));

	}

	@Test
	public void verifyIfUserRedirectsToSignUpPage() {
		HomePage home = new HomePage();
		home.clickOnSignUpTab();
		SignUpPage signin = new SignUpPage();
		String title = signin.getSignUppageTitle();
		Assert.assertTrue(title.contains("Up"));

	}

	@Test
	public void verifyArabicTranslerTab() {
		HomePage home = new HomePage();
		home.clickOnArabicTransletTab();
		WaitFor.visibilityOfElement(keywords.getDriver().findElement(By.xpath("//span[@class='language-trance-arabic']")),
				30);
		String text = keywords.getDriver().findElement(By.xpath("//span[@class='language-trance-arabic']")).getText();
		Assert.assertTrue(text.contains("English"));

	}

	@Test
	public void verifyIfUserRedirectsToSupportPage() throws InterruptedException {
		HomePage home = new HomePage();
		// WaitFor wait = new WaitFor();
		JavascriptExecutor js = (JavascriptExecutor) keywords.getDriver();
		js.executeScript("window.scrollBy(309, 1960)");
		// wait.elementToBeClickable(keywords.getDriver().findElement(By.xpath("//a[contains(text(),'
		// Support ')]")), 40);
		Thread.sleep(3000);
		home.clickOnSupportLink();
		SupportPage support = new SupportPage();
		String url = support.getSupportPageUrl();
		Assert.assertTrue(url.contains("contact"));
	}

	@Test
	public void verifyIfUserRedirectsToContactUsPage() throws InterruptedException {
		HomePage home = new HomePage();
		// WaitFor wait = new WaitFor();
		JavascriptExecutor js = (JavascriptExecutor) keywords.getDriver();
		js.executeScript("window.scrollBy(319,2004)");
		// wait.elementToBeClickable(keywords.getDriver().findElement(By.xpath("//a[contains(text(),'
		// Support ')]")), 40);
		Thread.sleep(3000);
		home.clickOnContactUsLink();
		ContactUsPage contact = new ContactUsPage();
		String url = contact.getContactUsPageUrl();
		Assert.assertTrue(url.contains("contact"));
	}

	@Test
	public void verifyIfUserRedirectsToAboutUsPage() throws InterruptedException {
		HomePage home = new HomePage();
		// WaitFor wait = new WaitFor();
		JavascriptExecutor js = (JavascriptExecutor) keywords.getDriver();
		js.executeScript("window.scrollBy(319,2004)");
		// wait.elementToBeClickable(keywords.getDriver().findElement(By.xpath("//a[contains(text(),'
		// Support ')]")), 40);
		Thread.sleep(3000);
		home.clickOnAboutUsLink();
		AboutUsPage about = new AboutUsPage();
		String url = about.getAboutUsPageUrl();
		Assert.assertTrue(url.contains("about_us"));
	}

	@Test
	public void verifyIfUserRedirectsToTermsAndConditionPage() throws InterruptedException {
		HomePage home = new HomePage();

		JavascriptExecutor js = (JavascriptExecutor) keywords.getDriver();
		js.executeScript("window.scrollBy(628, 1944)");

		Thread.sleep(3000);
		home.clickOnTermsAndConditionLink();
		TermsAndConditionPage terms = new TermsAndConditionPage();
		String url = terms.getTermsAndConditionPageUrl();
		Assert.assertTrue(url.contains("terms_conditions"));
	}
	@Test
	public void validateAllLinksOfHomePage() throws IOException  {
		HomePage home = new HomePage();
		List<WebElement> links = home.getAllLinks();
		Iterator<WebElement> itr = links.iterator();
		while(itr.hasNext()) {
			String url = itr.next().getAttribute("href");
			try {
				HttpsURLConnection conect =( HttpsURLConnection)(new URL(url).openConnection());
				int code = conect.getResponseCode();
				if(code>=400) {
					System.out.println("link is broken" + url);
				}
				
			}catch(MalformedURLException e) {
				System.out.println("url:" + url);
			}
		}
		

	}
}

