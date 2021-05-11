package com.selenium.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetTest
{

	public static void main(String[] args)
	{
		
		//ArrayList<String> l=new ArrayList<>();
		//List<String> l=new ArrayList<>();
		
		//HashSet<String> h=new HashSet<>();
		Set<String> h=new HashSet<>();
		
		h.add("Selenium");
		
		h.add("VasuDeva");
		
		h.add("Training");
		
		h.add("Selenium");
		
		System.out.println(h.size());
		
		/*for (String item : h) 
		{
		System.out.println(item);	
		}
*/
		
		Iterator<String> it=h.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
