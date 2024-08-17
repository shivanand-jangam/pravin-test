package com.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonSeleniumUtils extends BrowserFactory {

	public static void waitForElement(int sec) {
		try {
			Thread.sleep(1000 * sec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void scrollIntoCenterview(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void scrollIntoCenterview(By id) {
		WebElement element2 = driver.findElement(id);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element2);
	}

	public void scrollIntoCenterview(String xpath) {
		WebElement element2 = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element2);
	}

	public void clickUsingJs(String xpath) {
		WebElement impressiveRadioButton = driver.findElement(By.xpath(xpath));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", impressiveRadioButton);
	}

	public void setImplicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public WebElement explicitWaitElementToBeClickable(By location,
			int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,
				Duration.ofSeconds(timeout));

		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(location));
		return element;
	}
}
