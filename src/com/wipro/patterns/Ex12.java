package com.wipro.patterns;

public class Ex12 {
	public static void main(String[] args) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(n-j+1);
			}
			System.out.println();
		}
	}
}
