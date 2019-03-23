package com.corejava.collectionframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo 
{
	public static void main(String[] args) throws IOException 
	{
		Properties p=new Properties();
		FileInputStream fil=new FileInputStream("D:\\Manoj WorkSpace\\DurgaSoftCorejava\\src\\com\\corejava\\collectionframework\\Data.properties");
		p.load(fil);
		System.out.println(p);
		
		String s=p.getProperty("manoj");
		System.out.println(s);
		
		p.setProperty("nag","9999999");
		Enumeration e=p.propertyNames();
		while(e.hasMoreElements())
		{
		String s1=(String)e.nextElement();
		System.out.println(s1);
		
		FileOutputStream fio=new FileOutputStream("D:\\Manoj WorkSpace\\DurgaSoftCorejava\\src\\com\\corejava\\collectionframework\\Data.properties");
		p.store(fio, "updated by manoj for properties file");
		}
	}
}
