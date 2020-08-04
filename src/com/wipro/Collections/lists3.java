package com.wipro.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class lists3 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("ascffa");
		a.add("addsdss");
		
		Iterator<String> i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
