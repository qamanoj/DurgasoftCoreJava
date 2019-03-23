package com.oops;

 abstract class Overriding7 
{
	abstract void m();
}
class Overriding8 extends Overriding7
{
	protected void m()
		{
			System.out.println("parent overriding");
		}
}