package ControlStatements;

public class If_cs {

	public static void main(String[] args) 
	{
		
		int mark=45;
		
		//IF control statement
		
		if (mark<=25) 
		{
			System.err.println("Your are pass");
		}

		//IF ELSE control statement
		
		if (mark>=39) 
		{
			System.out.println("You are good");
		}
		
		else 
		{
			
			System.out.println("you are bad");
		}
		
		//ELSE IF statement
		
		if (mark>=66) 
		{
			System.out.println("you got distn");
		}
		
		else if (mark>=50) 
		{
			System.out.println("you are 1st class");
		}
		
		else if (mark>=45) 
		{
		System.out.println("you got 2nd class");	
		}
		else if (mark>=40) 
		{
		System.out.println("you got pass");	
		}
		else 
		{
			System.out.println("you are fail");
		}
		
		// switch case control statement
		
		String month="j";
				
		switch (month) 
		{
		case "Jan":
			System.out.println("Month is 1");
		break;
		
		case "Jul":
			System.out.println("Month is 7");
		break;
		
		case "Dec":
			System.out.println("Month is 12");
		break;
		}
		
	}

}
