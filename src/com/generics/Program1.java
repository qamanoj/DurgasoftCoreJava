package com.generics;

import java.util.ArrayList;

public class Program1
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add("manoj");
		a.add("kumar");
		a.add("sahoo");
		a.add("litu");
		a.add(new Integer(10));
		System.out.println(a);
		String s=(String)a.get(0);
		String s1=(String)a.get(1);
		String s2=(String)a.get(2);
		String s3=(String)a.get(3);
		//String s3=(String)a.get(4);//cte
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	
	
}
