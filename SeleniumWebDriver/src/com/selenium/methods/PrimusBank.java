package com.selenium.methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBank
{
	//Global Variable 
	ChromeDriver driver;
	String res;
	
	
	//AppLaunch
	
	public String appLaunch(String url)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		//validating
		if(driver.findElement(By.id("txtuId")).isDisplayed())
		{
			//System.out.println("PASS");
			
			res="Pass";
		}else
		{
			//System.out.println("FAIL");
			res="Fail";
		}
		
		return res;
		
	}
	
	//AppLogin
	
	public String appLogin(String username,String password)
	{
		driver.findElement(By.id("txtuId")).sendKeys(username);
		driver.findElement(By.id("txtPword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		//validation
		if(driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
		{
			//System.out.println("PASS");
			
			res="Pass";
		}else
		{
			//System.out.println("FAIL");
			res="Fail";
		}
		
		return res;
		
	}
	
	//BranchCreation
	
	public String branchCreation(String bName,String add1)
	{
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		
		
		driver.findElement(By.id("BtnNewBR")).click();
		
		driver.findElement(By.id("txtbName")).sendKeys(bName);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
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
			//System.out.println("Pass");
			res="Pass";
		}else if(msg.contains("already Exist"))
		{
			//System.out.println("Fail");
			res="Fail";
		}else if(msg.contains("Please fill in"))
		{
			//System.out.println("Warning");
			res="Warning";
		}

		
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		return res;
	}
	//AppLogout
	
	public String appLogout()
	{
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		//validating
				if(driver.findElement(By.id("txtuId")).isDisplayed())
				{
					//System.out.println("PASS");
					
					res="Pass";
				}else
				{
					//System.out.println("FAIL");
					res="Fail";
				}
				
				return res;
	}
	
	//AppClose
	
	public void appClose()
	{
		driver.close();
	}
	
	
	
	public static void main(String[] args)
	{
		PrimusBank app=new PrimusBank();
		
		//modularity framework
		
		//Check url
		
		app.appLaunch("Http://Primusbank.qedgetech.com");
		
		app.appClose();
		
		//check appLogin
		
		app.appLaunch("Http://Primusbank.qedgetech.com");
		app.appLogin("Admin", "Admin");
		app.appLogout();
		app.appClose();
		
		//Check Branchcreation
		
		app.appLaunch("Http://Primusbank.qedgetech.com");
		app.appLogin("Admin", "Admin");
		app.branchCreation("Selenium4323", "Ameerpet");
		app.appLogout();
		app.appClose();
		
		
	
	}
	
}
