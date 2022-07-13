package Logical_Program;

import java.util.Scanner;

public class ReversString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter string to be reverse");
		String a= sc.next();
		String b="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}

		System.out.println("Original string is = "+a);
		System.out.println("Reverse string is = "+b);
	}

}
