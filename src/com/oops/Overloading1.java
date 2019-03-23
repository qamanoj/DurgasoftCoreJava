package com.oops;

public class Overloading1
{
	synchronized strictfp final static private  void m1(String str)
	{
		System.out.println("String type");
	}
	public static  void m1(Object obj)
	{
		System.out.println("Object type");
	}
	public void m1(StringBuffer bfr)
	{
		System.out.println("StringBuffer type");
	}
	public static void main(String[] args) 
	{
		Overloading1 o=new Overloading1();
		o.m1(10);
		o.m1(12.5f);
		o.m1('a');
		o.m1(10l);
		o.m1(new Object());
		o.m1("manoj");
		o.m1(new StringBuffer());
		//o.m1(null); cte(both string and stringbuffer is child of object parent)
	}
}
