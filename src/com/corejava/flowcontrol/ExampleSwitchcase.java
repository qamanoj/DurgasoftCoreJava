package com.corejava.flowcontrol;

public class ExampleSwitchcase 
{
	public static void main(String[] args) 
	{
		int x=10;
		final int y=20;
		switch(x)
		{
		case 10:
		System.out.println("10");
		case y:
		System.out.println("20");
		}
		
		System.out.println("*******");
		
		int a=0;
		switch(a)
		{
		case 0:
		System.out.println("0");
		case 1:
		System.out.println("1");
		break;
		case 2:
		System.out.println("2");
		default:
		System.out.println("default");
		}
		
		System.out.println("*****");
		
		int x1=3;
		switch(x1)
		{
		default:
		System.out.println("default");
		case 0:
		System.out.println("0");
		break;
		case 1:
		System.out.println("1");
		case 2:
		System.out.println("2");
		}
		System.out.println("********");
		
		
	}
}
