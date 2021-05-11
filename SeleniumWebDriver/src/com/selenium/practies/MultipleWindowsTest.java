package com.selenium.practies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsTest
{

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		Set<String> windows=driver.getWindowHandles();
		
		System.out.println(windows.size());
		
		/*for (String child : windows)
		{
			
			//capture all the window ids
			//System.out.println(child);
			
			//Give the control to Specific window
			
			driver.switchTo().window(child);
			
			//cpature titile of the window
			
			System.out.println(driver.getTitle());
			
			//close the window
			
			//driver.close();
			
			if(!driver.getTitle().equals("Prokarma"))
			{
				driver.close();
			}
			
		}*/
		
		/*Iterator<String> it=windows.iterator();
		
		
		while(it.hasNext())
		{
			//System.out.println(it.next().toString());
			
			driver.switchTo().window(it.next().toString());
			System.out.println(driver.getTitle());
			driver.close();
			
			
		}*/
		
		List<String> tabs=new ArrayList(windows);
		
		driver.switchTo().window(tabs.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(tabs.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(tabs.get(2));
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(tabs.get(3));
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
