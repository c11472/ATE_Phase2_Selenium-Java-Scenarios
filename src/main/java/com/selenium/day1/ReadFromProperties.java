package com.selenium.day1;

import java.io.FileReader;
import java.util.Properties;

public class ReadFromProperties {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("./Testdatamtours/data1.properties");

		// Create object for Properties

		Properties p = new Properties();
		// Load the file pointer

		p.load(fr);

		System.out.println("User Name is " + " " + p.getProperty("unm"));

		System.out.println("Password id : " + " " + p.getProperty("pwd"));

		System.out.println("Confirmed password : " + " " + p.getProperty("cpwd"));

	}

}
