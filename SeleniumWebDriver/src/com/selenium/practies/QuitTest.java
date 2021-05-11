package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div/ul[1]/li[2]/a/div")).click();
		
		//driver.close();
		
		driver.quit();
		

	}

}
