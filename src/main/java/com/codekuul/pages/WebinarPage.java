package com.codekuul.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codekuul.keywords.UiKeywords;

public class WebinarPage {
	UiKeywords keyword = UiKeywords.getInstance();

	public WebinarPage() {
		PageFactory.initElements(keyword.getDriver(), this);
	}

	@FindBy(css = "[id='upcoming-webinars']  div[class='row'] div div button")
	public WebElement webinarText;

	@FindBy(css = "button[class='wtablinks active']")
	public WebElement previousWebinarButton;
	
	@FindBy(css="button[class='wtablinks active']+ button")
	public WebElement scheduleWebinarButton;
	
	@FindBy(css="#upcoming_webinar_search_key")
	public WebElement webinarIdSearchBox;
	
	@FindBy(css="#upcoming_webinar_start_date")
	public WebElement startDateCalendar;
	
	@FindBy(css="#upcoming_webinar_end_date")
	public WebElement endDateCalendar;
	
	@FindBy(css=".btn.btn-default.mbtn.search_value_upcoming_webinar")
	public WebElement searchWebinarButton;
	
	@FindBy(xpath="//div[@id='upcoming-webinars']/div[2]/div/div/div/div[2]/h4")
	public WebElement meetingNameText;

	public String getWebinarText() {
		return keyword.getAttributeValue(webinarText);
	}

	public void clickOnPreviousButton() {
		keyword.click(previousWebinarButton);
	}
	
	public void enterWebinarIdInWebinarIdSearchBox(String text) {
		keyword.enterText(webinarIdSearchBox, text);
	}
	
	public void clickOnScheduleWebinarButton() {
		keyword.click(scheduleWebinarButton);
	}
	
	public void enterDateInStartDateField(String text) {
		startDateCalendar.clear();
		keyword.enterText(startDateCalendar,text);
		
	}
	public String getDateInStartDateField() {
	     return startDateCalendar.getAttribute("value");
		
		
	}
	
	public WebElement getStartDateFieldWebelement() {
	     return startDateCalendar;
		
		
	}
	public void enterDateInEndDateField(String text) {
		endDateCalendar.clear();
		keyword.enterText(endDateCalendar,text);
		
	}
	public String getDateInEndDateField() {
	     return endDateCalendar.getAttribute("value");
		
		
	}
	public WebElement getEndDateFieldWebelement() {
	     return endDateCalendar;
		
		
	}

	public void clickOnSearchWebinarButton() {
		keyword.click(searchWebinarButton);
		
	}
	
	public String getMeetingName() {
		return meetingNameText.getText();
	}

	public WebElement getMeetingNameWebelement() {
		return meetingNameText;

	}


}
