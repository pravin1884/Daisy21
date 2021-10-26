package com.codekuul.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.codekuul.keywords.UiKeywords;
import com.codekuul.util.PropertiesFile;

public class BaseClass extends UiKeywords {
	

	@BeforeMethod
	public void setUP() {
	
		openBrowser("crome");
		UiKeywords keyword = new UiKeywords();
		this.driver = keyword.getDriver();
		driver.get(PropertiesFile.getProperty("/src/main/resources/application.properties","daisy.dev.app.url"));

	}
	@AfterMethod
	public void tearDown() {
		closeBrowser();

	}
	

}
