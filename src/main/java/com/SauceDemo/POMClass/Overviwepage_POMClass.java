package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Overviwepage_POMClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//button[@id='finish']")
	WebElement Finishbutton;
	
	public void clickFinishbutton()
	{
		Finishbutton.click();
	}
	
	
	@FindBy(xpath="/button[@id='cancel']")
	WebElement Cancelbutton;
	
	public void clickCancelbutton()
	{
		Cancelbutton.click();
	}
	
	
	
}
