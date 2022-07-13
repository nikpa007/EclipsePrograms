package Logical_Program;

import java.util.Scanner;

public class ReverseMiddleString {

	public static void main(String[] args)
	{

		
          String a="My Name Is Nikhil";
          	
          // even place reverse
          
          String[] ar = a.split(" ");
          
          // ar[]={"My","Name","Is","Nikhil"}
          //         1    2      3     4
          //         0    1      2     3
          
          for(int i=0;i<=ar.length-1;i++)//0
          {      	  
        	  if(i%2!=0) //odd
        	  {
        		 String s=ar[i];
        		 ar[i]=reverse(s);
        	  }
        	  
          }
          
          for(int i=0;i<=ar.length-1;i++)
          {
        	  System.out.println(ar[i]);
          }
          
          
          
	}
	
	public static String reverse(String inp)
	{
		String rev="";
		for(int i=inp.length()-1;i>=0;i--)
		{
			rev=rev+inp.charAt(i);
		}
		
		return rev;
		
	}

}
