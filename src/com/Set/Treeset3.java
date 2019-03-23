package com.Set;

import java.util.TreeSet;

public class Treeset3 {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		t.add("d");
		t.add("v");
		t.add("a");
		t.add("b");
		System.out.println(t.add("manoj"));
		System.out.println(t.descendingSet());
	}
}
