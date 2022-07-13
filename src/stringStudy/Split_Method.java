package stringStudy;

public class Split_Method {

	public static void main(String[] args) 
	{
		//By using regex as blank space " "
		// MUMBAI INDIANS VS CHENNAI SUPERKING
		
		String IPL="MUMBAI INDIANS VS CHENNAI SUPERKING";
		
		String MI[]= IPL.split(" ");
		
		for(int i=0;i<=MI.length-1;i++) 
		{
			System.out.print(MI[i]+" ");
		}
	
		System.out.println("====================================");
		//By using regex as underscore _
		
		String k="THIS_IS_MY_COUNTRY";
		
		String n[]= k.split("_");
		
		for(int i=0;i<=n.length-1;i++) 
		{
			System.out.print(n[i]+" ");
			
		}
	
		System.out.println();
		System.out.println("===================");
	
	
	
	}

}
