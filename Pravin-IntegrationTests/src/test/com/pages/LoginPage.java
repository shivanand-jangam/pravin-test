package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.CommonSeleniumUtils;

public class LoginPage extends CommonSeleniumUtils {

	// private String usernameInputField = "userName"; // String locator
	//
	// private By usernameInputFieldBy = By.id("userName"); // By Locator
	//
	// @FindBy(id = "userName")
	// private WebElement usetNameInputFieldWebelement; // WebElement
	//
	// public void locatorsusage() {
	// usetNameInputFieldWebelement.sendKeys("");// String locator
	// driver.findElement(usernameInputFieldBy).sendKeys(""); / By Locator
	// driver.findElement(By.id(usernameInputField)).sendKeys("");// By Locator
	// }

	@FindBy(id = "userName")
	private WebElement userNameInputField;

	@FindBy(id = "password")
	private WebElement passwordInputField;

	@FindBy(id = "login")
	private WebElement loginButton;

	public void openApplication(String url) {
		navigateTotheUrl(url);
	}

	public void enterUsername(String username) {
		userNameInputField.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordInputField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public void loginIntoTheApplication() {
		userNameInputField.sendKeys("");
		passwordInputField.sendKeys("");
		loginButton.click();
	}

	public void loginIntoTheApplication(String username, String password) {
		userNameInputField.sendKeys(username);
		passwordInputField.sendKeys(password);
		loginButton.click();
	}
}
