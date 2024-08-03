package com.alertFrameetx;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.CommonSeleniumUtils;

public class WindowHandles extends CommonSeleniumUtils {

	@Test
	public void testMethod() {
		try {
			openBrowser();
			navigateTotheUrl();
			
			WebElement Elements = driver.findElement(
					By.xpath("//h5[(text()='Alerts, Frame & Windows')]"));
			scrollIntoCenterview(Elements);
			waitForElement(1);
			Elements.click();
			waitForElement(2);

			scrollIntoCenterview("//span[text()='Browser Windows']"); // Scroll
																		// using
			// xpath
			driver.findElement(By.xpath("//span[text()='Browser Windows']"))
					.click();
			waitForElement(2);
			String parentWindow = driver.getWindowHandle();

			
			System.out.println("Parent Window: "+parentWindow);
			
			scrollIntoCenterview(By.id("windowButton"));
			driver.findElement(By.id("windowButton")).click();
			waitForElement(2);

			Set<String> setOfWindows = driver.getWindowHandles();

			System.out.println(setOfWindows.toArray().toString());
			
			for (String window : setOfWindows) {
				
				driver.switchTo().window(window);
				
				if (!window.equalsIgnoreCase(parentWindow)) {
					driver.manage().window().maximize();
					waitForElement(2);
					
					String text = driver.findElement(By.id("sampleHeading"))
							.getText();
					System.out.println("child window text: " + text);
					waitForElement(2);
					driver.close();
					waitForElement(1);
					driver.switchTo().window(parentWindow);
					waitForElement(2);
					break;
				}
			}
			driver.findElement(By.id("tabButton")).click();
			waitForElement(2);

		} finally {
			closeBrowser();
		}

	}

}
