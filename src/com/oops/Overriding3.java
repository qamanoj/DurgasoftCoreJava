package com.oops;

public class Overriding3 
{
	 Number marry() 
	{
		System.out.println("marry parent overriding3");
		return null;
	}
}
class Overriding4 extends Overriding3
{
	 Integer marry()
	{
		System.out.println("marry child overriding4");
		return null;
	}
	
}
