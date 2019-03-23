package com.corejava.var_arg_method;

public class Program4
{
	public static void main(String[] args)
	{
		int []a={10,20,30};
		int []b={50,60,70};
		m(a,b);
	}
	public static void m(int[]... x)
	{
		for(int[] ans:x)
		{
			System.out.println(ans[0]);
			System.out.println(ans[1]);
			System.out.println(ans[2]);
			System.out.println("******");
		}
	}
}
