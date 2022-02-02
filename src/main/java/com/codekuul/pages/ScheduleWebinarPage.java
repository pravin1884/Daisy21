package com.codekuul.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class ScheduleWebinarPage {
	UiKeywords keyword = UiKeywords.getInstance();

	public ScheduleWebinarPage(){
		PageFactory.initElements(keyword.getDriver(), this);
	}
	
	@FindBy(css = "#webinar-span")
	public WebElement scheduleWebinarText;
	
	public String getScheduleWebinarTitle() {
		return scheduleWebinarText.getAttribute("id");
	}

}
