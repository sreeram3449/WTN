package com.wipro.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class lists1 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
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
