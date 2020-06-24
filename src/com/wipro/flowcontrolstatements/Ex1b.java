package com.wipro.flowcontrolstatements;

public class Ex1b {
	public static void main(String[] args) {
		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		x%=10;
		y%=10;
		if(x==y)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
