package com.selenium.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		//handling html pop up
		
		driver.findElement(By.id("corover-close-btn")).click();
		driver.findElement(By.xpath("//*[@id='bookingsForm']/div/div/div[2]/div[3]/button")).click();
	//Handling java Script alerts
		
		
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept();
		
		
		
	}

}
