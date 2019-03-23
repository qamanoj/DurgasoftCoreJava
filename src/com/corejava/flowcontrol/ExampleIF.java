package com.corejava.flowcontrol;

public class ExampleIF 
{
	public static void main(String[] args)
	{
		int x=10;
		if(x==20)
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("hi");
		}
		System.out.println("**********");
		boolean b=false;
		if(b=true)
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("hi");
		}
		System.out.println("******");
		boolean b1=false;
		if(b1==true)
		{
			System.out.println("hello");
		} 
		else
		{
			System.out.println("hi");
		}
		System.out.println("*******");

		if(true)
			System.out.println("hello");

		System.out.println("********");
		
		
		if(true);//no o/p (Semicolon(;) is a valid java statement which is call empty statement and it won't
		//produce any output.)
		if(false);//no o/p
		
		if(true)
		{
			int x1=10;//no o/p
		}
		if(true)
		{
			System.out.println("hello");//dependent on if statement
			System.out.println("hii");//independent on if statement
		}
	}
}
