package com.oops;

public class Constructor1 
{
	private Constructor1(double d)
	{
		System.out.println("double-argument constructor");
	}
	protected Constructor1(int i)
	{
		this(10.5);
		System.out.println("int-argument constructor");
	}
	public Constructor1() 
	{
		this(10);
		System.out.println("no-argument constructor");
	}
	public static void main(String[] args) 
	{
		Constructor1 t1=new Constructor1(); 
		System.out.println("**********");
		Constructor1 t2=new Constructor1(10);
		System.out.println("**********");
		Constructor1 t3=new Constructor1(10.5);
	}
}
