package Constructor;

public class Constructor1 {
	int a;
	int b;
	public static void main(String[] args) 
	{
		Constructor1 c11= new Constructor1();
		c11.add();
		
	

	}
	public void add()
	{
		
		int sum=a+b;
		System.out.println("Addition is = "+sum);
	}
	
	public Constructor1()
	{
		a=100;
		b=50;
	}
	
	public Constructor1(int x)
	{
		a=x;
	}
	
	public Constructor1(int x,int y)
	{
		a=x;
		b=y;
	}
	
}
