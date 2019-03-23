package com.oops;

class MethodHiding 
{
	protected static void m()
	{
		System.out.println("parent method");
	}
}
class MethodHiding1 extends MethodHiding
{
	public final static void m()
	{
		System.out.println("child method");
	}
}
