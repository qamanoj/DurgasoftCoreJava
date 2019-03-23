package com.oops;

class Overriding
{
	public void property()
	{
		System.out.println("property");
	}
	public void marry()
	{
		System.out.println("marry parent");
	}
}
class Overriding1 extends Overriding
{
	public void marry()
	{
		System.out.println("marry child");
	}
}
