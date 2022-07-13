package keyword_this_super;

public class ThisKeyword_study extends Super_keywordStudy {

	int a=100;
	int b=200;
	
	public static void main(String[] args) 
	{
		ThisKeyword_study th= new ThisKeyword_study();
		th.thiss();
		
		

	}

	public void thiss()
	{
		int a=10;
		int b=20;
		int c=25;
		int d=35;
		int sub=c-d;
		int sum=a+b;
		System.out.println("sum is "+sum);
		System.out.println("sum using this keyword for global a variable "+this.a);
		System.out.println("sum using this keyword for global b variable "+this.b);
		System.out.println("sub using super keyword for global c variable from superclass "+super.c);
		System.out.println("sub using super keyword for global b variable from super class "+super.d);
		System.out.println("sub is "+sub);
	}
}
