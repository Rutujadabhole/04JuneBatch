package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_to_cart_POMClass {
	
	WebDriver driver;
	//1.
	@FindBy(xpath="//button[@class='btn btn_secondary btn_small btn_inventory']")
     WebElement SauceLabsBackpack; 
	
	public void clickSauceLabsBackpack()
	{
		SauceLabsBackpack.click();
	}
	
	//2.
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement SauceLabsBikeLight;
	
	public void clickSauceLabsBikeLight()
	{
		SauceLabsBikeLight.click();
	}
	
	//3.
	@FindBy(xpath="//button[@id='remove-sauce-labs-bolt-t-shirt']")
	WebElement SauceLabsBoltTShirt;
	
	public void clickSauceLabsBoltTShirt()
	{
		SauceLabsBoltTShirt.click();
	}
	
	//4.
	@FindBy(xpath="//button[@id='remove-sauce-labs-fleece-jacket']")
	WebElement SauceLabsFleeceJacket;
	
	public void clickSauceLabsFleeceJacket()
	{
		SauceLabsFleeceJacket.click();
	}
	
	//5.
	@FindBy(xpath="//button[@id='remove-sauce-labs-onesie']")
	WebElement SauceLabsOnesie;
	
	public void clickSauceLabsOnesie()
	{
		SauceLabsOnesie.click();
	}
	
	//6.
	@FindBy(xpath="//button[@id='remove-test.allthethings()-t-shirt-(red)']")
	WebElement RedTShirt;
	
	public void clickRedTShirt()
	{
		RedTShirt.click();
	}
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement MenuButton;
	
	public void clickMenuButton()
	{
		MenuButton.click();
	}
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	WebElement AboutButton;
	
	public void clickAboutButton()
	{
		 AboutButton.click();
	}
	 
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement LogoutButton;
	
	public void clickLogoutButton()
	{
		 LogoutButton.click();
	}
	
	public Add_to_cart_POMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this );
	}
	
	
}
