package com.selenium.practies;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderLinksTest
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method 
	System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait myWait=new WebDriverWait(driver, 20);
		
		
		
	//	Thread.sleep(2000);//wait
		
		//identify the header & stored in webelement
		
		//WebElement header=driver.findElement(By.id("nav-xshop"));
		
		//under the header find all the links
		
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='nav-xshop']/a")));
		
		List<WebElement> headerLinks=driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		
		System.out.println(headerLinks.size());
		
		for (WebElement element : headerLinks)
		{
			System.out.println(element.getText());
		}

	}

}
