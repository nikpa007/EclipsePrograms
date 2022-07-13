package just_for_study;

public class Star_Triangular {

	public static void main(String[] args) 
	{
		// Right side angle
		int r=7;
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r-1;j++) // for spaces
				
			{
				System.out.print("");
			}
			for(int k=1;k<=i;k++) // for star
			{
				System.out.print("* ");
			}
			
			
		System.out.println();
		
		
		}
		System.out.println("==============");
		{
			// factorial number
			int a=1;
			int num=5; 
			{
			 for(int i=1;i<=num;i++)
			 {
				  a=a*i;
				  System.out.println("Factorial no."+a);
				  }
			}
		}
}
}
