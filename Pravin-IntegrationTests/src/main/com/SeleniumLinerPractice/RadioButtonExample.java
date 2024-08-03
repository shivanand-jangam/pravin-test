package com.SeleniumLinerPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.CommonSeleniumUtils;

public class RadioButtonExample extends CommonSeleniumUtils {

	@Test
	public void example() {
		try {
			openBrowser();
			navigateTotheUrl();

			WebElement Elements = driver
					.findElement(By.xpath("//h5[(text()='Elements')]"));
			scrollIntoCenterview(Elements);
			waitForElement(1);
			Elements.click();
			waitForElement(3);

			scrollIntoCenterview("//span[text()='Radio Button']");
			waitForElement(2);

			driver.findElement(By.xpath("//span[text()='Radio Button']"))
					.click();
			waitForElement(2);

			driver.findElement(By.xpath("//span[text()='Radio Button']"))
					.click();
			waitForElement(2);

			clickUsingJs("//input[@id='impressiveRadio']");
			waitForElement(2);

			boolean isDisplayed = driver
					.findElement(By.xpath("//span[text()='Impressive']"))
					.isDisplayed();

			Assert.assertTrue(isDisplayed,
					"Impressive radio button is not diplayed");

		} finally {
			closeBrowser();
		}

	}

}
