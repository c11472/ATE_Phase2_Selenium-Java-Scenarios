package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsKeyPress {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver wd = new ChromeDriver();

		wd.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// String expalt = "Please enter password";

		wd.findElement(By.id("login1")).sendKeys("1234566");
		Thread.sleep(3000);

		wd.findElement(By.id("login1")).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		wd.findElement(By.id("password")).sendKeys("1234566");

	}

}
