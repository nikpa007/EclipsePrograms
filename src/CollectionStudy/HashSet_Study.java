package CollectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Study {

	public static void main(String[] args) 
	{
		
		HashSet hs= new HashSet();
		
		hs.add("Nik");
		hs.add("Nik");
		hs.add(null);
		hs.add(1234);
		hs.add(12.1212);
		hs.add(null);
		hs.add(true);
		hs.add(false);
		hs.add('H');
		hs.add('S');
		System.out.println("========================================");
		System.out.println(hs);
		System.out.println("========================================");
		System.out.println(hs.size());
		System.out.println(hs.clone());
		System.out.println(hs.contains(1234));
		//System.out.println(hs.remove(1));
		//System.out.println(hs);
		System.out.println("========================================");

		//for loop
		
//		for(int i=1;i<=hs.size()-1;i++)
//		{
//			System.out.println();
//		}
	
		//for each
		
		for(Object h:hs)
		{
			System.out.println(h);
		}
		System.out.println("========================================");

		
		//Iterator
		Iterator it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Non-Generic---- Char
		
		HashSet<Character> ct=  new HashSet<>();
		
		ct.add('H');
		ct.add('A');
		ct.add('A');
		ct.add('S');
		ct.add('H');
		ct.add('S');
		ct.add('E');
		ct.add('T');
		System.out.println(ct);
		System.out.println("========================================");
		System.out.println(ct.contains('A'));
		System.out.println(ct.isEmpty());
		System.out.println(ct.size());
		System.out.println(ct.equals('S'));
		System.out.println("========================================");

		//for loop
		
		for(int k=1;k<=ct.size()-1;k++)
		{
			System.out.println(ct);
		}
		
		System.out.println("========================================");

		//for each
		
		for(Character p:ct)
		{
			System.out.println(p);
		}
		System.out.println("========================================");

	}

}
