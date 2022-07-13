package star_pattern;

public class Eg7 {

	public static void main(String[] args) {
//	1	//*
//	2	//**
//	3	//***
//	4	//****
//	5	//*****
//	6	//****
//	7	//***
//	8	//**
//	9	//*
		
		//row=9
		
		int star=1;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<=4)
			{
				star++;
			}
			else
			{
				star--;
			}
		}

	}

}
