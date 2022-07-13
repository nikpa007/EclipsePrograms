package Logical_Program;

public class FactorialNumber {

	public static void main(String[] args) 
	{
		
		// 5!-->5*4*3*2*1
		
		int num=5;
		int fact=1;
		
		for(int i=num;i>=1;i--)//4 3 2 1
		{
			fact=i*fact;//5=5*1 //20=4*5 //60=3*20 //120=60*2 //120=120*1
			
		}
		System.out.println("Factorial number is "+fact);

	}

}
