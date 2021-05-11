package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTest1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://Amazon.in");
		
		driver.manage().window().maximize();
		
		List<WebElement>  links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			//capturing all the link names
			//System.out.println(links.get(i).getText());
			
			//capture the links which is having text 
			/*if(!links.get(i).getText().isEmpty())
			{
				System.out.println(links.get(i).getText());
			}*/
			
			//select/click on specific link
			
			if(links.get(i).getText().equals("Today's Deals"))
			{
				links.get(i).click();
			}
		}
	}

}
