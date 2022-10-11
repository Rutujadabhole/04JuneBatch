package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass {
   
	//driver declared
	private WebDriver driver;
	
	//element find
	@FindBy(xpath ="//input[@id='user-name']")
	private WebElement username;
	
	// create a method as per action on element
	//add action in that method
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath = "//input[@id='password']")
     private WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	 @FindBy(xpath = "//input[@id='login-button']")
	 private WebElement loginButton;
	 
	 public  void clickOnLoginButton()
	 {
		 loginButton.click();
	 }
	 
	 //create constructor
	 public LoginPOMClass(WebDriver driver)
	 {
		 this.driver=driver;
		 
		 //seleniumlass
		 PageFactory.initElements(driver, this);
	 }
	 
	
	 
	}

