package com.selenium.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BranchCreation extends PrimusBank
{
@Test(dataProvider="getData")
public void branchCreation(String bName,String add1)
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
	
	
	
	driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	
}


@DataProvider

public Object[][] getData()
{
	
	Object [] [] data=new Object[2][2];
	
	data[0][0]="Selenium1234";
	data[0][1]="Madhapur";
	data[1][0]="Selenium1235";
	data[1][1]="Madhapur";
	return data;
}
}
