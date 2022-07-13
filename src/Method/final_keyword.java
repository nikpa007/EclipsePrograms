package Method;

public final class final_keyword {

	public static void main(String[] args) 
	{


		int a=20;
		a=a+30;
		System.out.println("Value of a is ="+a);
		
		// using final keyword for variable
		
	
		final int b=30;// we can't update final variable value
	
		int sum=a+b;
	
	
		System.out.println("Sum is "+sum);

		
		
	}
	
	public final void car()
	{
		System.out.println("Its car method using final keyword");
	}
	
	
}
