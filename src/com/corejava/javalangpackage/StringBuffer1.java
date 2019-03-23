package com.corejava.javalangpackage;

public class StringBuffer1 
{
	public static void main(String[] args) 
	{
		final StringBuffer sb=new StringBuffer("manoj");
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append("kumar");
		//sb=new StringBuffer("kuma");----->cte
		System.out.println(sb);//manojkumar(mutable)
		
		System.out.println("******");
		
		String s="manoj";
		s.concat("kumar");
		System.out.println(s);//manoj(imutable)
		s=s.concat("hii");
		System.out.println(s);//manojhii(mutable)
		
		System.out.println("********");
		
		StringBuffer sbbb=new StringBuffer(19);
		System.out.println(sbbb.capacity());//19
		
		StringBuffer sbb=new StringBuffer();
		System.out.println(sbb.capacity());//16
		sbb.append("abcdefghijklmnop");
		System.out.println(sbb.capacity());//16
		System.out.println(sbb.charAt(7));
		System.out.println(sbb.deleteCharAt(7));
		sbb.append("q");
		System.out.println(sbb.capacity());//34
		sbb.ensureCapacity(1000);
		System.out.println(sbb.capacity());
		
		System.out.println("********");
		
		StringBuffer sb2=new StringBuffer();
		sb2.append("my name is manoj ");
		sb2.append('A');
		sb2.append(" my age is ");
		sb2.append(23);
		sb2.append( true);
		System.out.println(sb2);
		
		System.out.println("******");
		
		StringBuffer sb3=new StringBuffer();
		sb3.append("ashok").insert(5,"arunkumar").delete(11,13).reverse().append("solutions").insert(18,"abcdf").reverse();
		System.out.println(sb3); // snofdcbaitulosashokarunkur
		
	}
}
