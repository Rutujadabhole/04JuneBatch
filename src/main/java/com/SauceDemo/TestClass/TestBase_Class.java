package com.SauceDemo.TestClass;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClass.LoginPOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TestBase_Class {
	
	WebDriver driver14 ;
	Logger log =Logger.getLogger("Maven_SauceDemoProject");
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp (String browserName)
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe\\" );
		 driver14 = new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Onkar\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver14 = new FirefoxDriver();
		}
		else
		{
			System.out.println("exceptionshown");
		}
		
		
		PropertyConfigurator.configure("log4j.properties");
		
			log.info("browser is opened");
		
		driver14.manage().window().maximize();
		log.info("browser is maximized");
		driver14.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		driver14.get("https://www.saucedemo.com/");
		log.info("SauceDemo URL is opened");
	//	ScreenshotClass.takeScreenshot(driver14);
		
		//loginPage elements find and action perform
		LoginPOMClass x = new LoginPOMClass(driver14);
		
		x.sendUsername();
		log.info("username is entered");
		
		x.sendPassword();
		log.info("password is enetred");
		
		x.clickOnLoginButton();
		log.info("Click on login button");
	}

	@AfterMethod
	public void teardown()
	{
		driver14.quit();
		log.info("browser is closed");
		log.info("end of program");	
	}
}
