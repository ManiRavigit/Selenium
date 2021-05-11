package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest
{

	public static void main(String[] args) 
	{

		String searchText="Harry Potter";
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://Amazon.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchText);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.close();

	}

}
