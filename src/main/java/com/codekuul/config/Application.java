package com.codekuul.config;

import com.codekuul.util.PropertiesFile;

public class Application {
	private static final String FILEPATH = "/src/main/resources/application.properties";

	public void getBrowser() {
		PropertiesFile.getProperty(FILEPATH, "daisy.browser");

	}
	public void getAppUrl() {
		PropertiesFile.getProperty(FILEPATH, "daisy.dev.app.url ");

	}
	
}
