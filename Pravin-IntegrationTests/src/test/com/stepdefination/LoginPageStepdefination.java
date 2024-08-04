package com.stepdefination;

import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepdefination {

	LoginPage loginPage = new LoginPage();

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		loginPage.openApplication("https://demoqa.com/");
	}

	@When("I enter a valid username as {string}")
	public void i_enter_a_valid_username_as(String username) {
		loginPage.enterUsername(username);
	}

	@When("I enter a valid password {string}")
	public void i_enter_a_valid_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		loginPage.clickOnLoginButton();
	}

	@When("I enter an invalid username and password")
	public void i_enter_an_invalid_username_and_password() {
	}

	@Then("I should see an error message")
	public void i_should_see_an_error_message() {
	}

	@When("I leave the username field empty")
	public void i_leave_the_username_field_empty() {
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
	}

	@Then("I should see an error message indicating the username is required")
	public void i_should_see_an_error_message_indicating_the_username_is_required() {
	}

	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
	}

	@When("I leave the password field empty")
	public void i_leave_the_password_field_empty() {
	}

	@Then("I should see an error message indicating the password is required")
	public void i_should_see_an_error_message_indicating_the_password_is_required() {

	}

	@When("I enter a valid {string}")
	public void i_enter_a_valid(String username) {
	}

}
