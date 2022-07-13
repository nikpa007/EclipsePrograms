package stringStudy;

public class String_All_Method_Study {

	public static void main(String[] args) {
//lenght()		
		String p="Pune";
		
		System.out.println("Lenght of pune is = "+p.length());
		
System.out.println("================================");
//toUppercase()

String k="rainbow";

System.out.println(k.toUpperCase());

System.out.println("=================================");
//toLowercase()

String l="LAPTOP";

System.out.println(l.toLowerCase());

System.out.println("================================");
//== method-->check memory location-->without new keyword

String a="Veera";

String b="Veera";

System.out.println("== check the memory location  = "+a.equals(b));

System.out.println("================================");
//equals method-->check char seq-->with new keyword

String c= new String("Veera");

String d= new String("veera");

String e= new String("Veera");

String f= new String("Jeera");

System.out.println(c.equals(d));

System.out.println("It check the character sequence = "+c.equals(e));

System.out.println("================================");
//equalsIgnore()

System.out.println("In this it ignores char lower case = "+c.equalsIgnoreCase(e));

System.out.println("In this it ignores memory location of variable = "+a.equalsIgnoreCase(c));

System.out.println("But it doesnot ignore if the variable name is different = "+c.equalsIgnoreCase(f));
System.out.println("================================");
//contains()

String g="Kenstar";

System.out.println("This check the char sequence from start char = "+g.contains("st"));

System.out.println(g.contains("ra"));

System.out.println(g.contains("nsta"));
System.out.println("================================");
//isEmpty() & isBlank()

String o=" ";
String oi="";
String oiu=null;

System.out.println("Here o is not empty bcoz it has space which consider as length=1 "+o.isEmpty());
System.out.println(o.length());
System.out.println("Here for oi there is no any space so its value will be true = "+oi.isEmpty());

System.out.println("Isblank is applicable for o bcoz there is no any char in  = " +o.isBlank());
System.out.println("================================");

//charAt()
// O n i d a
// 0 1 2 3 4 

String Akai="Onida";

System.out.println("Here it check the char index no & print that index number char = "+Akai.charAt(3));
System.out.println("================================");

//startsWith() & endsWith()

String Divine="GullyGang";

System.out.println(Divine.startsWith("Gan"));
System.out.println("Here it check char sequence from starting char =  "+Divine.startsWith("Gull"));
System.out.println(Divine.startsWith("G", 0));

System.out.println("Here it check the char squence from end of char = "+Divine.endsWith("ang"));
System.out.println("================================");	
	
//concat()

String place="Pune";
String state=" Maharashtra";
String nativeplace=" Jalgaon";

System.out.println(place.concat(state));
System.err.println(state.concat(nativeplace).concat(" Jamner"));
System.out.println("================================");

//indexOf()
//B o l l y w o o d
//0 1 2 3 4 5 6 7 8

String movies="Bollywood";

System.out.println("Here it shows specific char as per index number from starting sequence = "+movies.indexOf("l"));
System.out.println(movies.indexOf("l", 3));
	
	
	}
	
	

}
