package stringMethds;

public class AllStringMethods {

	public static void main(String[] args) {
		String s1="Manisha";
		System.out.println(s1.length());
		
		String s2="";
		System.out.println(s2.isEmpty());
		
		String s3=" ";
		System.out.println(s3.isBlank());
		
		String s4="manisha";
		System.out.println(s4.toUpperCase());
		
		String s5="MANISHA";
		System.out.println(s5.toLowerCase());
		
		String s6 = "Manisha";
		boolean s7= s6.startsWith("Hi");
		System.out.println(s7);
		
		String s8="Manisha";
		boolean s22=s8.endsWith("Bye");
		System.out.println(s22);
		
		String s9="Manisha";
		String s10="Patil";
		System.out.println(s9.concat(s10));
		
		String s11="Good Morning";
		System.out.println(s11.indexOf("M"));
		
		String s12="Good Morning";
		System.out.println(s12.lastIndexOf("g"));
		
		String s13="Vande Mataram";
		System.out.println(s13.charAt(8));
		
		String s14="Jay Hindi";
		System.out.println(s14.substring(7));
		
		String s15="My name is Manisha";
		System.out.println(s15.substring(3,12));
		
		String s16="pune";
		String s17="pune";
		System.out.println(s16.equals(s17));
		
		String s18="MUMBAI";
		String s19="mumbai";
		System.out.println(s18.equalsIgnoreCase(s19));
		
		String s20="Good Morning";
		System.out.println(s20.replace("Hi", "Manisha"));
		
		String s21="Good Evening";
		System.out.println(s21.trim());
		
		String s23="I am form pune";
		boolean s24=s23.contains("pune");
		System.out.println(s24);
		
		
		
	}

}
