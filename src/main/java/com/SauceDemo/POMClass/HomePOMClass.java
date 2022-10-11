package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMClass {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//button[@id = 'react-burger-menu-btn']")
	private WebElement menuButton;
     
	public void clickMenuButton()
	{
		menuButton.click();
	}
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	private WebElement logoutButton;
	
	public void clickLogOutButton()
	{
		logoutButton.click();
	}
	
	public HomePOMClass(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this );
	}
	
	//bag element
			@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
			private WebElement bagButton;
			
			public void clickBagButton()
			{
				bagButton.click();
			}
			
			//addToCart element
			@FindBy(xpath="//a[@class='shopping_cart_link']")
			private WebElement addToCart;
			
			public String getTextFromAddToCart()
			{
				String totalProducts = addToCart.getText();
				return totalProducts;
			}
	
	}
	
	
	
