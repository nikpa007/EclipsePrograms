package Method;

public class Parameter {

	public static void main(String[] args) {
		
		parameter();
		Parameter np= new Parameter();
		np.nparameter();
		Parameter.sub1(50, 10,15);
		Parameter.sub1(16, 10, 5);
		Parameter ik= new Parameter();
		ik.pk("Kolhapur", 1990, 'K');
		Method03 hub= new Method03();
		hub.wan("obj", 221220, 199.32d);
	}

	public static void parameter()
	{
	
		int a=100;
		int b=200;
		int add=a+b;
		
		System.out.println(add);
	}
	public static void sub1(double a,double b,double c)
	{
		double subs=a-b-c;
		double adds=a+b-c;
		double divi=a/b/c;
		System.out.println("Substraction is "+subs);
		System.out.println("Addition is "+adds);
		System.out.println("Division is "+divi);
	}
	public void nparameter() {
		
	
	int a=100,b=50;
	
	int sub=a-b;

	int div=a/b;
	
	int mul=a*b;
	
	double c=2.6,d=36.5;
	
	double decimalpoint=c*d;
	
	System.out.println("percenage is "+decimalpoint);
	System.out.println("subtraction is "+sub);
	System.out.println("division is "+div);
	System.out.println("muliplication is "+mul);
	}
	public void pk(String universityname,int year,char grade) {
		
		System.out.println("university name is "+universityname);
		System.out.println("Establish year is "+year);
		System.out.println("Granted grade is "+grade);
	}
}
