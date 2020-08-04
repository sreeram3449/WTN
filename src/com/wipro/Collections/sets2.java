package com.wipro.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class sets2 {
	String empName;

	public sets2(String empName) {
		super();
		this.empName = empName;
	}
	public static void main(String[] args) {
		sets2 s1=new sets2("andaskds");
		sets2 s2=new sets2("sajodwdc");
		sets2 s3=new sets2("amecmad");
		sets2 s4=new sets2("andgshjks");
		HashSet<sets2> h= new HashSet<sets2>();
		h.add(s1);
		h.add(s2);
		h.add(s3);
		h.add(s4);
		
		Iterator<sets2> i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next().empName);
		}
	}
}
