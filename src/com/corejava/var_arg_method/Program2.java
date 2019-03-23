package com.corejava.var_arg_method;

public class Program2 
{
	public static void main(String[] args)
	{
		sum();
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
	}
	public static void sum(int ...a)
	{
		int total=0;
		for(int ans:a)
		{
			total=total+ans;
		}
		System.out.println("total is--->"+total);
	}
}
