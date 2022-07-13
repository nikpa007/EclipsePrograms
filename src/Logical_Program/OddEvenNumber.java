package Logical_Program;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		// 11/2=5
		//11%2=1-->moduler gives reminder
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter value");
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Number is even number");
		}
		else
		{
			System.out.println("Number is odd number");
		}

	}

}
