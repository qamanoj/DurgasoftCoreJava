package com.oops;

public class Example
{
	public static void main(String[] args) 
	{
		Overriding o=new Overriding();
		o.marry();
		Overriding1 o1=new Overriding1();
		o1.marry();
		Overriding o3=new Overriding1();
		o3.marry();
	}
}
