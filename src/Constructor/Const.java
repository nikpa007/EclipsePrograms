package Constructor;

public class Const {

	
	public static void main(String[] args) {
		
		Const add= new Const();
		add.addition(100);
		

		
	}

	
	
	public static void subs(int z, int u) 
	{
		 z=50;
		 u=10;
		int sub=z-u;
		System.out.println("sub is "+sub);
	}
	public void addition(int x)
	{
		
		int a;
		int b;
		
		a=x=200;
		b=20;
		int sum=a+b;
		System.out.println("Addition is = "+sum);
	}
}
