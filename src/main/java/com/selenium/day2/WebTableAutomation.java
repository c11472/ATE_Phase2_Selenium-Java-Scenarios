package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAutomation {

	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		Thread.sleep(3000);

		String lxp = "/html/body/div[5]/div[1]/div[1]/div[3]/div/table/tbody/tr[";
		String rxp = "]/td[1]";
		String mxp;

		for (int i = 2; i <= 6; i++) {
			WebElement el = driver.findElement(By.xpath(lxp + i + rxp));
			String data = el.getText();
			System.out.println();
			System.out.println(data);

		}
	}

}
