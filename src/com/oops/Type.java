package com.oops;

public class Type
{
	public static void main(String[] args) 
	{
		Runnable r=new Thread();
		
		Object o=new String("manoj");
		Object obj=(Object)o;
		System.out.println(o==obj);
		
		String s=new String("manoj");
		Object oo=(Object)s;
		System.out.println(s==oo);
		
		Object o1=new String("manoj");		//classCastException but, it is valid.
		StringBuffer s1=(StringBuffer)o1;
	}
}
