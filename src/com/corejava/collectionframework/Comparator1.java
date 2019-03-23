package com.corejava.collectionframework;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator1 {

	public static void main(String[] args) {

		TreeSet t=new TreeSet(new myComparator());
		t.add(10);
		t.add(20);
		t.add(5);
		t.add(7);
		t.add(10);
		t.add(11);
		System.out.println(t);
	}
}
class myComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Integer i=(Integer)o1;
		Integer i1=(Integer)o2;
		//return i.compareTo(i1);//[5, 7, 10, 11, 20]
		//return -i.compareTo(i1);//[20, 11, 10, 7, 5]
		//return i1.compareTo(i);//[20, 11, 10, 7, 5]
		//return -i1.compareTo(i);//[5, 7, 10, 11, 20]
		//return +1;//[10, 20, 5, 7, 10, 11]
		return -1;//[11, 10, 7, 5, 20, 10]
		//return 0;//[10] (all remaining values are duplicate)
	}

}

