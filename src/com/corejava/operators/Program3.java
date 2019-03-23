package com.corejava.operators;

public class Program3 
{
	public static void main(String[] args)
	{
		Thread t = new Thread( );
		System.out.println(t instanceof Thread); //true
		System.out.println(t instanceof Object); //true
		System.out.println(t instanceof Runnable);//true
		System.out.println("********");
		Object o=new Object( );
		System.out.println(o instanceof String );//false
		Object o1=new String("ashok");
		System.out.println(o1 instanceof String); //true
		System.out.println(null instanceof Program3); //false
		System.out.println("*******");
		System.out.println(true&false);//false
		System.out.println(true|false);//true
		System.out.println(true^false);//true
		System.out.println("**********");
		System.out.println(4&5);//4 using binary digits
		System.out.println(4|5);//5 4-->100
		System.out.println(4^5);//1
		System.out.println("*******");
		//System.out.println(~true); // CE :opetator ~ can not be applied to boolean
		System.out.println(~4); //-5
		System.out.println("********");
		System.out.println(!true);//false
		System.out.println(!false);//true
		//System.out.println(!4);//CE : operator ! can not be applied to int
		System.out.println("********");
		int x=150;
		short s=(short)x;
		byte b=(byte)x;
		System.out.println(s); //150
		System.out.println(b); //-106
		System.out.println("*********");
		
	}
}
