package stringStudy;

public class String_MethodStudy {

	public static void main(String[] args) 
	{
		
		//1.length method use
		//veera = 5 is lenght & its output will be in int
		
		String name="veera";
		String name1="VEERA";
		
		int lenghtofstring=name.length();
		
		System.out.println(lenghtofstring);//=5
		System.out.println(name.length());//=5
		
		System.out.println("===============");
		
		//2.toUppercase method use
		// its return type is in string
		
		System.out.println(name);//veera
		System.out.println(name.toUpperCase());//VEERA
		
		System.out.println("===============");
		
		//3.toLowwercase method use
		// its return type is in string
		
		System.out.println(name1);//VEERA
		System.out.println(name1.toLowerCase());//veera
		System.out.println("===============");
		
		//4.equals method use
		
		String a="Pune";
		String b="Pune";
		String c= new String("Pune");
		String d= new String("Pune");
		String e= new String("PUNE");
		//== compare the memory location of two operands
		//equals method compares character sequence of two objects
		// checking character sequence along with case sensitivity
	    //its return type is in boolean
		
		System.out.println(a==b);//true
		System.out.println(a==c);//false
		System.out.println(a.equals(b));//true
		System.out.println(a.equals(c));//true
		System.out.println(c.equals(e));//false
		System.out.println("===============");
		
		//5.equalsIgnorecase method use
		// when both string are not equal & its case sensitive
		//Return type is boolean
		
		String city="Jalgaon";
		String location="Jalgaon";
		String dist="jalgaon";
		
		System.out.println(city.equalsIgnoreCase(name));//here name = veera;
		System.out.println(location.equalsIgnoreCase(dist));//true
		System.out.println("===============");
		
		//6.contains method use
		//its return type is boolean
		
		String place="Shinhgad";
		
		System.out.println(place.contains("gad"));// true
		System.out.println(place.contains("gd"));//false
		System.out.println("===============");
		
		//7.charAT method use
		
		String season="SUMMER";
		//S U M M E R ----> Character sequence
		//0 1 2 3 4 5 ----> indexing number
		//return type is char
		
		System.out.println(season.charAt(5));//=R
		//System.out.println(season.charAt(-1));//java.lang.StringIndexOutOfBoundsException
		System.out.println("===============");
		
		//8.startsWith method use
		//Return type is boolean
		//D E C E M B E R
		//1 2 3 4 5 6 7 8
		String month="DECEMBER";
		
		System.out.println(month.startsWith("DE",0));//True
		System.out.println(month.startsWith("CEM"));//False
		System.out.println("===============");
		
		//9.endsWith method use 
		//Return type is boolean
		
		String MI="MUMBAIINDIANS";
		
		System.out.println(MI.endsWith("IAN"));//False
		System.out.println(MI.endsWith("ANS"));//True
		
		
		
		
	
	
	
	
	
	}
	
	
	

}
