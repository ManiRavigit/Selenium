package com.selenium.methods;

public class SMethodsTest
{

	//1 static method with return type with parameters
	
	public static int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
	public static void main(String[] args)
	{
		//here no need to create an object
		
		//syntax
		
		//classname.methodname
		
		//SMethodsTest.add(20, 80);
		int res=SMethodsTest.add(20, 80);
		System.out.println(res);
	}
}
