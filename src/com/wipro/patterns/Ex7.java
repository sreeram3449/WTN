package com.wipro.patterns;

public class Ex7 {
	public static void main(String[] args) {
		int i,j,k=1;
		int n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}
