package Mtours_Scripts;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Register_Mtours {

	static Properties p1; // Properties instance
	static Properties p2;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");

		FileReader or = new FileReader("./ObjectReposmtours/data1.properties");

		FileReader td = new FileReader("./Testdatamtours/inputdata.properties");
		p1 = new Properties();
		p1.load(or);

		p2 = new Properties();
		p2.load(td);

		// Code for accepting attributes
		// Web elements

		WebElement s1 = driver.findElement(By.xpath(p1.getProperty("sel1")));
		WebElement usnm = driver.findElement(By.xpath(p1.getProperty("u1")));
		WebElement psnm = driver.findElement(By.xpath(p1.getProperty("p1")));
		WebElement cpsnm = driver.findElement(By.xpath(p1.getProperty("cp1")));

		Select select = new Select(s1);

		select.selectByVisibleText("ALGERIA");

		usnm.sendKeys(p2.getProperty("unm"));
		psnm.sendKeys(p2.getProperty("pwd"));
		cpsnm.sendKeys(p2.getProperty("cpwd"));

	}

}
