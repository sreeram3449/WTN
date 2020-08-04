package com.wipro.Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class lists7 {
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	public lists7(int empId, String empName, String email, String gender, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
	public static void main(String[] args) {
		lists7 l1=new lists7(123,"GGJVH","sdfghg@gmail.com","M",2323343);
		lists7 l2=new lists7(165,"RLFOFGG","askma@gmail.com","F",2355478);
		Vector<lists7> v=new Vector<lists7>();
		v.add(l1);
		v.add(l2);
		
		Enumeration e=v.elements();
		Iterator i=v.iterator();
		System.out.println(e+"   "+i);
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			
	}
	}
}
