package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver wd = new ChromeDriver();

		wd.get("https://jqueryui.com/droppable/");

		wd.switchTo().frame(0); // we are in frame

		WebElement src = wd.findElement(By.id("draggable"));

		String val1 = src.getText();
		System.out.println(val1);

		WebElement dest = wd.findElement(By.id("droppable"));
		String val2 = dest.getText();
		System.out.println(val2);
		Thread.sleep(3000);
		Actions act = new Actions(wd);
		act.clickAndHold(src).moveToElement(dest).release().build().perform();

	}

}
