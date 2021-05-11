package com.selenium.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest
{

	public static void main(String[] args) 
	{
		
		//ArrayList<String> l=new ArrayList<>();
		/*List<String> l=new ArrayList<>();
		l.add("Selenium");
		l.add("Training");
		l.add("Vasudeva");
		l.add("New item");
		
		System.out.println(l.size());
		
		for (int i = 0; i < l.size(); i++) 
		{
			System.out.println(l.get(i));
		}
		
		for (String item : l) 
		{
			System.out.println(item);
		}*/
		
		/*List<Integer> l=new ArrayList<>();
		
		l.add(12);
		l.add(11);
		
		for (Integer x : l)
		{
			System.out.println(x);
		}*/
		
		
		List<Object> l=new ArrayList<>();
		
		l.add("Selenium");
		l.add(12);
		l.add(12.52);
		l.add('A');
		System.out.println(l.size());
		
		for (Object item : l) 
		{
			System.out.println(item);
		}
		
		
	}

}
