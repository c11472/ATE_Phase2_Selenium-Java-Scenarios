package com.selenium.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		// Chechk searchbox
		Thread.sleep(2000);

		driver.findElement(By.name("q")).sendKeys("c programming book"); // Hard-coded data

		Thread.sleep(3000);
		
		WebElement el1 = driver.findElement(By.xpath("//input[@name="q"));

		List<WebElement> options = driver.findElements(
				By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div/ul/li"));

		System.out.println(options.size()); // 10

		for (int i = 0; i <= options.size() - 1; i++) {
			Thread.sleep(1000);
			System.out.println();
			System.out.println(options.get(i).getText());

			
		}

		Thread.sleep(3000);
		// validate for one single item

	}

}
