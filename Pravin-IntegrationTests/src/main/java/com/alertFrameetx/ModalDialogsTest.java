package com.alertFrameetx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.CommonSeleniumUtils;

public class ModalDialogsTest extends CommonSeleniumUtils {

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

			scrollIntoCenterview("//span[text()='Modal Dialogs']"); // Scroll
																	// using
			// xpath
			driver.findElement(By.xpath("//span[text()='Modal Dialogs']"))
					.click();
			waitForElement(2);

			scrollIntoCenterview(By.id("showSmallModal"));
			driver.findElement(By.id("showSmallModal")).click();
			waitForElement(2);

			String text = driver
					.findElement(By.xpath("//div[@class='modal-body']"))
					.getText();

			System.out.println(text);

			driver.findElement(By.id("closeSmallModal")).click();
			waitForElement(2);

		} finally {
			closeBrowser();
		}
	}

}
