package array_study;

public class Char_Array {

	public static void main(String[] args) 
	{
		// A  B  C  D
		// 0  1  2  3 ---> lenght = 4
		//gRADE 
		
		// array declaration
		char grade[]= new char[4];
		
		//array initialization
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		
		//usage
		
		System.out.println("Distinction is in grade = "+grade[0]);
		System.out.println("First Class is in grade = "+grade[1]);
		System.out.println("Second Class is in grade = "+grade[2]);
		System.out.println("Passed is in grade = "+grade[3]);
		System.out.println("============");
		
		//grade.lenght-1=4-1=3
		for(int i=0;i<=3;i++) 
		{
			System.out.println(grade[i]);
		}
		System.out.println("============");
		
		
		for(int i=grade.length-1;i>=0;i--) 
		{
			System.out.println(grade[i]);
		}
		

	}

}
