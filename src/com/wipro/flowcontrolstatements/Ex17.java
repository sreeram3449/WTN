package com.wipro.flowcontrolstatements;

public class Ex17 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int r,nr=0;
		int x=n;
		while(n>0)
		{
		  r=n%10;
		  nr=nr*10+r;
		  n/=10;
		}
		if(x==nr)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
