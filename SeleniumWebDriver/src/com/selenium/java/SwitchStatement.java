package com.selenium.java;

public class SwitchStatement
{

	public static void main(String[] args)
	{
		
		/*int i=2;
		
		switch(i)
		{
		
		case 1:
			System.out.println("Vasu");
			break;
		case 2: 
			System.out.println("deva");
			break;
		case 3:
			System.out.println("Java");
			break;
			default:
				System.out.println("None of the above");
			
		}*/
		
		/*int i=2;
		
		if(i==1)
		{
			System.out.println("1");
		}
		if(i==2)
		{
			System.out.println("2");
		}
		if(i==3)

		{
			System.out.println("3");
		}*/
		
		String n="wednesday";
		
		switch(n)
		{
		case "sunday":
			System.out.println("1");
			break;
		case "Monday":
			System.out.println("2");
			break;
		case "Tuesday":
			System.out.println("3");
			break;
		case "wednesday":
			System.out.println("4");
			break;
		/*case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;*/
			
			default:
				System.out.println("Out of range");
		}
	}

}
