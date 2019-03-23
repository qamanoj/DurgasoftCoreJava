package com.corejava.exception;

public class NullpoinerEx 
{
	//static ArithmeticException e;
	public static void main(String[] args) 
	{
		/*try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException a)			(NPE)
		{
			System.out.println(10/0);
		}
		finally 
		{
			String s=null;
			System.out.println(s.length());
		}*/


		/*String s=null;						(NPE)
		System.out.println(s.length());*/


		//throw e;								(NPE)


		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)			//NPE
		{
			throw new NullPointerException();
		}


	}
}
