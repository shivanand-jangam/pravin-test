package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.CommonSeleniumUtils;

public class WebdriverMethods extends CommonSeleniumUtils {

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

			// driver.get("URL");
			// driver.navigate().to("URL");

			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().back();
			driver.navigate().forward();

			scrollIntoCenterview("//span[text()='Web Tables']");
			waitForElement(2);
			driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
			waitForElement(2);

			String title = driver.getTitle();
			System.out.println("title: " + title);

			String currentUrl = driver.getCurrentUrl();
			System.out.println("currentUrl: " + currentUrl);

			String attribute = driver
					.findElement(By.xpath("//button[@id='addNewRecordButton']"))
					.getAttribute("class");
			System.out.println("attribute: " + attribute);

			String color = driver
					.findElement(By.xpath("//button[@id='addNewRecordButton']"))
					.getCssValue("background-color");
			System.out.println("Color" + color);

			String style = driver
					.findElement(By.xpath("//button[@id='addNewRecordButton']"))
					.getCssValue("font-style");
			System.out.println("style" + style);

			String size = driver
					.findElement(By.xpath("//button[@id='addNewRecordButton']"))
					.getCssValue("font-size");
			System.out.println("size" + size);

		} finally {
			closeBrowser();
		}
	}
}