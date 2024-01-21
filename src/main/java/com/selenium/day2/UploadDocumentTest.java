package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDocumentTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver wd = new ChromeDriver();
		wd.get("https://ps.uci.edu/~franklin/doc/file_upload.html");

		Thread.sleep(3000);

		wd.findElement(By.xpath("//input[@name=\"userfile\"]")).sendKeys("E://testout2.txt");

		Thread.sleep(3000);

	}

}
