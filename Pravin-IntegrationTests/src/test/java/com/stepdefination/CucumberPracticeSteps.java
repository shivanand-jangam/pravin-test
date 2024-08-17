package com.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberPracticeSteps {

	@Given("I am on the login page2")
	public void i_am_on_the_login_page2() {
		System.out.println("************** Background starts here **************");
//		System.out.println("@Given(\"I am on the login page2\")<==============");
	}

	@When("I enter a valid username2 as {string}")
	public void i_enter_a_valid_username2_as(String string) {
//		System.out.println("@When(\"I enter a valid username2 as {string}\")<==============");
	}

	@When("I enter a valid password2 {string}")
	public void i_enter_a_valid_password2(String string) {
//		System.out.println("@When(\"I enter a valid password2 {string}\")<==============");
	}

	@When("I click the login button2")
	public void i_click_the_login_button2() {
//		System.out.println("@When(\"I click the login button2\")<==============");
		System.out.println("************** Background ENDS here **************");
	}

	@Then("I should be redirected to the profile page2")
	public void i_should_be_redirected_to_the_profile_page2() {
		System.out.println("@Then(\"I should be redirected to the profile page2\")<==============");
	}

	@Then("I should see the {string} on the profile page2")
	public void i_should_see_the_on_the_profile_page2(String string) {
		System.out.println("@Then(\"I should see the {string} on the profile page2\")<==============");
	}

}
