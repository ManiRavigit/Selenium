package com.selenium.java;

public class StringValidation {

	public static void main(String[] args) 
	{


		/*String data="Selenium";
		String data1="Selenium";
		
		//1. equals
		
		if(data.equals(data1))
		{
			System.out.println("both are equal");
		}else
		{
			System.out.println("both are not equal");
		}*/

		
		String data="Selenium Training";
		
		String data1="Vasudeva";
		
		if(data.contains(data1))
		{
			System.out.println("exist");
		}else
		{
			System.out.println("Not exist");
		}
	}

}
