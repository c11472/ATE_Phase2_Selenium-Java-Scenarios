package com.seleniumday3.ByClassDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script1 {
	static pageclass1 test1;

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		test1 = new pageclass1();
		test1.initdriver1(driver);
		test1.Launch_AUT(driver);
		test1.Enter_From_City(driver);

	}

}
