package com.corejava.exception;

public class MultiCatchBlock
{
	public static void main(String[] args) 
	{
		try
		{
			//int a=10/0;			(ArithmeticException)
			
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException|NullPointerException e)
		{
			e.printStackTrace();
		}
	}
}
