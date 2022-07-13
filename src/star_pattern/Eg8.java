package star_pattern;

public class Eg8 {

	public static void main(String[] args) {
//	1	*        *
//	2	**      **
//	3	***    ***
//	4	****  ****
//	5	**********
//	6	****  ****
//	7	***    ***
//	8	**      **
//	9	*        *

	//row=9
		
		int star1=1;
		int space1=4;
		int star2=1;
		int space2=4;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=space2;k++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<=4)
			{
				star1++;
				space1--;
				star2++;
				space2--;
			}
			else
			{
				star1--;
				space1++;
				star2--;
				space2++;
			}
		}
	
	
	
	
	
	
	
	}

}
