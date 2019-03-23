package com.oops;

class Overloading4 
{
	protected synchronized strictfp static final void m(int ...a)
	{
		System.out.println("parent method");
	}
}
class Overloading5 extends Overloading4 
{
	 boolean m(int a)
	{
		System.out.println("child method");
		return false;
	}
}
