package stringStudy;

public class String_Study1 {

	public static void main(String[] args) 
	{
		
		//lenght() method use
		// return type is int
		
		String name="velocity";
		String name1="VELOCITY";
		
		int nk=name.length();
		
		System.out.println(nk);
		
		System.out.println(name.length());
		System.out.println("=============");
		
		//toUppercase()
		//return type is string
		
		String ck=name.toUpperCase();
		
		System.out.println(ck);
		System.out.println(name.toUpperCase());
		System.out.println("=============");
		
		//toLowewrcase()
		//return type is string
		
		String pk=name1.toLowerCase();
		
		System.out.println(pk);
		System.out.println("=============");
		
		//equal()
		//return type is boolean cond
		
		String a="abc";
		String b="abc";
		String b1="Abc";
		String c=new String("ABC");
		String d=new String("ABC");
		
		System.out.println(a==b1);
		System.out.println(c==d);
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println("=============");
		
		
		//equalsIgnore()
		
		String place="Pune";
		String dist="Pune";
		String tal="pune";
		
		System.out.println(place.equalsIgnoreCase(dist));
		System.out.println("=============");
		
		//contains()
		
		String location="Jalgaon";
		
		System.out.println(location.contains("n"));
		System.out.println("=============");
		
		//isEmpty() method use

		String p="Test";
		String q=" ";
		String g="";
		String r=null;
		String f="A";
		
		
		
		
		System.out.println(q.length());
		System.out.println(g.isEmpty());
		System.out.println(q.isEmpty());
		//System.out.println(r.isEmpty());
		System.out.println(q.isBlank());
		System.out.println(f.isBlank());
		System.out.println("=============");
		
		// charAt method use
		// M U M B A I ---> SQU OF CHAR
		// 0 1 2 3 4 5 ---> INDEX NO
		// return type char
		
		String place1="MUMBAI";
		
		System.out.println(place1.charAt(3));
		
		//
				
		
		
		
		
		
		
		
		
		
		
		

	}

}
