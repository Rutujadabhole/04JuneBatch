package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutinfo_POMClass {

	WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement Firstname;
	
	public void clickFirstname()
	{
		Firstname.click();
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement Lastname;
	
	public void clickLastname()
	{
		Lastname.click();
	}
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement Postalcode;
	
	public void clickPostalcode()
	{
		Postalcode.click();
	}
	
	@FindBy(xpath="//button[@id='cancel']")
	WebElement Cancelbutton;
	
	public void clickCancelbutton()
	{
		Cancelbutton.click();
	}
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement Continuebutton;
	
	public void clickCintinuebutton()
	{
		Continuebutton.click();
	}
	
	public Checkoutinfo_POMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
}
