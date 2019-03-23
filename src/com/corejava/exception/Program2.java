package com.corejava.exception;

public class Program2
{
	public static void main(String[] args)
	{
		try{
			System.out.println("try started");
			
			System.out.println(10/0);
			System.out.println("try ended");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch block");
			e.printStackTrace();
		}
		finally {
			System.exit(-'a');
			System.out.println("finally block");
		}
	}
}
