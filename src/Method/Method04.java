package Method;

public class Method04 {


public void master() {

	
	System.out.println("This is my 3rd method program name as master");
}

public static void mmm()

{
System.out.println("My 4th static program of method name as mmm");	
}
 public void studentinfo(String studentnam,int rollnum,char grade,double mark) 

{
	System.out.println("Student name is"+studentnam);
	System.out.println("Rollnum name is"+rollnum);
	System.out.println("Grade  is"+grade);
	System.out.println("Student percantage is"+mark);
}
public void kbc()
{
System.out.println("kbc");	
}
public void abc()
{
	System.out.println("This is my 1st method program name is abc");
}

public static void main(String[] args)

{
	Parameter lk= new Parameter();
	lk.pk("Shivaji University",1994,'A');
	
	String city;
	
	city="pune";
	
	System.out.println("This is my city name = "+city);
	
	int pincode;
	
	pincode=411051;
	
	System.out.println("Pincode of my city is = "+pincode);
	
	char blockno;
	
	blockno='B';
	
	System.out.println("This is my flat block no = "+blockno);
	
	boolean result;
	
	result=true;
	
	System.out.println("My result is = "+result);
	
	long number;
	
	number=1023546952;
	
	System.out.println(number);
}



}



