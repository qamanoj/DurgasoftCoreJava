package com.corejava.collectionframework;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayBinarySearch 
{
	public static void main(String[] args) {
		
		int[] a={10,5,20,11,6};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a,6));//1
		System.out.println(Arrays.binarySearch(a,14));//-5
		String[] s={"A","Z","B"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s,"Z"));//2
		System.out.println(Arrays.binarySearch(s,"S"));//-3
		Arrays.sort(s,new MyComparat());
		System.out.println(Arrays.binarySearch(s,"Z",new MyComparat()));//0
		System.out.println(Arrays.binarySearch(s,"S",new MyComparat()));//-2
		System.out.println(Arrays.binarySearch(s,"N"));//-4(unpredictable result)
	}
}
class MyComparat implements Comparator
{
	public int compare(Object o1, Object o2) 
	{
		String s=o1.toString();
		String s1=o2.toString();
		return -s.compareTo(s1);
	}
}

