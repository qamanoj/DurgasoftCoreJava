package com.oops;

public class Example2
{
	public static void main(String[] args)
	{
		Overriding3 o=new Overriding3();
		o.marry();
		Overriding4 o1=new Overriding4();
		o1.marry();
		Overriding3 o3=new Overriding4();
		o3.marry();
	}
}
