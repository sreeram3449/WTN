package com.wipro.flowcontrolstatements;

public class Ex13 {
	public static void main(String[] args) {
		int i,j,c=0;
		for(j=10;j<=99;j++)
		{
		for(i=2;i<j;i++)
		{
			if(j%i==0)
				c++;
		}
		if(c==0)
			System.out.println(j);
		else 
			c=0;
	}
	}
}
