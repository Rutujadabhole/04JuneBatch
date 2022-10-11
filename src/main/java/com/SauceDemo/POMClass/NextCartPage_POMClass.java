package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextCartPage_POMClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-bolt-t-shirt']")
     WebElement SauceLabsBoltTShirt;
	
	public void clickSauceLabsBoltTShirt()
	{
		SauceLabsBoltTShirt.click();
	}
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-onesie']")
	WebElement SauceLabsOnesie;
	
	public void clickSauceLabsOnesie()
	{
		SauceLabsOnesie.click();
	}
	
	@FindBy(xpath="//button[@id='remove-test.allthethings()-t-shirt-(red)']")
	WebElement RedTShirt;
	
	public void clickRedTShirt()
	{
		RedTShirt.click();
	}
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	WebElement ContinueShopping;
	
	public void clickContinueShopping()
	{
		ContinueShopping.click();
	}
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement Checkout;
	
	public void clickCkeckout()
	{
		 Checkout.click();
	}
	
	public NextCartPage_POMClass(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

}
