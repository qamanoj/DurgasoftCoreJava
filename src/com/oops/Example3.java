package com.oops;

public class Example3 
{
	public static void main(String[] args) throws Exception 
	{
		Overriding5 o6=new Overriding5();
		o6.marry();
		Overriding6 o1=new Overriding6();
		o1.marry();
		Overriding5 o3=new Overriding6();
		o3.marry();
	}
}
