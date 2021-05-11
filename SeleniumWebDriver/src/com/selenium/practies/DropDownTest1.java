package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest1 
{

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.shadi.com/");
		
		driver.manage().window().maximize();
		
		WebElement month=driver.findElement(By.id("dob_m"));
		
		List<WebElement> monthList=month.findElements(By.tagName("option"));
		System.out.println(monthList.size());
		
		for (int i = 0; i < monthList.size(); i++) 
		{
			//System.out.println(monthList.get(i).getText());
			
			if(monthList.get(i).getText().equals("Jun"))
			{
				monthList.get(i).click();
			}
		}

	}

}
