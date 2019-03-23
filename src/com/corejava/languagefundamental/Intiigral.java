package com.corejava.languagefundamental;

public class Intiigral 
{
	public static void main(String[] args)
	{
		int a=0;
		int  Runnable=010;
		int String=0Xbabcdef;
		int Interface=0Xbeee;
		char $_$_$_$_$$_='\\';
		char c='\'';
		char r='\f';
		char r1='\r';
		char r2='\t';
		char r3='\n';
		char r4='\b';
		float f=0X12e;
		
		//System.out.println(a+" "+Runnable+" "+String+" "+Interface+" "+$_$_$_$_$$_+" "+c+" "+r+" "+r1+" "+r2+" "+r3+" "+r4+" "+f);
		System.out.println(a);
		System.out.println(Runnable);
		System.out.println(String);
		System.out.println(Interface);
		System.out.println($_$_$_$_$$_);
		System.out.println(c);
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		int x=10;
		int y=010;
		int z=0x10;
		System.out.println(x+"----"+y+"----"+z);
		long l=10L;
		System.out.println(l);
		double d=123.456D;
		double d1=10e2;
		System.out.println(d);
		System.out.println(d1);
		char ch=0xFaCe;
		System.out.println(ch);
		int x1 = 0B111;
		System.out.println(x1);
		double dd = 1_23_456.7_8_9D; //valid
		double dd1 = 123_456.7_8_9;//valid
		System.out.println(dd);
		System.out.println(dd1);
		
		System.out.println("******");
		
		long chh[]=new long[5];
		System.out.println(chh.getClass().getName());//Z-
		
		/*int[] aa=new int[2147483647];
		System.out.println(aa.length);//maximum array size range is 2147483647--->o/p=2147483647 */		
		
		int[] aa1=new int[0];
		System.out.println(aa1.length);//0
		
		System.out.println("******");
		
		int[] aaa=new int['a'];//(valid)
		System.out.println(aaa.length);
		byte b=10;
		int[] ab=new int[b];//(valid)
		System.out.println(ab.length);
		short s=20;
		int[] ac=new int[s];//(valid)
		System.out.println(ac.length);
		//int[] ad=new int[10l];//C.E:possible loss of precision//(invalid)
		//int[] ae=new int[10.5];//C.E:possible loss of precision//(invalid)
		System.out.println("******");
		int[][] a11=new int[6][3];
		//In multidimensional arrays length variable represents only base size but not total size.
		System.out.println(a11.length);//6
		System.out.println(a11[0].length);//3
		
		
	}
}
