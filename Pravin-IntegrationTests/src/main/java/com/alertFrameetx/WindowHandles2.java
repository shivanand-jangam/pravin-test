package com.alertFrameetx;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.base.CommonSeleniumUtils;

public class WindowHandles2 extends CommonSeleniumUtils {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@Test
	public void testMethod() {
		try {
			openBrowser();
			navigateTotheUrl();

			// List of URLs to open in new tabs
			List<String> urls = new ArrayList<>();
			urls.add("https://chatgpt.com/");
			urls.add("https://www.google.co.in/");

			// Open each URL in a new tab
			for (String url : urls) {
				// Use JavaScript to open a new tab
				((JavascriptExecutor) driver)
						.executeScript("window.open('about:blank','_blank');");

				// Wait for new window and get all window handles
//				wait.until(ExpectedConditions.numberOfWindowsToBe(
//						driver.getWindowHandles().size() + 1));

				Set<String> allWindowHandles = driver.getWindowHandles();

				String newTabHandle = (String) allWindowHandles
						.toArray()[allWindowHandles.size() - 1];

				// Switch to the new tab
				driver.switchTo().window(newTabHandle);

				// Navigate to the desired URL in the new tab
				driver.get(url);
			}

			// Optionally, switch back to the main window or perform actions in
			// each tab
			Set<String> allWindowHandles = driver.getWindowHandles();
			String mainWindowHandle = (String) allWindowHandles.toArray()[0];
			driver.switchTo().window(mainWindowHandle);

			// Perform further actions on the main window
			WebElement mainPageElement = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.id("main-element-id")));
			mainPageElement.click();
		}
		finally {
			closeBrowser();
		}
	}
}
