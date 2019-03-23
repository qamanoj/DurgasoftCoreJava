package com.corejava.operators;

public class Program6 
{
	public static void main(String[] args)
	{
		int x=10;
		int y=x++;
		System.out.println(x);
		System.out.println(y);
		System.out.println("*******");
		int i=1;
		i+=++i + i++ + ++i + i++;
		System.out.println(i); //13
		System.out.println("*******");
		
	}
}
