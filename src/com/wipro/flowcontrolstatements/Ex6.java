package com.wipro.flowcontrolstatements;

public class Ex6 {
	public static void main(String[] args) {
		int x=Integer.parseInt(args[1]);
		String s=args[0];
		if(s.equals("Female")&&(x>=1&&x<=58))
			System.out.println("The percentage of intrest is 8.2%");
		else if(s.equals("Female")&&(x>=59&&x<=100))
			System.out.println("The percentage of intrest is 9.2%");
		else if(s.equals("Male")&&(x>=1&&x<=58))
			System.out.println("The percentage of intrest is 8.4%");
		else if(s.equals("Male")&&(x>=59&&x<=100))
			System.out.println("The percentage of intrest is 10.5%");
	}

}
