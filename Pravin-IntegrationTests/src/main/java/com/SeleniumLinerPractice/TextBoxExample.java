package com.SeleniumLinerPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.CommonSeleniumUtils;

public class TextBoxExample extends CommonSeleniumUtils {

	@Test
	public void testMethod() {
		try {
			openBrowser();
			navigateTotheUrl();

			WebElement Elements = driver
					.findElement(By.xpath("//h5[(text()='Elements')]"));
			scrollIntoCenterview(Elements);
			waitForElement(1);
			Elements.click();
			waitForElement(3);

			scrollIntoCenterview("//span[text()='Text Box']"); // Scroll using
																// xpath
			driver.findElement(By.xpath("//span[text()='Text Box']")).click();
			waitForElement(2);

			scrollIntoCenterview(By.id("userName")); // Scroll using ID
			driver.findElement(By.id("userName")).sendKeys("Pravin");
			waitForElement(1);

			scrollIntoCenterview(By.id("userEmail"));
			driver.findElement(By.id("userEmail"))
					.sendKeys("Pravin@mailinator.com");
			waitForElement(1);

			driver.findElement(By.id("currentAddress")).sendKeys("Wagholi");
			waitForElement(1);

			driver.findElement(By.id("permanentAddress")).sendKeys("Pune");
			waitForElement(1);

			scrollIntoCenterview(By.id("submit"));
			waitForElement(1);
			driver.findElement(By.id("submit")).click();
			waitForElement(2);

		} finally {
			closeBrowser();
		}
	}

}
