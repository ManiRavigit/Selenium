package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginTest
{

	public static void main(String[] args) throws Exception
	{
		
		//String username;
		//username="Admin";
		
		String username="Admin";
		String password;
		password="Qamerits123!@#";
		//AppLaunch
		
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://hrm.qamerits.com/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		//validation
		
		if(driver.findElement(By.id("txtUsername")).isDisplayed())
		{
			System.out.println("AppLaunch Pass");
		}else
		{
			System.out.println("AppLaunch Fail");
		}
		
		
		
		//AppLogin
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		driver.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);
		
		//validation
		
		if(driver.findElement(By.id("welcome")).isDisplayed())
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		
		
		//AppLogout
		
		
		driver.findElement(By.id("welcome")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		//validation
		
		if(driver.findElement(By.id("txtUsername")).isDisplayed())
		{
			System.out.println("AppLogout Pass");
		}else
		{
			System.out.println("AppLogout Fail");
		}
		
		//AppClose
		
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
