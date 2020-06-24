package com.wipro.arrays;

public class Ex12 {
	public static void main(String[] args) {
		int k=args.length;
		int x=0,y=0,c=k/2;
		if(c%2==0)
			{
				x=Integer.parseInt(args[c/2]);
				y=Integer.parseInt(args[c+(c/2)]);
			}
		else if((k/2)%2!=0)
			{
				x=Integer.parseInt(args[c/2]);
				y=Integer.parseInt(args[c+c/2]);
			}
		System.out.println(x+","+y);
	}
}
