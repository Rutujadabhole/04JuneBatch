package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.LoginPOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TC01_LoginFunctionality extends TestBase_Class{
	
 @Test
	public  void method1() throws IOException 
	{

		//Home Page
		ScreenshotClass.takeScreenshot(driver14);
		
	
		
		log.info("apply the validation");
		String expectedTilte = "Swag Labs";
		String actualTitle = driver14.getTitle();
		
		Assert.assertEquals(expectedTilte,actualTitle);
		
		
		}
		
		 
		}
		
		
		
		
		
	

