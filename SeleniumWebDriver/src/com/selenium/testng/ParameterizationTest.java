package com.selenium.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationTest 
{

	@Test(dataProvider="getData")
	public void login(String username,String pwd,String vasu)
	{
		
		System.out.println("Username is : "+username);
		System.out.println("password is : "+pwd);
		System.out.println("vasu :"+vasu);
	}

	
	
	@DataProvider
	
	public Object[][] getData()
	{
		
		Object [] [] data=new Object[2][3];
		
		data[0][0]="Selenium1";
		data[0][1]="Training1";
		data[0][2]="Selenium2";
		data[1][0]="Selenium1";
		data[1][1]="Training1";
		data[1][2]="Selenium2";
		
		
		return data;
	}
}
