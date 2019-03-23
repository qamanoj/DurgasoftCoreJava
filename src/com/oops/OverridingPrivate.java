package com.oops;

class OverridingPrivate 
{
	private  void m()
	{
		System.out.println("parent");
	}
}
class Ove extends OverridingPrivate
{
	private void m()
	{
		System.out.println("child");
	}
}
