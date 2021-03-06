package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		List<WebElement> dropList=drop.findElements(By.tagName("option"));
		
		System.out.println(dropList.size());
		
		for (int i = 0; i < dropList.size(); i++) 
		{
			dropList.get(i).click();
			//validation
			
			if(dropList.get(i).isSelected())
			{
				System.out.println(dropList.get(i).getText()+" : is selected");
			}else
			{
				System.out.println(dropList.get(i).getText()+" : is not  selected");
			}
		}

	}

}
