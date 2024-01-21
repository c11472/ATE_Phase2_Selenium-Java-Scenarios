package com.selenium.day1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionFromList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.guru99.com/test/newtours/register.php");
		// Locate the element

		Select sel = new Select(wd.findElement(By.xpath("//select[@name=\"country\"]")));
		// sel = (Select) wd.findElement(By.xpath("//select[@name=\"country\"]"));
		Thread.sleep(2000);
		// sel.selectByIndex(5);
		// sel.selectByVisibleText("AUSTRIA");
		sel.selectByValue("AMERICAN SAMOA");

		ArrayList<WebElement> sel1 = (ArrayList<WebElement>) sel.getOptions();
		Thread.sleep(200);
		// Traverse the list
		int countelements = sel1.size();

		for (int i = 0; i <= countelements; i++) {
			String options = sel1.get(i).getText();
			System.out.println(options);
		}
	}

}
