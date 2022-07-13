package LoopStudy;

public class Loop_Study {

	public static void main(String[] args) {
		//We want to print mock word 10 times by using for loop
		
		//String name="mock";
		int c=10;
		for(int i=1;i<=10;i++)
		{
			System.out.println(c);
		}

		//we want to print 2's table
		//2 - 20
		//increment i=i+2,i=i+3
		
		for(int a=2;a<=20;a=a+2)
		{
			System.out.println(a);
		}
		
		//decrement 
		//we want to print 3-30 table in reverse 30-3
		
		for(int b=30;b>=3;b=b-3)
		{
			System.out.println(" "+b);
		}
		
	}

}
