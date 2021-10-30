package com.codekuul.uitest;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codekuul.config.BaseClass;
import com.codekuul.util.Locaters;




 public class SignUpPageTest extends BaseClass {
     public static final Logger LOG = Logger.getLogger(SignUpPageTest.class);
	@Test
	public void validateFullNameFieldForCorrectInput() {
		String url = "https://ijmeet.com";
		lounchUrl(url);
		LOG.info("url is lounched" + url);
		click("css", "a.nav-link.nav-right-cutom-bg-1.font-weight-bold");
		LOG.info("clicked on sign up button");
		enterText(Locaters.SIGNUP_FULLNAME, "nirmai deshmukh");
		enterText(Locaters.SIGNUP_COMPANY, "infosys ltd");
		enterText(Locaters.SIGNUP_EMAIL, "pravind245@gmail.com");
		enterText(Locaters.SIGNUP_CONTACT, "8999817787");
		enterText(Locaters.SIGNUP_PASSWORD, "Nirmai@2018");
		switchToFrameAt(0);
		LOG.info("switch inside the frame");
		click("css", "div.recaptcha-checkbox-border");
		switchTodefaultContent();
		LOG.info("switch outside the frame");
		click("css", "button[type='submit']");
		String currUrl = getCurrentUrl();
		Assert.assertTrue(currUrl.contains("dashboard"));
		
	}

	@Test
	public void validateFullNameFieldForInvalidInput() {
		lounchUrl("https://ijmeet.com");
		click("css", "a.nav-link.nav-right-cutom-bg-1.font-weight-bold");
		enterText(Locaters.SIGNUP_FULLNAME, "34567345566");
		enterText(Locaters.SIGNUP_COMPANY, "infosys ltd");
		enterText(Locaters.SIGNUP_EMAIL, "pravind245@gmail.com");
		enterText(Locaters.SIGNUP_CONTACT, "8999817787");
		enterText(Locaters.SIGNUP_PASSWORD, "Nirmai@2018");

		switchToFrameAt(0);
		click("css", "div.recaptcha-checkbox-border");
		switchTodefaultContent();
		click("css", "button[type='submit']");
		String currUrl = getCurrentUrl();
		Assert.assertTrue(currUrl.contains("dashboard"));
		
	}

	@Test
	public void validateCompanyFieldForInvalidInput() {
		lounchUrl("https://ijmeet.com");
		click("css", "a.nav-link.nav-right-cutom-bg-1.font-weight-bold");
		enterText(Locaters.SIGNUP_FULLNAME, "nirmai deshmukh");
		enterText(Locaters.SIGNUP_COMPANY, "pfizer.ltd");
		enterText(Locaters.SIGNUP_EMAIL, "pravind245@gmail.com");
		enterText(Locaters.SIGNUP_CONTACT, "8999817787");
		enterText(Locaters.SIGNUP_PASSWORD, "Nirmai@2018");

		switchToFrameAt(0);
		click("css", "div.recaptcha-checkbox-border");
		switchTodefaultContent();
		click("css", "button[type='submit']");
		String currUrl = getCurrentUrl();
		Assert.assertTrue(currUrl.contains("dashboard"));
	}

	@Test
	public void validateEmailFieldForInvalidInput() {
		lounchUrl("https://ijmeet.com");
		click("css", "a.nav-link.nav-right-cutom-bg-1.font-weight-bold");
		enterText(Locaters.SIGNUP_FULLNAME, "nirmai deshmukh");
		enterText(Locaters.SIGNUP_COMPANY, "infosys ltd");
		enterText(Locaters.SIGNUP_EMAIL, "45345345345");
		enterText(Locaters.SIGNUP_CONTACT, "8999817787");
		enterText(Locaters.SIGNUP_PASSWORD, "Nirmai@2018");

		switchToFrameAt(0);
		click("css", "div.recaptcha-checkbox-border");
		switchTodefaultContent();
		click("css", "button[type='submit']");
		String currUrl = getCurrentUrl();
		Assert.assertTrue(currUrl.contains("dashboard"));
	}

	public void validateContactFieldForNoInput() {
		lounchUrl("https://ijmeet.com");
		click("css", "a.nav-link.nav-right-cutom-bg-1.font-weight-bold");
		enterText(Locaters.SIGNUP_FULLNAME, "nirmai deshmukh");
		enterText(Locaters.SIGNUP_COMPANY, "infosys ltd");
		enterText(Locaters.SIGNUP_EMAIL, "nirmai234@gmail.com");
		enterText(Locaters.SIGNUP_PASSWORD, "Nirmai@2018");
		switchToFrameAt(0);
		click("css", "div.recaptcha-checkbox-border");
		switchTodefaultContent();
		click("css", "button[type='submit']");
		String text = getText("xpath", "//label[contains(text(),'Enter mobile number')]");

		Assert.assertTrue(text.contains("Enter mobile number"));
	}

}
