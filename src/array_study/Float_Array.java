package array_study;

public class Float_Array {

	public static void main(String[] args) {
		// 88.23 77.66  65.22  50.22
		//  0      1      2      3  =  4
		//  %
		
		float per[]= new float[4];
		
		per[0]=88.23f;
		per[1]=77.66f;
		per[2]=65.22f;
		per[3]=50.22f;
		
		//usage
		
		System.out.println("Percentage of eklavya is = "+per[0]);
		System.out.println("Percentage of sagar is = "+per[1]);
		System.out.println("Percentage of manisha is = "+per[2]);
		System.out.println("Percentage of rupali is = "+per[3]);
		System.out.println("================");
		
		for(int i=0;i<=3;i++) 
		{
			System.out.println("Semester 1st ="+per[i]);
		}
		
		System.out.println("================");
		
		for(int i=per.length-1;i>=0;i--)
		{
			System.out.println("Semester 2nd ="+per[i]);
		}
		System.out.println("================");

	}

}
