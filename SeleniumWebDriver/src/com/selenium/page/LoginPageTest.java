package com.selenium.page;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		
		LoginPage page1=PageFactory.initElements(driver, LoginPage.class);
		
		page1.adminLogin();

	}

}
