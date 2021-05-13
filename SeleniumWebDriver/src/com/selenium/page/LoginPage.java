package com.selenium.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{

	@FindBy(id="txtuId")
	WebElement username;//page object
	
	@FindBy(id="txtPword")
	WebElement password;
	
	
	@FindBy(id="login")
	WebElement login;
	
	
	
	//method
	
	public void adminLogin()
	{
		username.sendKeys("Admin");
		password.sendKeys("Admin");
		login.click();
		
	}
	}
