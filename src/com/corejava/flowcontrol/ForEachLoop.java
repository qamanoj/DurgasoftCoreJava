package com.corejava.flowcontrol;

public class ForEachLoop 
{
	public static void main(String[] args)
	{
		/*for(int i=0;i<=10;i++)
		{
			if(i==5)				o/p--->0,1,2,3,4
				break;
			{
				System.out.println(i);
			}
		}*/
		
		
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
