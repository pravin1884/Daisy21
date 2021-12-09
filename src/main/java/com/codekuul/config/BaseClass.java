package com.codekuul.config;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.codekuul.keywords.UiKeywords;

public class BaseClass{
	UiKeywords keyword = UiKeywords.getInstance();
	public RemoteWebDriver driver = null;
   // @Parameters("browserName")
	@BeforeMethod
	public void setUP() {
	    Application app = new Application();
		keyword.openBrowser(app.getBrowser());
		this.driver = keyword.getDriver();
		driver.get(app.getAppUrl());
	}

	@AfterMethod
	public void tearDown() {
		keyword.closeBrowser();

	}

}
