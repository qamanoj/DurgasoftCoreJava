package com.oops;

public class Overloading3 
{
	public void m(int... i)
	{
		System.out.println("var_arg method");
	}
	public static final strictfp synchronized  void m(int no)
	{
		System.out.println("general method");
	}
	public static void main(String[] args)
	{
		Overloading3 ov=new Overloading3();
		ov.m();
		ov.m(10);
		ov.m(10,20,30,40);
	}
}
