package com.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineExample {

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		System.out.println("User Navigated to login page");
	}

	//(.*)
	// {string}
	@When("User enter user name as {string}")
	public void user_enter_user_name_as_manager(String username) {
		System.out.println("Entered user name as: " + username);
	}

	@When("User enter password as {string}")
	public void user_enter_password_as_password123(String password) {
		System.out.println("Entered user name as: " + password);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {

	}

	@Then("Verify user is navigated to Home page")
	public void verify_user_is_navigated_to_home_page() {

	}

	@Then("Verify User is able to see {string}")
	public void verify_user_is_able_to_see_manager_menu_option(String menu) {
		System.out.println("Verified menu as : " + menu);

	}

}
