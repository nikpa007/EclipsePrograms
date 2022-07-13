package Access_specifier;

public class Example_study 
{

	int a,b,c,d;
	float e,f,g,h;
	
	
	private static void demo1()
	{
		int a=25;
		int b=10;
		int sum=a+b;
	    System.out.println("Sum is = "+sum);
	}
	
	static void demo2()
	{
		int c=63;
		int d=19;
		int sub=c-d;
		System.out.println("Sub is = "+sub);
	}
	
	protected static void demo3()
	{
		float e=12.3f;
		float f=33.5f;
		float mul=e*f;
		System.out.println("Multiplication is = "+mul);
	}
	
	public static void demo4()
	{
		float g=133.5f;
		float h=123.4f;
		float div=g/h;
		System.out.println("Division is = "+div);
		
	}
}


