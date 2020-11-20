package com.stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login2 {
	@Given("User is Login Page")
	public void user_is_Login_Page() {
	   System.out.println("2nd Scenario User is LoginPage ** Given");
	}

	@And("Enter the valid Username and Password")
	public void enter_the_valid_Username_and_Password(io.cucumber.datatable.DataTable data) {
	   System.out.println("Username : "+data.asList().get(1));
	   System.out.println("Password : "+data.asList().get(0));
		
	}

	@Then("User is navigate home page")
	public void user_is_navigate_home_page() {
	    System.out.println("User is navigate home page **** Then");    
	}


}
