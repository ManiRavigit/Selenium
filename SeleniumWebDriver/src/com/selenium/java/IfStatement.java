package com.selenium.java;

import java.util.Scanner;

public class IfStatement
{

	public static void main(String[] args)
	{
		
		//write a program to check the given no is even/odd
		
		//int n=89;
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Even");
		}else
		{
			System.out.println("Odd");
		}
	}

}
