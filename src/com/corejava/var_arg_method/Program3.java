package com.corejava.var_arg_method;

public class Program3 
{
	public static void method(int ...a)
	{
		System.out.println("var _arg method");
	}
	public static void method(int a)
	{
		System.out.println("general method");
	}
	public static void main(String[] args)
	{
		method();
		method(10,20);
		method(50);
		method(10,20,30,40);
	}
	
}
