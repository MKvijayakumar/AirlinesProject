package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {

	public void getUrl() {
		System.setProperty("weebdriver.chrome.driver", "");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.facebook.com//");
		System.out.println(drive.getCurrentUrl());
		System.out.println(drive.getTitle());

	}
	
	
	
}
