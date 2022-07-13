package LoopStudy;

public class DoWhileLoop_Study {

	public static void main(String[] args) {
	
		// we want to print 5 table
		//incremental
		//5 - 50
		int a=5;
		
		do {
			
			System.out.println("  "+a);
			 a=a+5;
		}while (a<=50);
		System.out.println("============");
		
       
		// decremental 
		
		int c=60;
		
		do {
			
			System.out.println("  "+c);
			 c=c-6;
		}
		while (c>=6); 

	}

}
