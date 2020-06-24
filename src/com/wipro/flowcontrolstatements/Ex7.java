package com.wipro.flowcontrolstatements;

public class Ex7 {
	public static void main(String[] args) {
		char c=args[0].charAt(0);
		if(c>='A'&&c<='Z')
		{
			c+=32;
			System.out.println(c);
		}
		else if(c>='a'&&c<='z')
		{
			c-=32;
			System.out.println(c);
		}
	}

}
