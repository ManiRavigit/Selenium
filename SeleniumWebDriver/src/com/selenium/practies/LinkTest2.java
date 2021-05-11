package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://Google.co.in");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		/*for (WebElement element : links) 
		{
		//	System.out.println(element.getText());
			
			if(!element.getText().isEmpty())
			{
				System.out.println(element.getText());
			}
			
			if(element.getText().equals("Images"))
			{
				element.click();
			}
		}
*/
	}

}
