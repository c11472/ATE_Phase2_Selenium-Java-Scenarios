package com.seleniumday3.ByClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// //input[@id='src']
		//// input[@id='dest']
		driver.get("https://www.redbus.in/");

		By el1 = By.xpath("//input[@id='src']");

		By el12 = By.xpath("//input[@id='dest']");

		driver.findElement(el1).sendKeys("Bhubaneswar");

		driver.findElement(el12).sendKeys("Cuttack");

	}

}
