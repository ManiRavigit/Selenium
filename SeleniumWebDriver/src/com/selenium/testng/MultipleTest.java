package com.selenium.testng;

import org.testng.annotations.Test;

public class MultipleTest 
{
	// Test Methods will be executed in alphabetical Order
	
	//Control the flow of executing in TestNG we use priority attributes
	@Test(enabled=false)
	public void appLaunch()
	{
		System.out.println("appLaunch");
	}
	
	@Test(dependsOnMethods="appLaunch")
	public void appLogin()
	{
		System.out.println("appLogin");
	}
	@Test(dependsOnMethods="appLogin")
	public void appLogout()
	{
		System.out.println("appLogout");
	}
	@Test(dependsOnMethods="appLogout")
	public void appClose()
	{
		System.out.println("appClose");
	}
	

}
