package com.SauceDemo.TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Onkar\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver14 = new FirefoxDriver();
		driver14.get("https://www.saucedemo.com/");
	}

}
