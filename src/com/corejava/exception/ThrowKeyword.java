package com.corejava.exception;

public class ThrowKeyword 
{
	static ArithmeticException e=new ArithmeticException();
	
	
	//static ArithmeticException e;
	
	public static void main(String[] args)
	{
		throw new ArithmeticException("/0");
		
		//throw e;
		
	   //throw e;
		
		//throw new Error();
	}
}
