package com.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void beforeScenario() {
		System.out.println("******************Start********************");
		System.out.println("Before Execute");
	}
	@After
	public void afterScenario() {
		System.out.println("After Execute");
		System.out.println("*******************End********************");
	}
	
}
