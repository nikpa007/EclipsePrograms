package just_for_study;

public class Factorial_Program {

	public static void main(String[] args) {
		
		// factorial number of 5
		// 5!
		// 5*4*3*2*1=120
		
		
		int i,fact=1;  
		
		  int number=5;//It is the number to calculate factorial    
		 
		  for(i=1;i<=number;i++) // 1 2 3 4 5 6 ---> false
		  {     
			  fact=fact*i;    // 1=1 // 1=2  // 2=3 // 3=4 // 4=5
		  }    
		  System.out.println("Factorial of 5 is: "+fact);    
		 }  
		  

	}


