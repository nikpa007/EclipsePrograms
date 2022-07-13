package LoopStudy;

public class Floop1 {

	public static void main(String[] args) {
		

		// increment
		for(int i=2;i<=10;i=i+2) {
			
			System.out.print(" " +i);
	
	}

		// decrement
		for(int j=30;j>=2;j=j-3)
		{
			System.out.println(" "+j);
		}
		int rem=4689,r,rev=0;
		
		while(rem>0)
		{
			r=rem%10;//9--8--6--4
			rev=(rev*10)+r;//9--98--986--9864
			rem=rem/10;//468--46--4-0
		}
		System.out.println(rev);
	}
}