package com.wipro.flowcontrolstatements;

public class Ex12 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int c=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				c++;
			if(c>=1)
			{
				System.out.println("Not a Pime");
				break;
			}
		}
		if(c==0)
			System.out.println("Prime");
	}

}
