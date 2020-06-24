package com.wipro.patterns;

public class Ex18 {
	public static void main(String[] args) {
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print(n-j+1);
			}
			System.out.println();
		}
	}
}
