package com.stepdefination;
import com.pages.ProfilePage;

import io.cucumber.java.en.*;

public class ProfilePageSetpdefination {

	ProfilePage profilePage= new ProfilePage();
	
	@Then("I should be redirected to the profile page")
	public void i_should_be_redirected_to_the_profile_page() {
		
	}

	@Then("I should see the {string} on the profile page.")
	public void i_should_see_the(String string) {
		
	}
	
}
