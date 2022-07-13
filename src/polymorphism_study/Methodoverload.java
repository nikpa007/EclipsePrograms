package polymorphism_study;

public class Methodoverload {

	public static void main(String[] args) 
	{
		
		Methodoverload nk= new Methodoverload();
		
		nk.nik();
		nk.nik(10.3f, 11.3f);
		nk.nik(123, 111);
		nk.nik(10.6f, 5.6f, 6.8f);

	}

	public void nik()
	{
		int a=10;
		int b=5;
		int sub=a-b;
		System.out.println("Substraction is = "+sub);
	}
	
	public void nik(int a,int b)
	{
		int add=a+b;
		System.out.println("Addition is = "+add);
	}
	
	public void nik(float a,float b)
	{
		float mul=a*b;
		System.out.println("Multiplication is = "+mul);
	}
	
	public void nik(float a,float b, float c)
	{
		float div=a/b/c;
		System.out.println("Division is = "+div);
	}
}
