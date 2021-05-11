package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("Http://Amazon.in");
		
		driver.manage().window().maximize();
		
		//validation
		
		
		
		
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		System.out.println(driver.getTitle());
		
		//navigate back
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		//navigate forward
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		
		

	}

}
