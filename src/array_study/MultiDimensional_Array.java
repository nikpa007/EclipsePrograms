package array_study;

public class MultiDimensional_Array {

	public static void main(String[] args) 
	{
		// Two matrix
		//Length = 2
		// row---> 00  01
		//col ---> 10  11
		
		//int type
		//Declartion
		
		int a[][]= new int[2][2];
		
		//Initialization
		
		a[0][0]=111;
		a[0][1]=222;
		a[1][0]=333;
		a[1][1]=444;
		
		//Usage
		
		System.out.print(a[0][0]+" ");
		System.out.println(a[0][1]+" ");
		System.out.print(a[1][0]+" ");
		System.out.println(a[1][1]+" ");
		
		System.out.println("=============="); 
		
		//String type
		//Declartion
		
		String car[][]= new String[2][2];
		
		//Initialization
		
		car[0][0]="TATA";
		car[0][1]="PUNCH";
		car[1][0]="TATA";
		car[1][1]="NEXON";
		
		//Usage
		
		System.out.print(car[0][0]+" ");
		System.out.println(car[0][1]+" ");
		System.out.print(car[1][0]+" ");
		System.out.println(car[1][1]+" ");
		System.out.println("==============");
		
		//Char type
		//Declaration
		
		char AC[][]=new char[2][2];
		
		//Initialization
		
				AC[0][0]='O';
				AC[0][1]='N';
				AC[1][0]='O';
				AC[1][1]='F';
		
				//Usage	
				
			System.out.print(AC[0][0]+" ");
			System.out.println(AC[0][1]+" ");
			System.out.print(AC[1][0]+" ");
			System.out.println(AC[1][1]+" ");
			System.out.println("==============");
			
			//Float type
			//Declaration
			
			float per[][]= new float[2][2];
			
			//Initialization
			
			per[0][0]=50.55f;
			per[0][1]=60.66f;
			per[1][0]=70.77f;
			per[1][1]=80.88f;
			
			//usage
			
			System.out.print(per[0][0]+"%  ");
			System.out.println(per[0][1]+"% ");
			System.out.print(per[1][0]+"%  ");
			System.out.println(per[1][1]+"% ");
			System.out.println("==================");
			
         // without using new keyword
	    // row =2 , column=3
		
			//array declaration
			float deg[][]= {{20.1f,21.2f,23.3f},{30.3f,31.6f,32.8f}};
			
			//array initialisation & usage using for loop
			
			for(int i=0;i<=1;i++) // for row = 2-1 = 1
			{
				for(int j=0;j<=2;j++) // for column = 3-1 = 2
				{
					System.out.print(deg[i][j]+"  ");
				}
				System.out.println();
			}
			System.out.println("==================");
	}
	

}
