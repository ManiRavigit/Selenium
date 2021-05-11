package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
		
		
		
		//validation
		
		if(driver.findElement(By.id("remember")).isSelected())
		{
			driver.findElement(By.id("remember")).click();
			
			System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
		}

	}

}
