package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChainActionsTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://ceotelangana.nic.in/ceo_old/Forms.aspx");
		
		driver.manage().window().maximize();
		
		WebElement erg=driver.findElement(By.xpath("//*[@id='body1']/tbody/tr[2]/td/table/tbody/tr[3]/td/div/div[2]/div[1]"));
		
		WebElement asm=driver.findElement(By.xpath("//*[@id='body1']/tbody/tr[2]/td/table/tbody/tr[3]/td/div/div[2]/div[2]/div[1]/ul/li/a"));
		
		WebElement tys=driver.findElement(By.xpath("//*[@id='body1']/tbody/tr[2]/td/table/tbody/tr[3]/td/div/div[2]/div[2]/div[1]/ul/li/ul/li[7]/a"));
		
		
		Actions chain=new Actions(driver);
		
		chain.moveToElement(erg).moveToElement(asm).pause(2000).moveToElement(tys).click().build().perform();

	}

}
