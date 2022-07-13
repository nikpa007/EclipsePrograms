package Logical_Program;

import java.util.Scanner;

public class UserInput_Scanner {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);//create object of scanner class
		System.out.println("Please enter value of a");
		int a = sc.nextInt();
		
		System.out.println("Please enter value of b");
		int b=sc.nextInt();
		
		int sum=a+b;
		System.out.println("Sum of a & b is = "+sum);
		
		
	}

}
