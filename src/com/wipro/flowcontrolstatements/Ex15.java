package com.wipro.flowcontrolstatements;

public class Ex15 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
