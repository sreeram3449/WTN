package com.wipro.Collections;

import java.util.ArrayList;
import java.util.Iterator;
public class lists4{
	int i;
	float f;
	double d;
	public lists4(int i, float f, double d) {
		super();
		this.i = i;
		this.f = f;
		this.d = d;
	}
	public static void main(String[] args) {
		lists4 o1=new lists4(1,1,1.00);
		lists4 o2=new lists4(5,4,2.56573);
		ArrayList<lists4> a=new ArrayList<>();
		a.add(o1);
		a.add(o2);
		
		Iterator<lists4> i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next().i);
		}
	}
}
