package TestPackage;

public class Study_v {

	
	static int a=20;
	
	public static void main(String[] args) {
		
		Study_v sv= new Study_v();
		sv.studyv();
		studyv1();
		

	}

	public void studyv()
	{
		int b=15;
		System.out.println("value of b is "+b);
		System.out.println("value of a is "+a);
	}
	
	public static void studyv1()
	
	{
		int c=20;
		int sum=a+c;
		System.out.println("value of c is "+c);
		System.out.println("value of sum is "+sum);
	}

}


