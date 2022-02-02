package com.codekuul.keywords;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiKeywords {
	public RemoteWebDriver driver = null;
	private static UiKeywords uikeywords;
	static {
		uikeywords = new UiKeywords();
	}

	public static UiKeywords getInstance() {
		return uikeywords;

	}

	private UiKeywords() {

	}

	/**
	 * This keyword is used to open browser
	 * 
	 * @param browser name must be following:
	 *                <ul>
	 *                <li>crome</li>
	 *                <li>firefox</li>
	 *                <li>ie</li>
	 *                </ul>
	 * @author pravin
	 *
	 */
    
	public void openBrowser(String browserName) {
		/*ChromeOptions options = new ChromeOptions();
		options.*/
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("enter correct driver name invalid browser name" + browserName);
		}

	}

	/**
	 * This method launches the url which is specified in argument
	 * 
	 * @param url
	 * @author pravin
	 */
	public void lounchUrl(String url) {
		driver.get(url);

	}

	/**
	 * This keyword is used to close browser
	 * 
	 * @author pravin
	 */
	public void closeBrowser() {
		driver.quit();

	}

	/**
	 * This method click on selected element
	 * 
	 * @param element
	 * @author pravin
	 */
	public void click(WebElement element) {
		element.click();

	}

	/**
	 * 
	 * @param element
	 * @param text
	 */
	public void enterText(WebElement element, String text) {
		element.sendKeys(text);

	}

	public WebElement hover(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element);
		return element;

	}

	public String getTitleOfPage() {
		return driver.getTitle();

	}

	public  RemoteWebDriver getDriver() {
		return driver;
	}

	public void click(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();
	}

	public void enterText(String locatorType, String locatorValue, String textToEnter) {
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);

	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();

	}

	public void switchToFrameAt(int index) {
		driver.switchTo().frame(index);

	}

	public void switchTodefaultContent() {
		driver.switchTo().defaultContent();
	}

	public void switchToFrameAt(String idorName) {
		driver.switchTo().frame(idorName);

	}

	public void switchToFrameAt(WebElement element) {
		driver.switchTo().frame(element);

	}
	

	public void enterText(String object, String textToEnter) {
		String[] parts = object.split("##");
		getWebElement(parts[0], parts[1]).sendKeys(textToEnter);
	}

	public String getPText(String locatorType, String locatorValue) {
		String text = getWebElement(locatorType, locatorValue).getText();
		return text;

	}
	public String getAttributeValue(WebElement element) {
		String text = element.getAttribute("class");
		return text;

	}
	

	public String getErrMessageText(WebElement webelement) {

		String text = webelement.getText();
		return text;
		

	}
	
	public void clearText(WebElement webelement) {
		//driver.webelement
		

	}

	public void dragAndDrop(String sourceLocatorType, String sourceLocatorValue, String destinationLocatorType,
			String destinationLocatorValue) {
		Actions action = new Actions(driver);
		action.clickAndHold(getWebElement(sourceLocatorType, sourceLocatorValue))
				.moveToElement(getWebElement(destinationLocatorType, destinationLocatorValue)).release().build()
				.perform();

	}

	public Actions sendCapitalizeString(String text) {
		Actions action = new Actions(driver);
		return action.keyDown(Keys.SHIFT).sendKeys(text);

	}

	public void getWindow(String winUrl) {
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			String currUrl = driver.switchTo().window(winUrl).getCurrentUrl();
			if (currUrl.contains(winUrl)) {
				break;

			} else {
				continue;
			}
		}

	}

	public WebElement getWebElement(String locatorType, String locatorValue) {
		WebElement element = null;
		if (locatorType.equalsIgnoreCase("css")) {
			element = driver.findElement(By.cssSelector(locatorValue));
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			element = driver.findElement(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(locatorValue));
		} else if (locatorType.equalsIgnoreCase("class")) {
			element = driver.findElement(By.className(locatorValue));
		} else if (locatorType.equalsIgnoreCase("linktest")) {
			element = driver.findElement(By.linkText(locatorValue));

		} else if (locatorType.equalsIgnoreCase("name")) {
			element = driver.findElement(By.name(locatorValue));
		} else if (locatorType.equalsIgnoreCase("partialLink")) {
			element = driver.findElement(By.partialLinkText(locatorValue));
		} else if (locatorType.equalsIgnoreCase("tag")) {
			element = driver.findElement(By.tagName(locatorValue));
		}
		return element;

	}

}
