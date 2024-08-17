package com.alertFrameetx;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.CommonSeleniumUtils;

public class HandleAlertTest extends CommonSeleniumUtils {

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

			scrollIntoCenterview("//span[text()='Alerts']"); // Scroll using
																// xpath
			driver.findElement(By.xpath("//span[text()='Alerts']")).click();
			waitForElement(2);

			driver.findElement(By.id("alertButton")).click();
			waitForElement(2);

			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		} finally {
			closeBrowser();
		}
	}
	
	@Test
	public void alert2() {
		try {
			openBrowser();
			navigateTotheUrl();

			WebElement Elements = driver.findElement(
					By.xpath("//h5[(text()='Alerts, Frame & Windows')]"));
			scrollIntoCenterview(Elements);
			waitForElement(1);
			Elements.click();
			waitForElement(2);

			scrollIntoCenterview("//span[text()='Alerts']"); // Scroll using
																// xpath
			driver.findElement(By.xpath("//span[text()='Alerts']")).click();
			waitForElement(2);

			driver.findElement(By.id("alertButton")).click();
			waitForElement(2);

			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		} finally {
			closeBrowser();
		}
	}
	
}
