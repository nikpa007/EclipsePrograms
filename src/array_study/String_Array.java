package array_study;

public class String_Array {

	public static void main(String[] args) 
	{
		
		// clg name,address,branch,total year
		//     0     1        2       3
		// array declaration
		
		String college[]= new String[4];
		
		//array intialization
		
		college[0]="ZCOER";
		college[1]="Narhe,Pune-411041";
		college[2]="Mechanical";
		college[3]="4 year";
		
		//usage
		
		System.out.println(college[0]);
		System.out.println(college[1]);
		System.out.println(college[2]);
		System.out.println(college[3]);
		System.out.println("==============");
		
		
		for(int i=0;i<=3;i++)
		{
			System.out.println(college[i]);
			
			
		}
		
		System.out.println("==============");
		
		//reverse
		
		for(int i=college.length-1;i>=0;i--)
		{
			System.out.println(college[i]);
			
		}		

		System.out.println("==============");
		
		// 2nd type to use array
		//String
		String place[]= {"Pune","Mumbai","Pune"};
		
		for(int i=0;i<=place.length-1;i++) 
		{
			System.out.println(place[i]);
		}
		System.out.println("===================================");
		
		// for int 
		
		int seatnum[]= {26,28,30,32};
		
		for(int i=0;i<=seatnum.length-1;i++)
		{
			System.out.println("Even sequence for examination = "+seatnum[i]);
		}
		System.out.println("===================================");
		
		//for char
		
		char code[]= {'C','O','D','E'};
		
		for(int i=0;i<=code.length-1;i++) 
		{
			System.out.println("Exam Paper Code = "+code[i]);
		}
		System.out.println("===================================");
		
		//for float
		
		float temp[]= {38.9f,40.2f,42.6f,44.5f};
		
		for(int i=0;i<=temp.length-1;i++)
		{
			System.out.println("Temperature in pune day wise = "+temp[i]+"°c");
		}
		System.out.println("====================================");
	}

}
