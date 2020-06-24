package com.wipro.flowcontrolstatements;

public class Ex1a {
	public static void main(String[] args) {
		int x= Integer.parseInt(args[0]);
		if(x>0)
			System.out.println("positive");
		else if(x<0)
			System.out.println("negative");
		else
			System.out.println("zero");
	}

}
