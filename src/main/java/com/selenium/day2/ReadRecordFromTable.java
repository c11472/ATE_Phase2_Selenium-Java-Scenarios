package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadRecordFromTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		Thread.sleep(3000);

		String lxp = "/html/body/div[5]/div[1]/div[1]/div[3]/div/table/tbody/tr[2]/td[";
		String rxp = "]";
		String mxp;

		for (int i = 1; i <= 3; i++) {
			mxp = lxp + i + rxp;
			WebElement el1 = driver.findElement(By.xpath(mxp));
			System.out.println();
			System.out.println(el1.getText());

		}

	}

}
