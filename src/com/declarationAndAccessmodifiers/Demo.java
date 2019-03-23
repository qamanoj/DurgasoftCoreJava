package com.declarationAndAccessmodifiers;

class Demo implements Left,Right
{
	public static void main(String[] args) 
	{
		System.out.println(Left.x);
		System.out.println(Right.x);
		
	}
}
