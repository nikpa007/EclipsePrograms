package Method;

public class Method03 {
	
	public static void main(String[] args) {
		
		Parameter lol= new Parameter();
		Parameter.sub1(12.3, 15.2, 2.2);
		
		//classname objname= new classname();
		//obj.methodname();
		
		
		
		Method03 software= new Method03();
		
		software.velocity();
		
		Method03 nnn= new Method03();
		nnn.wan("nnn", 1033, 12.336d);
		
		
		Method04 sd= new Method04();
		
		Method03 akk= new Method03();
		akk.kk();
		
		sd.studentinfo("Kewi",10,'B',84.25);
		
		Method04 mclass= new Method04();
		
		mclass.master();
		
		Method04.mmm();
		
		Method03.testing();
		
		Method02.stat();
		
		Method02 all= new Method02();
		
		all.group();
		
		Method04 kbcc= new Method04();
		
		kbcc.kbc();
		
		Method03 mhj= new Method03();
		
		mhj.velocity();
		
		Method03.testing();
		
		Method03 nik= new Method03();
		nik.kk();
		
 testing();
		
	}

	public static void testing()
	{
		String Groupname="velocity";
		
	System.out.println("Its testing group "+Groupname);
	}
	
	public void velocity() 
	{
		System.out.println("Velocity Group");
	}
	public void kk()
	{
		String ak="akki";
		int dob=1988;
		double weight=82.7;
		
		System.out.println("AK means "+ak);
		System.out.println("His dob is "+dob);
		System.out.println("His weight is "+weight);
	}
	public void wan(String mname,int date,double mass)
	{
		System.out.println("Its name is "+mname);
		System.out.println("Its date is "+date);
		System.out.println("Its mass is "+mass);
	}
}
