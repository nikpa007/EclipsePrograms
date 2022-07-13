package star_Program;

public class Fibonacci {

	public static void main(String[] args) 
	{
		// Fibonacci Series
		//0 1 1 2 3 5 8 13 21 ......
		
		int a=0;
		int b=1;
		
		 System.out.println("Fibonacci Series --> ");
		 System.out.println(a+" ");
		 System.out.println(b+" ");
		for(int i=1;i<=15;i++)
		
		{
		
		int c=a+b; //0+1=1; 1+1=2; 1+2=3; 2+3=5; 3+5=8; 5+8=13
		System.out.println(c+" ");
		a=b; // a=1;a=1;a=2;a=3;a=5
		b=c; // b=1;b=2;c=3;c=5;c=8
		}

	}

}
