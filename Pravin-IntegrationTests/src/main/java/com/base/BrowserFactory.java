package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	public WebDriver driver;

	public void openBrowser() {
		// Set up WebDriverManager to handle the ChromeDriver setup
		WebDriverManager.chromedriver().setup();

		// Set up Chrome options
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		// options.addArguments("--headless");
		// options.addArguments("--window-size=1920,1080");
		// Initialize WebDriver
		driver = new ChromeDriver(options);
		navigateTotheUrl("https://demoqa.com/");
	}

	public void navigateTotheUrl(String url) {
		driver.get(url);
	}

	public void navigateTotheUrl() {
		driver.get("https://demoqa.com/");
	}

	public void closeBrowser() {
		driver.quit();
	}

}
