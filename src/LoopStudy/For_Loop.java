package LoopStudy;

public class For_Loop {

	public static void main(String[] args) {
		 //multiplication of 2*1 table

		int a=10;
		int b=10;
		
		for(int i=2;i<=a;i=i+2)
		{
			for(int k=1;k<=b;k++ )
			{
				System.out.print(" "+(i*k));
			}
		
			System.out.println();
		}
			
	}

}
