package com.corejava.javalangpackage;

import java.lang.reflect.Method;

public class ObjectMethods 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		int count=0;
		Class c=Class.forName("java.lang.Object");
		Method []m=c.getDeclaredMethods();
		for(Method m1:m)
		{
			count++;
			System.out.println(m1);
		}
		System.out.println("the no. of methppods-"+count);
		//another methods is registerNatives
	}
}
