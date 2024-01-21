package com.selenium.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandel {
	public static void main(String args[]) throws InterruptedException {
		WebDriver wd = new ChromeDriver();

		wd.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// String expalt = "Please enter password";

		wd.findElement(By.id("login1")).sendKeys("1234566");
		wd.findElement(By.name("proceed")).click();

		Alert al = wd.switchTo().alert();

		String altactmsg = al.getText();

		System.out.println(altactmsg);
		/*
		 * if (expalt.equals(altactmsg)) { System.out.println("Correct popup message");
		 * } else { System.out.println("Modify the message"); }
		 */
		Thread.sleep(3000);
		// accept the alert window
		al.accept();
		wd.findElement(By.id("password")).sendKeys("1234566");

	}

}
