package com.codekuul.uitest.homePageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codekuul.config.BaseClass;
import com.codekuul.keywords.UiKeywords;
@Test
public class HomePageTest extends BaseClass{
     UiKeywords keyword = UiKeywords.getInstance();
	String expected = "Testing Shastra | Training | Placement";
	public void verifyTitleOfTheHomePage() {
		keyword.lounchUrl("https://testingshastra.com");
		String curPage =keyword.getTitleOfPage();
		Assert.assertEquals(curPage, expected);

	}
	

}
