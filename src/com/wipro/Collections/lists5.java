package com.wipro.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class lists5 {
	public static void main(String[] args) {
		LinkedList<String> a=new LinkedList<String>();
		a.add("January");
		a.add("February");
		a.add("March");
		a.add("April");
		a.add("May");
		a.add("June");
		a.add("July");
		a.add("August");
		a.add("September");
		a.add("October");
		a.add("November");
		a.add("December");
		
		Iterator<String> i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
