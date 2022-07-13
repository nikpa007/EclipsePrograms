package AbstractS;

public class Concrete_Study extends Abstract_study {

	public static void main(String[] args) 
	{
		
		Concrete_Study C= new Concrete_Study();
		C.test3();
		C.test4();
		C.test1();
		C.test2();

	}

	public void test4()//complete method
	{
		System.out.println("This is my test4 method");
	}

	public void test3() 
	{
		System.out.println("This is my test3 method");
	}
	
}
