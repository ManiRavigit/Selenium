package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SarojSelenium\\SeleniumWebDriver\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
	//	WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select sl=new Select(driver.findElement(By.id("searchDropdownBox")));
		
		sl.selectByIndex(26);
		//sl.selectByIndex(23);
		
		//sl.selectByVisibleText("Baby");
		
		//sl.selectByValue("search-alias=amazon-devices");
		
		/*List<WebElement> slList=sl.getOptions();
		
		System.out.println(slList.size());
		
		for (WebElement element : slList)
		{
			System.out.println(element.getText());
		}*/
		
		//System.out.println(sl.isMultiple());
		
		//System.out.println(sl.getFirstSelectedOption().getText());
		
		/*List<WebElement> allSelect=sl.getAllSelectedOptions();
		
		System.out.println(allSelect.size());
		
		for (WebElement list : allSelect)
		{
			System.out.println(list.getText());
		}*/
		
		
	}

}
