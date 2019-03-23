package com.oops;

public class Static 
{
	static int i=10;
	static
	{
		m();
		System.out.println("first static block");
	}
	public static void main(String[] args) 
	{
		m();
		System.out.println("main method");
	}
	public static void m()
	{
		System.out.println(j);
	}
	static 
	{
		System.out.println("second static block");
	}
	static int j=20;
}
