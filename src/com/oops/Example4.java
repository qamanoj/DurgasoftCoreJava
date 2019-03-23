package com.oops;

public class Example4
{
	public static void main(String[] args)
	{
		MethodHiding m=new MethodHiding();
		m.m();
		MethodHiding1 m1=new MethodHiding1();
		m1.m();
		MethodHiding m2=new MethodHiding1();
		m2.m();
	}
}
