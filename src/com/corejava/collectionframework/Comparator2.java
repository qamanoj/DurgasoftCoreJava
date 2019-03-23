package com.corejava.collectionframework;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator2 
{
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new My());
		t.add(new StringBuffer("manoj"));
		t.add(new StringBuffer("kumar"));
		t.add(new StringBuffer("sahoo"));
		t.add(new StringBuffer("litu"));
		t.add(new StringBuffer("alok"));
		t.add(new StringBuffer(10));
		System.out.println(t);
	}
}
	class My implements Comparator
	{
		public int compare(Object o1, Object o2) {
			String s1=o1.toString();
			String s2=o2.toString();
			return s1.compareTo(s2);
			//return -1;
		}
		
	}
