package com.alertFrameetx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.CommonSeleniumUtils;

public class FrameExample extends CommonSeleniumUtils {

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

			scrollIntoCenterview("//span[text()='Frames']"); // Scroll using
																// xpath
			driver.findElement(By.xpath("//span[text()='Frames']")).click();
			waitForElement(2);

			WebElement frameElementElement = driver
					.findElement(By.xpath("//iframe[@id='frame1']"));

			driver.switchTo().frame(frameElementElement);

			// driver.switchTo().frame("frame1");

			scrollIntoCenterview(By.id("sampleHeading"));
			String text = driver.findElement(By.id("sampleHeading")).getText();
			waitForElement(2);
			System.out.println(text);
			
			driver.switchTo().defaultContent();

			String width = driver.findElement(By.id("frame2"))
					.getAttribute("width");
			System.out.println(width);
			
			driver.switchTo().frame("frame2");
			driver.switchTo().defaultContent();
			driver.switchTo().frame("frame1");
			
			driver.switchTo().parentFrame();
			
			
		} finally {
			closeBrowser();
		}
	}

}
