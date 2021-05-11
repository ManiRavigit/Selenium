package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.quikr.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='searchedCat']")).click();
		
		
		
	//	WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		List<WebElement> dropList=driver.findElements(By.xpath("//div[@id='category-dropdown']/ul/li/a"));
		
		System.out.println(dropList.size());
		
		for (WebElement element : dropList)
		{
			System.out.println(element.getText());
		}

	}

}
