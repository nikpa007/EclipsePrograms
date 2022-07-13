package ControlStatements;

public class ElseIf_study {

	public static void main(String[] args) {
		//if your marks are >=70 ---- you are dist
		//elseif your marks are >=60 & <70 --- you are first class
		//elseif your marks are >=60 & <55 --- you are second class
		//elseif your marks are >=55 & <45 ---you are just pass
		//else --- you are fail

		int marks=44;
		
		if (marks>=70) 
		{
		System.out.println("You are in distinction");	
		}
		
		else if (marks>=60 & marks<70) 
		{
		System.out.println("You are in first class");	
		}
		
		else if (marks>=50 & marks<60) 
		{
		System.out.println("You are in second class");	
		}
		
		else if (marks>=45 & marks<55) 
		{
		System.out.println("You are just pass");	
		}
		
		else {
			System.out.println("You are fail");
		}
	}

}
