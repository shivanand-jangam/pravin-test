package com.selenium;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.base.CommonSeleniumUtils;

public class FluientWaitExample extends CommonSeleniumUtils {
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

			FluentWait<WebDriver> wait = new FluentWait<>(driver)
					.withTimeout(Duration.ofSeconds(0))
					.pollingEvery(Duration.ofSeconds(0));
			// .ignoring(NoSuchElementException.class);

			WebElement element = wait
					.until(new Function<WebDriver, WebElement>() {
						public WebElement apply(WebDriver driver) {
							return driver.findElement(
									By.xpath("//button[@id='enableAfter']"));
						}
					});
			
//			scrollIntoCenterview(By.xpath("//button[@id='enableAfter']"));
			
			element.click();

		} finally {
			closeBrowser();
		}
	}
}
