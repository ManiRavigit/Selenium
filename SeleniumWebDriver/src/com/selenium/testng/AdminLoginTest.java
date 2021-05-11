package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminLoginTest
{
@Test
public void adminLogin() throws InterruptedException
{
	
	String username="Admin";
	String password;
	password="Qamerits123!@#";
	//AppLaunch
	
	System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://hrm.qamerits.com/symfony/web/index.php/auth/login");
	
	driver.manage().window().maximize();
	
	//validation
	
	Assert.assertTrue(driver.findElement(By.id("txtUsername")).isDisplayed());
	
	
	//AppLogin
	
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	
	driver.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);
	
	
	
	//AppLogout
	
	
	driver.findElement(By.id("welcome")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Logout")).click();
	
	
	//AppClose
	
	driver.close();
	
	
	
	
}
}
