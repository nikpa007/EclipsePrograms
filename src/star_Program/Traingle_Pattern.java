package star_Program;

public class Traingle_Pattern {

	public static void main(String[] args) 
	{
		//Traingular Pattern
		//      *
		//    * *
		//  * * *
		//* * * *
		
		int r=4;
		
		for(int i=1;i<=r;i++) 
		{
			
			// printing spaces
			
			for(int j=1;j<=r-i;j++) 
			{
				System.out.print(" ");
			}
			
			// printing stars
			
			for(int k=1;k<=i;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	System.out.println("========");
	
	//Traingular Pattern
			// *
			// * * 
			// * * *
			// * * * *
			
			int p=4;
			
			for(int i=1;i<=p;i++) 
			{
				
				// printing spaces
				
				for(int j=1;j<=p-1;j++) 
				{
					System.out.print("");
				}
				
				// printing stars
				
				for(int k=1;k<=i;k++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}

		System.out.println("=======");
		
		//Pyramid Pattern
		// *
		// * * 
		// * * *
		// * * * *
		
		int n=4;
		
		for(int i=1;i<=n;i++) 
		{
			
			// printing spaces
			
			for(int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");
			}
			
			// printing stars
			
			for(int k=1;k<=i;k++) 
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	

}
