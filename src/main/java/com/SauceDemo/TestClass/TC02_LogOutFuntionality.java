package com.SauceDemo.TestClass;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePOMClass;
import com.SauceDemo.POMClass.LoginPOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;



public class TC02_LogOutFuntionality extends TestBase_Class{
	@Test
	public  void LogOutFuntionality() throws IOException
	{
		
	
		HomePOMClass b = new HomePOMClass(driver14);
		b.clickMenuButton();
		log.info("clicked on menu button");
		
		b.clickLogOutButton();
		log.info("clicked on logout button");
		
		ScreenshotClass.takeScreenshot(driver14);
		
		//login page
		log.info("apply the validation");
		String expectedTitle = "Swag Labs";
		String actualTitle = driver14.getTitle();
		 
		
		Assert.assertEquals(expectedTitle,actualTitle);
		 }
	
		 }
		 
		
	

	
