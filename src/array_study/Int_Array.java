package array_study;

public class Int_Array {

	public static void main(String[] args) 
	{
		// 21 22 23 24
		//  0  1  2  3 = 4
		// Rollnumber
		
		int rollno[]= new int[4];
		
		rollno[0]=21;
		rollno[1]=22;
		rollno[2]=23;
		rollno[3]=24;
		
		//usage
		
		System.out.println("Eklavya roll num is = "+rollno[0]);
		System.out.println("Sagar roll num is = "+rollno[1]);
		System.out.println("Manisha roll num is = "+rollno[2]);
		System.out.println("Rupali roll num is = "+rollno[3]);
		System.out.println("==========");
		for(int i=0;i<=3;i++) 
		{
			System.out.println(rollno[i]);
		}
		System.out.println("==========");
		for(int i=3;i>=0;i--) 
		{
			System.out.println(rollno[i]);
		}

	}

}
