package com.seleniumday3.ByClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageclass1 {

	// Declare the webDriver

	WebDriver driver;

	// By elements

	By el1 = By.xpath("//input[@id='src']");

	By el12 = By.xpath("//input[@id='dest']");

	// initialization of the driver

	public void initdriver1(WebDriver driver) {
		this.driver = driver;

	}

	// Core automation test methods
	// launch app
	public void Launch_AUT(WebDriver driver) {
		driver.get("https://www.redbus.in/");
		// validations missing
	}

	// Enter from city
	public void Enter_From_City(WebDriver driver) {
		driver.findElement(el1).sendKeys("Bhubaneswar");

	}

}
