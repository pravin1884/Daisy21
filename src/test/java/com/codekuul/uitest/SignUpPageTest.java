package com.codekuul.uitest;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codekuul.config.BaseClass;
import com.codekuul.keywords.UiKeywords;
import com.codekuul.util.Locaters;




 public class SignUpPageTest extends BaseClass {
	 UiKeywords keyword = UiKeywords.getInstance();
     public static final Logger LOG = Logger.getLogger(SignUpPageTest.class);
	@Test
	public void validateFullNameFieldForCorrectInput() {
		String url = "https://ijmeet.com";
		keyword.lounchUrl(url);
		LOG.info("url is lounched" + url);
		keyword.click("css", "a.nav-link.nav-right-cutom-bg-1.font-weight-bold");
		LOG.info("clicked on sign up button");
		keyword.enterText(Locaters.SIGNUP_FULLNAME, "nirmai deshmukh");
		keyword.enterText(Locaters.SIGNUP_COMPANY, "infosys ltd");
		keyword.enterText(Locaters.SIGNUP_EMAIL, "pravind245@gmail.com");
		keyword.enterText(Locaters.SIGNUP_CONTACT, "8999817787");
		keyword.enterText(Locaters.SIGNUP_PASSWORD, "Nirmai@2018");
		keyword.switchToFrameAt(0);
		LOG.info("switch inside the frame");
		keyword.click("css", "div.recaptcha-checkbox-border");
		keyword.switchTodefaultContent();
		LOG.info("switch outside the frame");
		keyword.click("css", "button[type='submit']");
		String currUrl = keyword.getCurrentUrl();
		Assert.assertTrue(currUrl.contains("dashboard"));
		
	}

	@Test
	public void validateFullNameFieldForInvalidInput() {
		keyword.lounchUrl("https://ijmeet.com");
		keyword.click("css", "a.nav-link.nav-right-cutom-bg-1.font-weight-bold");
		keyword.enterText(Locaters.SIGNUP_FULLNAME, "34567345566");
		keyword.enterText(Locaters.SIGNUP_COMPANY, "infosys ltd");
		keyword.enterText(Locaters.SIGNUP_EMAIL, "pravind245@gmail.com");
		keyword.enterText(Locaters.SIGNUP_CONTACT, "8999817787");
		keyword.enterText(Locaters.SIGNUP_PASSWORD, "Nirmai@2018");

		keyword.switchToFrameAt(0);
		keyword.click("css", "div.recaptcha-checkbox-border");
		keyword.switchTodefaultContent();
		keyword.click("css", "button[type='submit']");
		String currUrl = keyword.getCurrentUrl();
		Assert.assertTrue(currUrl.contains("dashboard"));
		
	}

	@Test
	public void validateCompanyFieldForInvalidInput() {
		keyword.lounchUrl("https://ijmeet.com");
		keyword.click("css", "a.nav-link.nav-right-cutom-bg-1.font-weight-bold");
		keyword.enterText(Locaters.SIGNUP_FULLNAME, "nirmai deshmukh");
		keyword.enterText(Locaters.SIGNUP_COMPANY, "pfizer.ltd");
		keyword.enterText(Locaters.SIGNUP_EMAIL, "pravind245@gmail.com");
		keyword.enterText(Locaters.SIGNUP_CONTACT, "8999817787");
		keyword.enterText(Locaters.SIGNUP_PASSWORD, "Nirmai@2018");

		keyword.switchToFrameAt(0);
		keyword.click("css", "div.recaptcha-checkbox-border");
		keyword.switchTodefaultContent();
		keyword.click("css", "button[type='submit']");
		String currUrl = keyword.getCurrentUrl();
		Assert.assertTrue(currUrl.contains("dashboard"));
	}

	@Test
	public void validateEmailFieldForInvalidInput() {
		keyword.lounchUrl("https://ijmeet.com");
		keyword.click("css", "a.nav-link.nav-right-cutom-bg-1.font-weight-bold");
		keyword.enterText(Locaters.SIGNUP_FULLNAME, "nirmai deshmukh");
		keyword.enterText(Locaters.SIGNUP_COMPANY, "infosys ltd");
		keyword.enterText(Locaters.SIGNUP_EMAIL, "45345345345");
		keyword.enterText(Locaters.SIGNUP_CONTACT, "8999817787");
		keyword.enterText(Locaters.SIGNUP_PASSWORD, "Nirmai@2018");

		keyword.switchToFrameAt(0);
		keyword.click("css", "div.recaptcha-checkbox-border");
		keyword.switchTodefaultContent();
		keyword.click("css", "button[type='submit']");
		String currUrl = keyword.getCurrentUrl();
		Assert.assertTrue(currUrl.contains("dashboard"));
	}

	public void validateContactFieldForNoInput() {
		keyword.lounchUrl("https://ijmeet.com");
		keyword.click("css", "a.nav-link.nav-right-cutom-bg-1.font-weight-bold");
		keyword.enterText(Locaters.SIGNUP_FULLNAME, "nirmai deshmukh");
		keyword.enterText(Locaters.SIGNUP_COMPANY, "infosys ltd");
		keyword.enterText(Locaters.SIGNUP_EMAIL, "nirmai234@gmail.com");
		keyword.enterText(Locaters.SIGNUP_PASSWORD, "Nirmai@2018");
		keyword.switchToFrameAt(0);
		keyword.click("css", "div.recaptcha-checkbox-border");
		keyword.switchTodefaultContent();
		keyword.click("css", "button[type='submit']");
		String text = keyword.getPText("xpath", "//label[contains(text(),'Enter mobile number')]");

		Assert.assertTrue(text.contains("Enter mobile number"));
	}

}
