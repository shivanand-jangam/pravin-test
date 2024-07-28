package com.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonSeleniumUtils {

	public WebDriver driver;

	public void openBrowser() {
		// Set up WebDriverManager to handle the ChromeDriver setup
		WebDriverManager.chromedriver().setup();

		// Set up Chrome options
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");

		// Initialize WebDriver
		driver = new ChromeDriver(options);
	}

	public void navigateTotheUrl() {
		driver.get("https://demoqa.com/");
		waitForElement(3);
	}

	public void closeBrowser() {
		driver.quit();
	}

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
