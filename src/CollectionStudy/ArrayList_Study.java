package CollectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Study {

	public static void main(String[] args) 
	{
		//First we have to Create  object for ArrayList
		//ArrayList  is a Implemention Class for List Interface
		
		
		
		ArrayList al= new ArrayList();
		System.out.println("=====First Method=====");
		al.add("Windows");
		al.add("Version");
		al.add('C');
		al.add(null);
		al.add(null);
		al.add(10.3);
		al.add(true);
		
		System.out.println(al);
		System.out.println("By using size() = "+al.size());
		System.out.println("By using isEmpty() = "+al.isEmpty());
		System.out.println("By using get() = "+al.get(5));
		System.out.println("By using contains() = "+al.contains("Version"));
		System.out.println("By using indexOf() = "+al.indexOf(null));
		System.out.println("By using remove() = "+al.remove(4));
		System.out.println(al);
		al.add(5, 10.33);
		System.out.println(al);
		
		
		System.out.println("======Second Method======");

		//1.For Loop
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		//Cursor 
		//2.Iterator()
		System.err.println("=======================");
	      Iterator it = al.iterator();
	      
	      while(it.hasNext())
	      {
	    	  System.out.println(it.next());
	      }
	
	    //3.ListIterator
	      System.out.println("======================");
	      ListIterator lt = al.listIterator();
	      
	      while(lt.hasNext())
	      {
	    	  System.out.println(lt.next());
	      }
	
	      System.out.println("======================");
	      
	      //4.By using ForEach Loop
	      
	      for(Object p:al)
	      {
	    	  System.out.println(p);
	      }

	      System.out.println("=================================");
	      //By using non generic method
	      
	      ArrayList<String> dc=new ArrayList<>();
	      
	      dc.add("ArrayList = ");
	      dc.add("By");
	      dc.add("Using");
	      dc.add("String");
	      dc.add("As");
	      dc.add("NonGeneric");
	      dc.add("Method");
	      System.out.println(dc);

	      //For Each Loop
	      	      
	      System.out.println("=================================");
	      for(String d:dc)
	      {
	    	  System.out.print(d+" ");
	    	  
	      }
	      System.out.println();
	      System.out.println("=============================");
	      
	      ArrayList<Character> ff= new ArrayList<>();
	      
	      ff.add('L');
	      ff.add('A');
	      ff.add('S');
	      ff.add('T');
	      ff.add('R');
	      ff.add('I');
	      ff.add('D');
	      ff.add('E');
	      
	      System.out.println(ff);
	      
	      //For Each Loop
	      
	      System.out.println("=============For Each Loop=============");
	      for(Character f:ff)
	      {
	    	  System.out.println(f);
	      }
	}

}
