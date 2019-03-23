package com.corejava.exception;

public class MultipleCatchBlock 
{
	public static void main(String[] args) {

		try
		{
			System.out.println("try");
			System.out.println(10/0);
			System.out.println("hello");
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch");
		}
		catch(NullPointerException e)
		{
			System.out.println("catch");
		}
		catch(Exception e)
		{
			System.out.println("catch1");
		}
		finally {
			System.out.println("finally");
		}
	}
}
