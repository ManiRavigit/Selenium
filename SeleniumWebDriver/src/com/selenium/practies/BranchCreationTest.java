package com.selenium.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationTest 
{

	public static void main(String[] args) 
	{
		//AppLaunch
System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://primusbank.qedgetech.com/");
		
		driver.manage().window().maximize();
		
		//AppLogin
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		//BranchCreation
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		
		
		driver.findElement(By.id("BtnNewBR")).click();
		
		driver.findElement(By.id("txtbName")).sendKeys("Selenium789");
		driver.findElement(By.id("txtAdd1")).sendKeys("Ameerpet");
		driver.findElement(By.id("txtZip")).sendKeys("45612");
		
		
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		
		
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		
		
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		
		
		driver.findElement(By.id("btn_insert")).click();
		
		//Alert
		
		Alert al=driver.switchTo().alert();
		
		String msg=al.getText();
		
		al.accept();
		
		
		//validation
		
		
		if(msg.contains("created Sucessfully"))
		{
			System.out.println("Pass");
		}else if(msg.contains("already Exist"))
		{
			System.out.println("Fail");
		}else if(msg.contains("Please fill in"))
		{
			System.out.println("Warning");
		}

		
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		
		//AppLogout
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		
		//AppClose
		driver.close();
	}

}
