package com.corejava.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListShoarting
{
	public static void main(String[] args) {

		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		l.add(new Integer(10));//ClassCastException for DNSO
		//l.add(null);//NullPointerException
		System.out.println("Before sorting :"+l);//[Z, A,K, N]
		Collections.sort(l,new MyComarator());
		System.out.println("After sorting :"+l);//[A, K,N, Z]
	}
}
class MyComarator implements Comparator
{
	public int compare(Object o1, Object o2) 
	{
		String s=o1.toString();
		String s1=o2.toString();
		return -s.compareTo(s1);
	}
	
}