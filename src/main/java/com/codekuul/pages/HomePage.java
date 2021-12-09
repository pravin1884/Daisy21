package com.codekuul.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.config.BaseClass;
import com.codekuul.keywords.UiKeywords;

public class HomePage extends BaseClass {
	UiKeywords keyword = UiKeywords.getInstance();

	public HomePage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}

	@FindBy(css = "div#navbarContent li:nth-child(1)")
	public WebElement joinMeetingTab;

	@FindBy(xpath = "//a[contains(text(),'Host Meeting')]")
	public WebElement hostMeetingTab;

	@FindBy(xpath = "//a[contains(text(),'Contact sales')]")
	public WebElement contactSalesTab;

	@FindBy(xpath = "//a[contains(text(),'Support')]")
	public WebElement supportLink;

	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	public WebElement contactUsLink;

	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	public WebElement aboutUsLink;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/footer[1]/div[2]/div[3]/ul[1]/li[2]")
	public WebElement termsAndConditionLink;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/footer[1]/div[2]/div[3]/ul[1]/li[3]")
	public WebElement privacyPolicyLink;

	@FindBy(xpath = "//a[contains(text(),'Twitter')]")
	public WebElement twitterLink;

	@FindBy(xpath = "//a[contains(text(),'Facebook')]")
	public WebElement facebookLink;

	@FindBy(xpath = "//a[contains(text(),'Google +')]")
	public WebElement googleLink;

	@FindBy(xpath = "//a[contains(text(),'Instagram')]")
	public WebElement instgramLink;

	@FindBy(css = ".nav-link.nav-right-cutom-bg.font-weight-bold")
	public WebElement signInTab;

	@FindBy(css = ".nav-link.nav-right-cutom-bg-1.font-weight-bold")
	public WebElement signUpTab;

	@FindBy(css = ".language-trance-arabic")
	public WebElement arabicTransletTab;

	@FindBy(xpath = "//a[@href='https://play.google.com/store/apps/details?id=com.gcnt.ijmeet']")
	public WebElement googlePlayStoreLink;

	@FindBy(xpath = "//a[@href='https://apps.apple.com/us/app/id1524001778']")
	public WebElement applePlayStoreLink;

	@FindBy(xpath = "//a[@href='https://www.microsoft.com/en-in/store/apps/9NS1D2JCX4V0']")
	public WebElement microsoftStoreLink;

	public void clickOnjoinMeetingTab() {
		joinMeetingTab.click();

	}

	public void clickOnHostMeetingTab() {
		hostMeetingTab.click();
	}

	public void clickOnContactSalesTab() {
		contactSalesTab.click();
	}

	public void clickOnSignInTab() {
		signInTab.click();
	}

	public void clickOnSignUpTab() {
		signUpTab.click();
	}

	public void clickOnArabicTransletTab() {
		arabicTransletTab.click();
	}

	public void clickOnSupportLink() {
		supportLink.click();
	}

	public void clickOnContactUsLink() {
		contactUsLink.click();
	}

	public void clickOnAboutUsLink() {
		aboutUsLink.click();
	}

	public void clickOnTermsAndConditionLink() {
		termsAndConditionLink.click();
	}

	public void clickOnPrivacyPolicyLink() {
		privacyPolicyLink.click();
	}

	public void clickOnTwitterLink() {
		twitterLink.click();
	}

	public void clickOnFacebookLink() {
		facebookLink.click();
	}

	public void clickOnGoogleLink() {
		googleLink.click();
	}

	public void clickOnInstagramLink() {
		instgramLink.click();
	}

	public void clickOnGooglePlayStoreLink() {
		googlePlayStoreLink.click();
	}

	public void clickOnApplePlayStoreLink() {
		applePlayStoreLink.click();
	}

	public void clickOnMicrosoftStoreLink() {
		microsoftStoreLink.click();
	}

	public List<WebElement> getAllLinks() {
		return driver.findElements(By.tagName("a"));

	}
	

}
