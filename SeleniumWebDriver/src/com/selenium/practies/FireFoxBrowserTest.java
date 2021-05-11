package com.selenium.practies;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest 
{

	public static void main(String[] args) 
	{
		// Launching Firefox and navigate to google page
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("Http://Google.co.in");

	}

}
