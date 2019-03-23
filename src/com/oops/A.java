package com.oops;

public class A 
{
	public static void main(String[] args) 
	{
		Overloading4 o=new Overloading4();
		o.m(10,20,30,40);
		Overloading5 o1=new Overloading5();
		o1.m(10);
		Overloading4 o2=new Overloading5();
		o2.m(10);
	}
}
