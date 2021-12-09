package com.codekuul.config;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.codekuul.keywords.UiKeywords;

public class BaseClass{
	UiKeywords keyword = UiKeywords.getInstance();
	public RemoteWebDriver driver = null;
   @Parameters("browserName")
	@BeforeMethod
	public void setUP(@Optional String browserName) {
	    Application app = new Application();
	    if(browserName == null) {
	    	browserName = app.getBrowser();
	    }
		keyword.openBrowser(browserName);
		this.driver = keyword.getDriver();
		driver.get(app.getAppUrl());
	}

	@AfterMethod
	public void tearDown() {
		keyword.closeBrowser();

	}

}
