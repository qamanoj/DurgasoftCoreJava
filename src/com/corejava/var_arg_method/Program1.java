package com.corejava.var_arg_method;

public class Program1
{
	public static void method(int...a)
	{
		System.out.println("var_arg method executed--->"+a.length);
	}
	public static void main(String[] args) 
	{
		method();
		method(10);
		method(10,20);
		method(30,40,50);
		method(60,70,80,90);
	}
}
