package Logical_Program;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// 153=1^3+5^3+3^3=1+125+27=153 is armstrong number
		
		Scanner sc= new Scanner(System.in);
	    System.out.println("Please enter the number");
		int orgNum = sc.nextInt();
		
		int armNum=0;
		
		for(int i=orgNum;i>0;i=i/10)//153/15/1
		{
			
			int rem=i%10;//3,5,1
			armNum=armNum+(rem*rem*rem);
			//0+27=27
			//27+127=152
			//1+152=153
		}
		
		if(orgNum==armNum)
		{
			System.out.println("Given Number "+orgNum+" is armstrong number");
		}
		else
		{
			System.out.println("Given Number "+orgNum+" is not armstrong number");
		}

	}

}
