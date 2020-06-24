package com.wipro.flowcontrolstatements;

public class Ex5 {
	public static void main(String[] args) {
		char c=args[0].charAt(0);
		if((c>='A'&&c<='Z')||(c>='a'&&c<='z'))
		             System.out.println("Alphabet");
	    else if((c>=32&&c<=47)||(c>=58&&c<=64)||(c>=91&&c<=96)||(c>=123&&c<=126))
	    	System.out.println("Special Character");
	    else
	    	System.out.println("Digit");
	}

}
