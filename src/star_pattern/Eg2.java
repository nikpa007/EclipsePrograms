package star_pattern;

public class Eg2 {

	public static void main(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
		
		//row=5,col=5
		
		int star=5;
		
		for(int i=1;i<=5;i++)//outer for row
		{
			for(int j=1;j<=star;j++)//inner for col
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}

	}

}
