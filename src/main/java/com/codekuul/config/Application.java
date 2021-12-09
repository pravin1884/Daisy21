package com.codekuul.config;

import com.codekuul.util.PropertiesFile;

public class Application {
	private static final String FILEPATH = "/src/main/resources/application.properties";

	public String getBrowser() {
		return PropertiesFile.getProperty(FILEPATH, "daisy.browser");

	}
	public String getAppUrl() {
		return PropertiesFile.getProperty(FILEPATH, "daisy.dev.app.url");

	}
       public  String getDbUrl() {
		return  PropertiesFile.getProperty(FILEPATH, "");

	}
       public  String getUserName() {
   		return  PropertiesFile.getProperty(FILEPATH, "daisy.dev.app.username");

   	}
       public  String getPassword() {
   		return  PropertiesFile.getProperty(FILEPATH, "daisy.dev.app.password");

   	}
       public  String getMeetingId() {
      		return  PropertiesFile.getProperty(FILEPATH, "daisy.dev.app.meetingid");

      	}
       public  String getInvalidUserName() {
      		return  PropertiesFile.getProperty(FILEPATH, "daisy.dev.app.invalid.username");

      	}
       public  String getQaEmailId() {
     		return  PropertiesFile.getProperty(FILEPATH, "daisy.qa.app.email");

     	}
       
       
}
