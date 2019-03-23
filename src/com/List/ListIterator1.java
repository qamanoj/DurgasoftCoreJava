package com.List;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {

		ArrayList a=new ArrayList();
		a.add("manoj");
		a.add("kumar");
		a.add("sahoo");
		a.add("litu");
		System.out.println(a);
		ListIterator itr=a.listIterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("manoj"))
			{
				itr.remove();
			}
			else
				if(s.equals("sahoo"))
				{
					itr.add("lucky");
				}
				else
					if(s.equals("litu"))
					{
						itr.set("puja");
					}
		}
		System.out.println(a);
	}
}
