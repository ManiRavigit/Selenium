package com.selenium.practies;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTest 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.ie.driver", "D:/SarojSelenium/SeleniumWebDriver/ExecutableFiles/IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("Http://Yahoo.com");

	}

}
