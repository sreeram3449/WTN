package com.wipro.Collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class sets3 {
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("one");
		t.add("two");
		t.add("three");
		NavigableSet<String> 
        trev = t.descendingSet(); 
		
		Iterator i=trev.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
			System.out.println(t.contains("one"));
			System.out.println(t.contains("five"));
	}
}
