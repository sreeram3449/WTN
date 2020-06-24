package com.wipro.patterns;

public class Ex2 {
	public static void main(String[] args) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
