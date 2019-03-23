package com.oops;

public class Overloading 
{
	final static void m(int a)
	{
		System.out.println("int type");
	}
	private static int m(float b)
	{
		System.out.println("float type");
		return 10;
	}
	synchronized public final static boolean m(String str)
	{
		System.out.println("String type");
		return true;
	}
	protected synchronized strictfp static final void m(Object obj)
	{
		System.out.println("Object type");
	}
	public static void main(String[] args) 
	{
		Overloading o=new Overloading();
		o.m(10);
		o.m(12.5f);
		o.m('a');
		o.m(10l);
		o.m(new Object());
		o.m("manoj");
		o.m(null);
	}
}
