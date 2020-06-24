package com.wipro.flowcontrolstatements;

public class Ex16 {
	public static void main(String[] args) {
		int n= Integer.parseInt(args[0]);
		int x=0;
		while(n>0)
		{
			x=n%10;
			n/=10;
			System.out.print(x);
		}
	}
}
