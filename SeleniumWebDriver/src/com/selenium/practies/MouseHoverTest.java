package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest 
{

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		WebElement signIn=driver.findElement(By.id("nav-link-accountList"));
		
		Actions  mouse=new Actions(driver);
		
		
		mouse.moveToElement(signIn).build().perform();
		
		//driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[3]/span")).click();


	}

}
