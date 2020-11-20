package com.stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login3 {


	@Given("User is on Login URL")
	public void user_is_on_Login_URL() {
	    System.out.println("3rd Scenario User is on Login URL**********given" );
	}

	@And("Enter the invalid Username and Password")
	public void enter_the_invalid_Username_and_Password() {
	    System.out.println("Enter the invalid Username and Password ****And");
	}

	@Then("User is on navigate  home page")
	public void user_is_on_navigate_home_page() {
	    System.out.println("User is on navigate home page    ******then");
	}

}
