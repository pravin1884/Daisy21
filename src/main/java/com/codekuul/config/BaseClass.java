package com.codekuul.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.codekuul.keywords.UiKeywords;
import com.codekuul.util.PropertiesFile;

public class BaseClass extends UiKeywords {

	@BeforeMethod
	public void setUP() {
		Application app = new Application();
		openBrowser(app.getBrowser());
		UiKeywords keyword = new UiKeywords();
		this.driver = keyword.getDriver();
		driver.get(app.getAppUrl());
        Arrays
	}

	@AfterMethod
	public void tearDown() {
		closeBrowser();

	}

}
