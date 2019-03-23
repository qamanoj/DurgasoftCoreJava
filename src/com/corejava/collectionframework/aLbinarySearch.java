package com.corejava.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class aLbinarySearch 
{
	public static void main(String[] args)
	{
	ArrayList l=new ArrayList();
	l.add("Z");
	l.add("A");
	l.add("M");
	l.add("K");
	l.add("a");
	l.add(15);
	l.add(0);
	l.add(20);
	System.out.println(l);//[Z, A, M, K, a]
	//Collections.sort(l,new MyComprato());
	//System.out.println(l);//[A, K, M, Z, a]
	/*System.out.println(Collections.binarySearch(l,"Z"));//3
	System.out.println(Collections.binarySearch(l,"J"));//-2*/	
	
	/*System.out.println(Collections.binarySearch(l,15,new MyComprato() ));
	System.out.println(Collections.binarySearch(l,"J",new MyComprato()));
	}
}
	
	class MyComprato implements Comparator
	{
		public int compare(Object o1, Object o2) 
		{
			String s=o1.toString();
			String s1=o2.toString();
			return -s.compareTo(s1);*/
	
	
	//AL reverse
	Collections.reverse(l);
	System.out.println(l);
	}
}
