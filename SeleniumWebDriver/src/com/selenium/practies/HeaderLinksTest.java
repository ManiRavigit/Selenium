package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLinksTest {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method 
	System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//identify the header & stored in webelement
		
		//WebElement header=driver.findElement(By.id("nav-xshop"));
		
		//under the header find all the links
		
		List<WebElement> headerLinks=driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		
		System.out.println(headerLinks.size());
		
		for (WebElement element : headerLinks)
		{
			System.out.println(element.getText());
		}

	}

}
