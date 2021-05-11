package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadiTest 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.shadi.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("first_name")).sendKeys("Selenium");
		
		driver.findElement(By.name("last_name")).sendKeys("Training");
		
		
		

	}

}
