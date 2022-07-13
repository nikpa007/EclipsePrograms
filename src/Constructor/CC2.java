package Constructor;

public class CC2 {

	int a;////variable declaration
	int b;////variable declaration
	public CC2()// user defined zero parameter constructor
	{
	a=100;// initialize variable
	b=200;// initialize variable
	}
	public CC2(int x)// user defined with single parameter constructor
	{
	a=x;
	}
	public CC2(int x, int y)// user defined with two parameter constructor
	{
	a=x;//90
	b=y;//80
	}
	public static void main(String[] args) 
	{
	CC2 c2= new CC2();// created object using zero parameter constructor
	c2.add();// 
	CC2 c11= new CC2();
	c11.add();
	
	}
	public void add()
	{
	int sum=a+b;
	System.out.println("Sum is "+sum);
	}

}
