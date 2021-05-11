package com.selenium.methods;

public class NMethodsTest
{

/*//1 method with return type with parameters
	
	public int add(int a,int b)
	{
		int sum=a+b;
		
		return sum;
	}*/
	
	/*//2 method with return type with out parameters
	
		public int add()
		{
			int a=20;
			int b=30;
			int sum=a+b;
			
			return sum;
		}
	*/
	/*//3 method with out return type with parameters
	
			public void add(int a,int b)
			{
				
				int sum=a+b;
				
				System.out.println(sum);
			}*/
		
	//4 method with return type with out parameters
	
			public void add()
			{
				int a=20;
				int b=30;
				int sum=a+b;
				
				System.out.println(sum);
			}
		
	public static void main(String[] args)
	{
		
		//create an object ref
		
		NMethodsTest v=new NMethodsTest();
		
		//v.add(20, 30);//calling a method with method name,it won't return a value
		
		//int res=v.add(10,30);//calling a method with variable,it will return a value
		
		//System.out.println(res);
		
		//int res=v.add();
		
		//System.out.println(res);
		
		//v.add(10, 10);
		//v.add();
	}
}
