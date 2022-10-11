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


  public class TC03_BagProductFunctionality extends TestBase_Class{
	
   @Test
	public  void BagProductFunctionality() throws IOException
	{
		//homePage
		//bag product
		HomePOMClass hp = new HomePOMClass(driver14);
		hp.clickBagButton();
		log.info("Bag product will get selected");
		
		ScreenshotClass.takeScreenshot(driver14);
		
		//validation
		String exceptedProduct = "1";
		
		String actualProduct = hp.getTextFromAddToCart();
		log.info("actual product->"+actualProduct);
		
		log.info("apply validation");
		
		
		Assert.assertEquals(exceptedProduct,actualProduct);
		

		
		
		
		
	}
}
