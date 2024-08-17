package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.base.CommonSeleniumUtils;

public class WaitsExample extends CommonSeleniumUtils {

	@Test
	public void example() {

		try {
			openBrowser();
			navigateTotheUrl();
			setImplicitWait(1);

			WebElement Elements = driver
					.findElement(By.xpath("//h5[(text()='Elements')]"));
			scrollIntoCenterview(Elements);
			waitForElement(1);
			Elements.click();
			waitForElement(3);
			scrollIntoCenterview("//span[text()='Dynamic Properties']");
			waitForElement(2);
			driver.findElement(By.xpath("//span[text()='Dynamic Properties']"))
					.click();

			WebDriverWait wait = new WebDriverWait(driver,
					Duration.ofSeconds(4));

			WebElement element = wait
					.until(ExpectedConditions.elementToBeClickable(
							By.xpath("//button[@id='enableAfter']")));
			
			scrollIntoCenterview("//button[@id='enableAfter']");
			
			element.click();

		} finally {
			closeBrowser();
		}
	}

}
