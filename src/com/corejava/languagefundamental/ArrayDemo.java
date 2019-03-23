package com.corejava.languagefundamental;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		
		Object obj[]=new Object[5];
		
		obj[0]=new Object();
		obj[1]=new Integer(10);
		obj[2]=new String("manoj");
		obj[3]=new Double(10.5);
		for (int i = 0; i <=obj.length-1; i++) 
		{
			System.out.println(obj[i]);
		}
		
		System.out.println("********");
		String[] str={"a","B"};
		args=str;
		System.out.println(str.length);
		for (int i = 0; i <=args.length-1; i++) 
		{
			System.out.println(args[i]);
		}
	}

}
