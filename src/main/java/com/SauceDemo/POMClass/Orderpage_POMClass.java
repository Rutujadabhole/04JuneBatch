package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orderpage_POMClass {

	
	WebDriver driver;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	WebElement BackToHomeButton;
	
	public void clickBackToHomeButton()
	{
		BackToHomeButton.click();
	}
}
