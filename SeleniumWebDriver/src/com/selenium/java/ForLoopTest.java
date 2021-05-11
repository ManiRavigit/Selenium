package com.selenium.java;

public class ForLoopTest 
{

	public static void main(String[] args)
	{
		// Write a program to display "Welcome to Selenium" 20 times
		
		/*for (int i = 1; i <=20; i++) 
		{
			System.out.println(i+"   "+"Selenium");
		}*/
		
		/*for(int i=1;i<=10;i++)
		{
			System.out.println(1+"  x  "+i+"   =  "+1*i);
		}*/
		
		for (int i = 1; i <=10; i++)
		{
			
			for (int j = 1; j <=10; j++) 
			{
				System.out.println(i+"  x  "+j+"  =  "+i*j);
			}
		}
		
	}

}
