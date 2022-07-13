package TestPackage;

public class study_constructor {

	int a=100;
	int b=50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		study_constructor dd= new study_constructor(20);
		
		dd.add();
		
		
	}
	 public void add()
	 {
		 int sum=a+b;
		 System.out.println("Sum is = "+sum);
	 }
	 
	 public study_constructor(int x)
	 {
		a=x; 
	 }
	 
	 public study_constructor(int x,int y)
	 {
		 
		 a=x;
		 b=y;
	 }

}

