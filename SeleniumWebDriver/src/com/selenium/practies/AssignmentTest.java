package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.shadi.com/");
		
		driver.manage().window().maximize();
		
		//month
	//	Select month=new Select(driver.findElement(By.id("dob_m")));
	//	month.selectByIndex(5);
		//or
		driver.findElement(By.id("dob_m")).sendKeys("Aug");
		//Day
		
		Select day=new Select(driver.findElement(By.id("dob_d")));
		day.selectByIndex(6);
		
		//year
		
		Select year=new Select(driver.findElement(By.id("dob_y")));
		year.selectByIndex(7);

	}

}
