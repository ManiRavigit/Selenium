package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglTest
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://Google.co.in");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Gmail")).click();
		
		//driver.findElement(By.className("gb_g")).click();
		
		
		
		//System.out.println(driver.getTitle());
		
		//System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		driver.close();

	}

}
