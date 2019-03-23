package com.corejava.collectionframework;

import java.util.SortedSet;
import java.util.TreeSet;

public class ShortedSetDemo 
{
	public static void main(String[] args) 
	{
		SortedSet s=new TreeSet();
		s.add(10);
		s.add(11);
		s.add(12);
		s.add(13);
		s.add(14);
		s.add(16);
		s.add(15);
		s.add(17);
		System.out.println(s);
		System.out.println(s.first()+"==="+s.last());
		System.out.println(s.headSet(13));
		System.out.println(s.tailSet(14));
		System.out.println(s.subSet(12, 17));
	}
}
