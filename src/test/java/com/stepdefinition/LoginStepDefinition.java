package com.stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	@Given("User is on Login Page")
	public void user_is_on_Login_Page() {
	    System.out.println("Start with    ------ Given");
	}

	@When("Enter the {string} and {string}")
	public void enter_the_and(String string, String string2) {
		System.out.println("Valid password ------ When");
        System.out.println("Username : "+string);
        System.out.println("Password : "+string2);
	    
	}
	/*@When("Enter the Username and Password")
	public void enter_the_Username_and_Password() {
	    System.out.println("When");
	}*/

	@And("Click the login button")
	public void click_the_login_button() {
	   System.out.println("Click the Loginbtn --- And");    
	}

	@Then("User is navigate on home page")
	public void user_is_navigate_on_home_page() {
	    System.out.println("Endswith    --------- Then");
	    System.out.println("***********");
	}



}
