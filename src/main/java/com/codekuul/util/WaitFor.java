package com.codekuul.util;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codekuul.config.BaseClass;
import com.codekuul.keywords.UiKeywords;

public class WaitFor {
	private static WebDriverWait wait;
	UiKeywords key = UiKeywords.getInstance();

	public WaitFor() {

		wait = new WebDriverWait(key.getDriver(), Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(500));
	}

	public static void visibilityOfElement(WebElement element, int duration) {
		wait.ignoring(NoSuchElementException.class);
		wait.withTimeout(Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void stalenessOfElement(WebElement element, int duration) {
		wait.ignoring(NoSuchElementException.class);
		wait.withTimeout(Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.stalenessOf(element));

	}

	public static void elementToBeClickable(WebElement element, int duration) {
		wait.ignoring(NoSuchElementException.class);
		wait.withTimeout(Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	/**
	 * this method waits for element to be clickable Max timeout is 30sec which is
	 * not configurable
	 * 
	 * @param element
	 */
	public void elementToBeClickable(WebElement element) {
		wait.ignoring(NoSuchElementException.class);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void textToBePresentInElement(WebElement element, String text, int duration) {
		wait.ignoring(NoSuchElementException.class);
		wait.withTimeout(Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}

}
