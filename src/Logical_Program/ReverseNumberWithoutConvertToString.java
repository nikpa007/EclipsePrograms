package Logical_Program;

import java.util.Scanner;

public class ReverseNumberWithoutConvertToString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter number which you want to reverse ");
		int numb = sc.nextInt();
		
		int revNum=0;
		
		for(int i=numb;i>0;i=i/10)//1234,123,12,1
		{
			int rem=i%10;//4,3,2,1
			revNum=revNum*10+rem;
			//0+4=4
			//40+3=43
			//430+2=432
			//4320+1=4321
		}
		//System.out.println("Original number is "+num);
		System.out.println("Reverse number is "+revNum);

	}

}
